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
import model.Playlist;
import model.Song;

/**
 *
 * @author Trung
 */
public class UpdatePlaylistSongController extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id_playlist"));
        PlaylistSongDBContext db = new PlaylistSongDBContext();
        Playlist playListSong = db.getPlayListSong(id);
        request.setAttribute("playListSong", playListSong);
        
        SongDBContext sdb = new SongDBContext();
        ArrayList<Song> allsongs = sdb.getSongs();
        
        request.setAttribute("allsongs", allsongs);
        
        request.getRequestDispatcher("../../admin/updateplaylistsong.jsp").forward(request, response);
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
        Playlist p = new Playlist();
        p.setId_playlist(Integer.parseInt(request.getParameter("id_playlist")));
        p.setName_playlist(request.getParameter("name_playlist"));
        p.setDescription(request.getParameter("description"));
        
        String[] songs = request.getParameterValues("id_song");
        if (songs!=null) {
            for (String song : songs) {
                Song so = new Song();
                so.setId_song(song);
                p.getSongs().add(so);
            }
        }
        
        PlaylistSongDBContext pdb = new PlaylistSongDBContext();
        pdb.updatePlaylistSong(p);
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
