/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homecontroller;

import dal.UserDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Trung
 */
public class UserController extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        String action = request.getParameter("action");
        
        if(action.equals("login")){
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            String remember = request.getParameter("remember");
            UserDBContext dao = new UserDBContext();
            model.User user = dao.checkUser(email, pass);
            if(user == null){
//                request.setAttribute("error", "Tai khoan khong ton tai !");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }else{
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                Cookie user_email = new Cookie("user_email", email);
                Cookie user_pass = new Cookie("user_pass", pass);
                Cookie rem = new Cookie("rem", remember);
                if(remember!= null){
                    user_email.setMaxAge(60 * 60 * 24 * 30); // sống trong 60 giây , 60 phút, 24 giờ, 30 ngày 
                    user_pass.setMaxAge(60 * 60 * 24 * 3);
                    rem.setMaxAge(60 * 60 * 24 * 30);
                }else{
                    user_email.setMaxAge(0); // reset cookie về 0 
                    user_pass.setMaxAge(0);
                    rem.setMaxAge(0);
                }
                response.addCookie(user_email);
                response.addCookie(user_pass);
                response.addCookie(rem);
                response.sendRedirect("home");
                
            }
        }
        
        if(action.equals("logout")){
            HttpSession session = request.getSession();
            session.removeAttribute("user");
            response.sendRedirect("login.jsp");
        }
        
        if(action.equals("register")){
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            String repass = request.getParameter("repass");
            UserDBContext dao = new UserDBContext();
            model.User user = dao.checkMail(email);
            if(!pass.equals(repass)){
                request.setAttribute("pass", "Mat khau khong khop");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }else{
              if(user != null){
                request.setAttribute("mailerror", "Email da ton tai !");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }else{
                dao.Signup(name, email, pass);
                response.sendRedirect("login.jsp");
            }  
            }
            
            
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
