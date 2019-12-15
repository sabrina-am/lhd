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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo ideapad 320
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest r, HttpServletResponse s)
            throws ServletException, IOException {
        String user = r.getParameter("username");
        String pwd = r.getParameter("password");
        try{ 
            PrintWriter p = s.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            Connection c;
            c= DriverManager.getConnection("jdbc:mysql://localhost/hack", "root", "");
            Statement f=c.createStatement();
            ResultSet rs =f.executeQuery("select  DISTINCT user_cl,mot_passe_cl from client");
            while(rs.next())
           {
           if(user.equals(rs.getString(1))&& pwd.equals (rs.getString(2)))
            {
                HttpSession session=r.getSession();
                session.setAttribute("username",user)  ; 
                RequestDispatcher rd=r.getRequestDispatcher("index.jsp");
              rd.forward(r, s);
            }
                      
           }
              RequestDispatcher rd=r.getRequestDispatcher("login.jsp");
              rd.forward(r, s);
        }catch (Exception e) { e.printStackTrace();}
    
    }


}
