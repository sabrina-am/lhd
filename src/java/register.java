/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo ideapad 320
 */
public class register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest r, HttpServletResponse s)
            throws ServletException, IOException {
        String nom= r.getParameter("nom");
        String prenom= r.getParameter("prenom");
        String username= r.getParameter("username");
        String email =r.getParameter("email");
        String password= r.getParameter("password");

        PrintWriter p= s.getWriter();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c;
            c= DriverManager.getConnection("jdbc:mysql://localhost/hack", "root", "");
            Statement ss;
            ss = c.createStatement();
          
            ss.executeUpdate("INSERT INTO client VALUES (NULL,'"+nom+"','"+prenom+"','"+username+"','"+email+"','"+password+"',NULL)");
            s.sendRedirect("index.jsp");
                                           


        
        }
        catch(Exception e)
        {p.print(e);}  
    }


}
