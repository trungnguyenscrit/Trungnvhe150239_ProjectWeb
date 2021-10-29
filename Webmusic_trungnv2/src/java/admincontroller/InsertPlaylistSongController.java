/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admincontroller;

import dal.PlaylistSongDBContext;
import dal.SongDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Playlist;
import model.Song;

/**
 *
 * @author Trung
 */
public class InsertPlaylistSongController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        SongDBContext sdb = new SongDBContext();
        ArrayList<Song> songs = sdb.getSongs();
        request.setAttribute("songs", songs);
        request.getRequestDispatcher("../../admin/newplaylistsong.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        model.User user = (model.User) session.getAttribute("user");
        int id_usercreate = user.getUser_id();
        
        Playlist p = new Playlist();
        p.setName_playlist(request.getParameter("name"));
        p.setDescription(request.getParameter("description"));
        p.setId_playlist(id_usercreate);
        String[] sos = request.getParameterValues("id_song");
        if (sos!=null) {
            for (String so : sos) {
                Song s = new Song();
                s.setId_song(so);
                p.getSongs().add(s);
            }
        }
         PlaylistSongDBContext db = new PlaylistSongDBContext();
         db.insert(p);
         response.sendRedirect("list");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
