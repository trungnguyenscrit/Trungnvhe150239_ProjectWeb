/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admincontroller;

import dal.AlbumDBContext;
import dal.GenreDBContext;
import dal.SingerDBContext;
import dal.SongDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author Trung
 */
public class Dashboard extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        SongDBContext db = new SongDBContext();
        int countSong = db.getCountSong();
        request.setAttribute("countSong", countSong);
        
        SingerDBContext sdb = new SingerDBContext();
        int countSinger = sdb.getCountSinger();
        request.setAttribute("countSinger", countSinger);
        
        GenreDBContext gdb = new GenreDBContext();
        int countGenre = gdb.getCountGenre();
        request.setAttribute("countGenre", countGenre);
        
        AlbumDBContext adb = new AlbumDBContext();
        int countAlbum = adb.getCountAlbum();
        request.setAttribute("countAlbum", countAlbum);
        
        HttpSession session = request.getSession();
        model.User user = (User) session.getAttribute("user");
        try {
            if (user.getRole().equalsIgnoreCase("true")) {
                request.getRequestDispatcher("admin/index.jsp").forward(request, response);
            } else {
                response.sendRedirect("home");
            }
        } catch (Exception e) {
            response.sendRedirect("home");
        }

    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
