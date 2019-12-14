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
public class addcart extends HttpServlet {

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
           //Récupération de l’objet session
           HttpSession session = r.getSession(true);
           //Récupération du panier dans la session ou création si premier appel et n’existe pas
           Integer panier = (Integer)session.getAttribute("MonPanier");  
           if (panier == null) {
                session.setAttribute("MonPanier", panier);
           }
           //Récupération de choix et ajout dans le panier
           String id=r.getParameter("id");
           String quantity= r.getParameter("quantity");
           String se= r.getParameter("se");
           PrintWriter p= s.getWriter();
           
           if(se.equalsIgnoreCase("")==true){
                         

                                 s.sendRedirect("login.jsp");

           }
    
           
           try{
                        

                  Class.forName("com.mysql.jdbc.Driver");
                  Connection c;
                  c= DriverManager.getConnection("jdbc:mysql://localhost/hack", "root", "");
                  Statement ss;
                  ss = c.createStatement();
                  ss.executeUpdate("INSERT INTO panier (id_panier,id_produit,quantite_pr,user_cl)VALUES (NULL,'"+id+"','"+quantity+"','"+se+"')");
                  s.sendRedirect("product-single.jsp?&id="+id);
                    ss.close();
                    c.close();
           }
          catch(Exception e){
              p.print(e);
          }
    }
}
