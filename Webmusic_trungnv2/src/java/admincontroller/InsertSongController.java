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
public class InsertSongController extends HttpServlet {

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
        
        SingerDBContext db = new SingerDBContext();
        ArrayList<Singer> singers = db.getSingers();
        request.setAttribute("singers", singers);
        
        GenreDBContext gdb = new GenreDBContext();
        ArrayList<Genre> genres = gdb.getGenres();
        request.setAttribute("genres", genres);
        request.getRequestDispatcher("../../admin/newsong.jsp").forward(request, response);
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
        s.setLinksong("music/" + request.getParameter("linksong"));
        s.setDescription(request.getParameter("description"));
        
        String[] sis = request.getParameterValues("id_singer");
        if (sis!=null) {
            for (String si : sis) {
                Singer sing = new Singer();
                sing.setId_singer(si);
                s.getSingers().add(sing);
            }
        }
        String[] ges = request.getParameterValues("id_genre");
        if (ges!=null) {
            for (String ge : ges) {
                Genre g = new Genre();
                g.setId_genre(ge);
                s.getGenres().add(g);
            }
        }
        
        SongDBContext db = new SongDBContext();
        db.insert(s);
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
