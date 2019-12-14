package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.io.PrintWriter;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>Taklidi</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    \n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  </head>\n");
      out.write("  <body class=\"goto-here\">\n");
      out.write("       ");

            PrintWriter p= response.getWriter();          
            String id=request.getParameter("id");
            Class.forName("com.mysql.jdbc.Driver");
            Connection c;
            c= DriverManager.getConnection("jdbc:mysql://localhost/hack", "root", "");
            Statement f=c.createStatement();
            ResultSet g =f.executeQuery("select  DISTINCT count(*) nbr from panier");
            //Récupération du panier dans la session ou création si premier appel et n’existe pas
                  
      
      out.write("\n");
      out.write("\t\t<div class=\"py-1 bg-primary\">\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("    \t\t<div class=\"row no-gutters d-flex align-items-start align-items-center px-md-0\">\n");
      out.write("\t    \t\t<div class=\"col-lg-12 d-block\">\n");
      out.write("\t\t    \t\t<div class=\"row d-flex\">\n");
      out.write("\t\t    \t\t\t<div class=\"col-md pr-4 d-flex topper align-items-center\">\n");
      out.write("\t\t\t\t\t    \t<div class=\"icon mr-2 d-flex justify-content-center align-items-center\"><span class=\"icon-phone2\"></span></div>\n");
      out.write("\t\t\t\t\t\t    <span class=\"text\">+213 21 24 58 69</span>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <div class=\"col-md pr-4 d-flex topper align-items-center\">\n");
      out.write("\t\t\t\t\t    \t<div class=\"col-md-5 pr-4 d-flex topper align-items-center text-lg-right\"></div>\n");
      out.write("\t\t\t\t\t\t    <span class=\"text\"></span>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-5 pr-4 d-flex topper align-items-center text-lg-right\">\n");
      out.write("\t\t\t\t\t\t    <span class=\"text\">contact@taklidi.com</span>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t  </div>\n");
      out.write("    </div>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\n");
      out.write("\t    <div class=\"container\">\n");
      out.write("\t      <a class=\"navbar-brand\" href=\"index.jsp\">Taklidi</a>\n");
      out.write("\t      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t        <span class=\"oi oi-menu\"></span> Menu\n");
      out.write("\t      </button>\n");
      out.write("\n");
      out.write("\t      <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n");
      out.write("\t        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t          <li class=\"nav-item active\"><a href=\"index.jsp\" class=\"nav-link\">Accueil</a></li>\n");
      out.write("\t          <li class=\"nav-item dropdown\">\n");
      out.write("                     <a class=\"nav-link dropdown-toggle\" href=\"shop.jsp\" id=\"dropdown04\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Produits</a>\n");
      out.write("                         <div class=\"dropdown-menu\" aria-labelledby=\"dropdown04\">\n");
      out.write("                        \t<a class=\"dropdown-item\" href=\"shop.jsp?&categorie='tapis'\">Tapis</a>\n");
      out.write("                        \t<a class=\"dropdown-item\" href=\"shop.jsp?&categorie='vetement'\">Vetements</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=shop.jsp?&categorie='gateau'>Gateaux</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=shop.jsp?&categorie='bijou'>Bijoux</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=shop.jsp?&categorie='poterie'>Poteries</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=shop.jsp?&categorie='vannerie'>Vanneries</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=shop.jsp?&categorie='broderie'>Broderies</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=shop.jsp?&categorie='dinanderie'>Dinanderies</a>\n");
      out.write("                        </div>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Personnaliser</a></li>\n");
      out.write("                  <li class=\"nav-item dropdown\">\n");
      out.write("                     <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown04\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Cours</a>\n");
      out.write("                         <div class=\"dropdown-menu\" aria-labelledby=\"dropdown04\">\n");
      out.write("                        \t<a class=\"dropdown-item\" href=\"#\">Tapis</a>\n");
      out.write("                        \t<a class=\"dropdown-item\" href=\"#\">Vetements</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Gateaux</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Bijoux</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Poteries</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Vanneries</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Broderies</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Dinanderies</a>\n");
      out.write("                        </div>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Personnaliser</a></li>\n");
      out.write("\t          <li class=\"nav-item\"><a href=\"about.html\" class=\"nav-link\">A propos</a></li>\n");
      out.write("\t          <li class=\"nav-item\"><a href=\"blog.html\" class=\"nav-link\">Blog</a></li>\n");
      out.write("\t          <li class=\"nav-item\"><a href=\"contact.html\" class=\"nav-link\">Contact</a></li>\n");
      out.write("\t          <li class=\"nav-item cta cta-colored\">\n");
      out.write("                      <a href=\"cart.jsp\" class=\"nav-link\">\n");
      out.write("                          <span class=\"icon-shopping_cart\"></span>\n");
      out.write("                          [\n");
      out.write("                          ");
 
                              String panier="0";
                              if(session.getAttribute("username")!=null){
                                    if(g.next()){
                                        panier=g.getString("nbr") ;
      out.write("\n");
      out.write("                          ");
      out.print( panier );
      out.write("\n");
      out.write("                          ");
}}
      out.write("\n");
      out.write("                          ]\n");
      out.write("                       </a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item dropdown\">\n");
      out.write("\t\t\t<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t\tEspace membre\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<div class=\"dropdown-menu\">\n");
      out.write("\t\t\t     <a class=\"dropdown-item\" href=\"register.jsp\">Inscription</a>\n");
      out.write("\t\t             <a class=\"dropdown-item\" href=\"login.jsp\">Connexion</a>\n");
      out.write("                             <form action=\"deconnecter\" methode=\"Get\">\n");
      out.write("                                 <input type=\"submit\" class=\"dropdown-item\" value=\"Deconnecter\">\n");
      out.write("                             </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t          </li> \n");
      out.write("\t        </ul>\n");
      out.write("\t      </div>\n");
      out.write("\t    </div>\n");
      out.write("\t  </nav>\n");
      out.write("    <!-- END nav -->\n");
      out.write("\n");
      out.write("    <section id=\"home-section\" class=\"hero\">\n");
      out.write("\t\t  <div class=\"home-slider owl-carousel\">\n");
      out.write("\t      <div class=\"slider-item\" style=\"background-image: url(images/2.png);\">\n");
      out.write("\t      \t<div class=\"overlay\"></div>\n");
      out.write("\t        <div class=\"container\">\n");
      out.write("\t          <div class=\"row slider-text justify-content-center align-items-center\" data-scrollax-parent=\"true\">\n");
      out.write("\n");
      out.write("\t            <div class=\"col-md-12 ftco-animate text-center\">\n");
      out.write("\t              <h1 class=\"mb-2\">100% Traditionnel</h1>\n");
      out.write("\t              <p><a href=\"about.jsp\" class=\"btn btn-primary\">Voir les details</a></p>\n");
      out.write("\t            </div>\n");
      out.write("\n");
      out.write("\t          </div>\n");
      out.write("\t        </div>\n");
      out.write("\t      </div>\n");
      out.write("\n");
      out.write("\t      <div class=\"slider-item\" style=\"background-image: url(images/1.jpg);\">\n");
      out.write("\t      \t<div class=\"overlay\"></div>\n");
      out.write("\t        <div class=\"container\">\n");
      out.write("\t          <div class=\"row slider-text justify-content-center align-items-center\" data-scrollax-parent=\"true\">\n");
      out.write("\n");
      out.write("\t            <div class=\"col-sm-12 ftco-animate text-center\">\n");
      out.write("\t              <h1 class=\"mb-2\">100% Traditionnel</h1>\n");
      out.write("\t              <!--<h2 class=\"subheading mb-4\">We deliver organic vegetables &amp; fruits</h2>-->\n");
      out.write("\t              <p><a href=\"#\" class=\"btn btn-primary\">Voir les details</a></p>\n");
      out.write("\t            </div>\n");
      out.write("\n");
      out.write("\t          </div>\n");
      out.write("\t        </div>\n");
      out.write("\t      </div>\n");
      out.write("\t\t   <div class=\"slider-item\" style=\"background-image: url(images/3.jpg);\">\n");
      out.write("\t      \t<div class=\"overlay\"></div>\n");
      out.write("\t        <div class=\"container\">\n");
      out.write("\t          <div class=\"row slider-text justify-content-center align-items-center\" data-scrollax-parent=\"true\">\n");
      out.write("\n");
      out.write("\t            <div class=\"col-sm-12 ftco-animate text-center\">\n");
      out.write("\t              <h1 class=\"mb-2\">100% Traditionnel</h1>\n");
      out.write("\t              <!--<h2 class=\"subheading mb-4\">We deliver organic vegetables &amp; fruits</h2>-->\n");
      out.write("\t              <p><a href=\"#\" class=\"btn btn-primary\">Voir les details</a></p>\n");
      out.write("\t            </div>\n");
      out.write("\n");
      out.write("\t          </div>\n");
      out.write("\t        </div>\n");
      out.write("\t      </div>\n");
      out.write("\t    </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"ftco-section\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row no-gutters ftco-services\">\n");
      out.write("          <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n");
      out.write("            <div class=\"media block-6 services mb-md-0 mb-4\">\n");
      out.write("              <div class=\"icon bg-color-1 active d-flex justify-content-center align-items-center mb-2\">\n");
      out.write("            \t\t<span class=\"flaticon-shipped\"></span>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"media-body\">\n");
      out.write("                <h3 class=\"heading\">LAIVRAISON GRATUITE</h3>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>      \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n");
      out.write("            <div class=\"media block-6 services mb-md-0 mb-4\">\n");
      out.write("              <div class=\"icon bg-color-2 d-flex justify-content-center align-items-center mb-2\">\n");
      out.write("            \t\t<span class=\"flaticon-diet\"></span>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"media-body\">\n");
      out.write("                <h3 class=\"heading\">Toujours frais</h3>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>    \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n");
      out.write("            <div class=\"media block-6 services mb-md-0 mb-4\">\n");
      out.write("              <div class=\"icon bg-color-3 d-flex justify-content-center align-items-center mb-2\">\n");
      out.write("            \t\t<span class=\"flaticon-award\"></span>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"media-body\">\n");
      out.write("                <h3 class=\"heading\">QUALITÉ SUPÉRIEURE</h3>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>      \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n");
      out.write("            <div class=\"media block-6 services mb-md-0 mb-4\">\n");
      out.write("              <div class=\"icon bg-color-4 d-flex justify-content-center align-items-center mb-2\">\n");
      out.write("            \t\t<span class=\"flaticon-customer-service\"></span>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"media-body\">\n");
      out.write("                <h3 class=\"heading\">Support 24/7</h3>\n");
      out.write("              </div>\n");
      out.write("            </div>      \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<section class=\"ftco-section ftco-category ftco-no-pt\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 order-md-last align-items-stretch \">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"category-wrap-2 ftco-animate img align-self-stretch align-items-end\" style=\"background-image: url(images/.jpg);\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>Categories</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Differents produits a votre service...</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><a href=\"shop.jsp?&categorie\" class=\"btn btn-primary\">Acheter maintenant</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\" category-wrap ftco-animate img d-flex align-items-end\" style=\"background-image: url(images/product-3.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text px-3 py-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 class=\"mb-0\"><a href=\"#\">Tapis</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\" category-wrap ftco-animate img d-flex align-items-end\" style=\"background-image: url(images/product-1.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text px-3 py-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 class=\"mb-0\"><a href=\"#\">Poteries</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"category-wrap ftco-animate img mb-4 d-flex align-items-end\" style=\"background-image: url(images/1.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text px-3 py-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 class=\"mb-0\"><a href=\"#\">Vetements</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"category-wrap ftco-animate img d-flex align-items-end\" style=\"background-image: url(images/2.png);\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text px-3 py-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 class=\"mb-0\"><a href=\"#\">Bijoux</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\" category-wrap ftco-animate img d-flex align-items-end\" style=\"background-image: url(images/product-2.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text px-3 py-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 class=\"mb-0\"><a href=\"#\">Broderies</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-wrap ftco-animate img mb-4 d-flex align-items-end\" style=\"background-image: url(images/3.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"text px-3 py-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2 class=\"mb-0\"><a href=\"#\">Vanneries</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-wrap ftco-animate img d-flex align-items-end\" style=\"background-image: url(images/4.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"text px-3 py-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2 class=\"mb-0\"><a href=\"#\">Gateaux</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t<div class=\" category-wrap ftco-animate img d-flex align-items-end\" style=\"background-image: url(images/product-11.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text px-3 py-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"mb-0\"><a href=\"#\">Didanderies</a></h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("    <section class=\"ftco-section\">\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row justify-content-center mb-3 pb-3\">\n");
      out.write("          <div class=\"col-md-12 heading-section text-center ftco-animate\">\n");
      out.write("          \t<span class=\"subheading\">Produits recommendee</span>\n");
      out.write("            <h2 class=\"mb-4\">Nos Produits</h2>\n");
      out.write("            <p></p>\n");
      out.write("          </div>\n");
      out.write("        </div>   \t\t\n");
      out.write("    \t</div>\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("    \t\t<div class=\"row\">\n");
      out.write("                    ");

                        ResultSet r =f.executeQuery("select DISTINCT image_pr,nom_pr,prix_pr,id_produit,rating FROM produit ORDER BY rating DESC LIMIT 8");
                        while (r.next()){                                                
                           byte[] imgData = r.getBytes("image_pr"); 
                           request.setAttribute("rvi", "Ravinath");
                           r.getString("image_pr");
                           String encode = Base64.getEncoder().encodeToString(imgData);    
                          
                    
      out.write("\n");
      out.write("    \t\t\t<div class=\"col-md-6 col-lg-3 ftco-animate\">\n");
      out.write("    \t\t\t\t<div class=\"product\">\n");
      out.write("    \t\t\t\t\t<a href=\"product-single.jsp?&id=");
      out.print(r.getString("id_produit") );
      out.write("\" class=\"img-prod\"><img Style=\"width:500px;height:300px\" class=\"img-fluid\" src=\"data:image/jpeg;base64,");
      out.print(encode );
      out.write("\" alt=\"Colorlib Template\">\n");
      out.write("    \t\t\t\t\t\t<div class=\"overlay\"></div>\n");
      out.write("    \t\t\t\t\t</a>\n");
      out.write("    \t\t\t\t\t<div class=\"text py-3 pb-4 px-3 text-center\">\n");
      out.write("    \t\t\t\t\t\t<h3><a href=\"product-single.jsp?&id=");
      out.print(r.getString("id_produit") );
      out.write('"');
      out.write('>');
      out.print(r.getString("nom_pr") );
      out.write("</a></h3>\n");
      out.write("    \t\t\t\t\t\t<div class=\"d-flex\">\n");
      out.write("    \t\t\t\t\t\t\t<div class=\"pricing\">\n");
      out.write("\t\t    \t\t\t\t\t\t<p class=\"price\"><span>");
      out.print(r.getString("prix_pr") );
      out.write(" Da</span></p>\n");
      out.write("\t\t    \t\t\t\t\t</div>\n");
      out.write("\t    \t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t\t<div class=\"bottom-area d-flex px-3\">\n");
      out.write("\t    \t\t\t\t\t\t<div class=\"m-auto d-flex\">\n");
      out.write("\t    \t\t\t\t\t\t\t<a href=\"#\" class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n");
      out.write("\t    \t\t\t\t\t\t\t\t<span><i class=\"ion-ios-menu\"></i></span>\n");
      out.write("\t    \t\t\t\t\t\t\t</a>\n");
      out.write("\t    \t\t\t\t\t\t\t<a href=\"#\" class=\"buy-now d-flex justify-content-center align-items-center mx-1\">\n");
      out.write("\t    \t\t\t\t\t\t\t\t<span><i class=\"ion-ios-cart\"></i></span>\n");
      out.write("\t    \t\t\t\t\t\t\t</a>\n");
      out.write("\t    \t\t\t\t\t\t\t<a href=\"#\" class=\"heart d-flex justify-content-center align-items-center \">\n");
      out.write("\t    \t\t\t\t\t\t\t\t<span><i class=\"ion-ios-heart\"></i></span>\n");
      out.write("\t    \t\t\t\t\t\t\t</a>\n");
      out.write("    \t\t\t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \t\t\t</div>\n");
      out.write("                     ");
 }
                        f.close();
                        r.close();
                        c.close();
                     
      out.write("\n");
      out.write("    \t\t</div>\n");
      out.write("    \t</div>\n");
      out.write("    </section>\n");
      out.write("\t\t\n");
      out.write("    </section>\n");
      out.write("\t\t<section class=\"ftco-section ftco-no-pt ftco-no-pb py-5 bg-light\">\n");
      out.write("      <div class=\"container py-4\">\n");
      out.write("        <div class=\"row d-flex justify-content-center py-5\">\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("          \t<h2 style=\"font-size: 22px;\" class=\"mb-0\">Inscription a notre journal</h2>\n");
      out.write("          \t<span>Recevez des e-mail a propos de nos nouvelles offres</span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 d-flex align-items-center\">\n");
      out.write("            <form action=\"#\" class=\"subscribe-form\">\n");
      out.write("              <div class=\"form-group d-flex\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Entrer l'email\">\n");
      out.write("                <input type=\"submit\" value=\"S'inscrire\" class=\"submit px-3\">\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <footer class=\"ftco-footer ftco-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("      \t<div class=\"row\">\n");
      out.write("      \t\t<div class=\"mouse\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"mouse-icon\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mouse-wheel\"><span class=\"ion-ios-arrow-up\"></span></div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("      \t</div>\n");
      out.write("        <div class=\"row mb-5\">\n");
      out.write("          <div class=\"col-md\">\n");
      out.write("            <div class=\"ftco-footer-widget mb-4\">\n");
      out.write("              <h2 class=\"ftco-heading-2\">Taklidi</h2>\n");
      out.write("              <p>100% traditionnel</p>\n");
      out.write("              <ul class=\"ftco-footer-social list-unstyled float-md-left float-lft mt-5\">\n");
      out.write("                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-twitter\"></span></a></li>\n");
      out.write("                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-facebook\"></span></a></li>\n");
      out.write("                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-instagram\"></span></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md\">\n");
      out.write("            <div class=\"ftco-footer-widget mb-4 ml-md-5\">\n");
      out.write("              <h2 class=\"ftco-heading-2\">Menu</h2>\n");
      out.write("              <ul class=\"list-unstyled\">\n");
      out.write("                <li><a href=\"shop.jsp?&categorie\" class=\"py-2 d-block\">Produits</a></li>\n");
      out.write("                <li><a href=\"about.jsp\" class=\"py-2 d-block\">A propos</a></li>\n");
      out.write("                <li><a href=\"blog.jsp\" class=\"py-2 d-block\">Blog</a></li>\n");
      out.write("                <li><a href=\"contact.jsp\" class=\"py-2 d-block\">Nous contacter</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("             <div class=\"ftco-footer-widget mb-4\">\n");
      out.write("              <h2 class=\"ftco-heading-2\">Aide</h2>\n");
      out.write("              <div class=\"d-flex\">\n");
      out.write("\t              <ul class=\"list-unstyled mr-l-5 pr-l-3 mr-4\">\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">Informations sur la livraison</a></li>\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">Rembourement &amp; Echange</a></li>\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">Terms &amp; Conditions</a></li>\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">Politique de confidentialite</a></li>\n");
      out.write("\t              </ul>\n");
      out.write("\t              <ul class=\"list-unstyled\">\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">FAQs</a></li>\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">Contact</a></li>\n");
      out.write("\t              </ul>\n");
      out.write("\t            </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md\">\n");
      out.write("            <div class=\"ftco-footer-widget mb-4\">\n");
      out.write("            \t<h2 class=\"ftco-heading-2\">Des Questions?</h2>\n");
      out.write("            \t<div class=\"block-23 mb-3\">\n");
      out.write("\t              <ul>\n");
      out.write("\t                <li><span class=\"icon icon-map-marker\"></span><span class=\"text\">Val d`hydra, Alger, Algerie</span></li>\n");
      out.write("\t                <li><a href=\"#\"><span class=\"icon icon-phone\"></span><span class=\"text\">+213 21 24 58 69</span></a></li>\n");
      out.write("\t                <li><a href=\"#\"><span class=\"icon icon-envelope\"></span><span class=\"text\">contact@taklidi.com</span></a></li>\n");
      out.write("\t              </ul>\n");
      out.write("\t            </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12 text-center\">\n");
      out.write("\n");
      out.write("            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("\t\t\t\t\t\t  Copyright &copy;<script>document.write(new Date().getFullYear());</script> Tous les droits sont reservés<i class=\"icon-heart color-danger\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- loader -->\n");
      out.write("  <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("  <script src=\"js/popper.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("  <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("  <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("  <script src=\"js/aos.js\"></script>\n");
      out.write("  <script src=\"js/jquery.animateNumber.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("  <script src=\"js/scrollax.min.js\"></script>\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("  <script src=\"js/google-map.js\"></script>\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}