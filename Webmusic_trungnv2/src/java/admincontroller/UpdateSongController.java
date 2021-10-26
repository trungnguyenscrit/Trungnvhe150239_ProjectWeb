/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admincontroller;

import dal.GenreDBContext;
import dal.SingerDBContext;
import dal.SongDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Genre;
import model.Singer;
import model.Song;

/**
 *
 * @author Trung
 */
public class UpdateSongController extends HttpServlet {

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
        
        String id = request.getParameter("id_song");
        SongDBContext db = new SongDBContext();
        Song songs = db.getSong(id);
        request.setAttribute("songs", songs);
        
        SingerDBContext sdb = new SingerDBContext();
        ArrayList<Singer> allsingers = sdb.getSingers();
        request.setAttribute("allsingers", allsingers);
        
        GenreDBContext gdb = new GenreDBContext();
        ArrayList<Genre> allgenres = gdb.getGenres();
        request.setAttribute("allgenres", allgenres);
        
        request.getRequestDispatcher("../../admin/updatesong.jsp").forward(request, response);
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
        
        Song s = new Song();
        s.setId_song(request.getParameter("id_song"));
        s.setName(request.getParameter("name"));
        s.setPoster(request.getParameter("poster"));
        s.setLinksong(request.getParameter("linksong"));
        s.setDescription(request.getParameter("description"));
        
        String[] gens = request.getParameterValues("id_genre");
        if (gens!=null) {
            for (String gen : gens) {
                Genre g = new Genre();
                g.setId_genre(gen);
                s.getGenres().add(g);
            }
        }
        
        String[] sings = request.getParameterValues("id_singer");
        if (sings!=null) {
            for (String sing : sings) {
                Singer si = new Singer();
                si.setId_singer(sing);
                s.getSingers().add(si);
            }
        }
        
        SongDBContext sdb = new SongDBContext();
        sdb.update(s);
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
