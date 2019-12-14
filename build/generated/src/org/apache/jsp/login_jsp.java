package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Taklidi</title>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha/css/bootstrap.min.css'>\n");
      out.write("<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,300'>\n");
      out.write("<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto:400,700,300'>\n");
      out.write("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css'><link rel=\"stylesheet\" href=\"./style.css\">\n");
      out.write("<style>body {\n");
      out.write("  font: 100% / 1.414 \"Open Sans\", \"Roboto\", arial, sans-serif;\n");
      out.write("  background: #e9e9e9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a,\n");
      out.write("[type=\"submit\"] {\n");
      out.write("  transition: all .25s ease-in;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".signup__container {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  right: 0;\n");
      out.write("  left: 0;\n");
      out.write("  margin-right: auto;\n");
      out.write("  margin-left: auto;\n");
      out.write("  -webkit-transform: translateY(-50%);\n");
      out.write("          transform: translateY(-50%);\n");
      out.write("  overflow: hidden;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("  width: 50rem;\n");
      out.write("  height: 25rem;\n");
      out.write("  border-radius: 0.1875rem;\n");
      out.write("  box-shadow: 0px 0.1875rem 0.4375rem rgba(0, 0, 0, 0.25);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".signup__overlay {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("  background-color: rgba(0, 0, 0, 0.76);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container__child {\n");
      out.write("  width: 50%;\n");
      out.write("  height: 100%;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".signup__thumbnail {\n");
      out.write("  position: relative;\n");
      out.write("  padding: 2rem;\n");
      out.write("  display: flex;\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("  align-items: center;\n");
      out.write("  background: ;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-position: top center;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".thumbnail__logo,\n");
      out.write(".thumbnail__content,\n");
      out.write(".thumbnail__links {\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 2;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".thumbnail__logo {\n");
      out.write("  align-self: flex-start;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo__shape {\n");
      out.write("  fill: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo__text {\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: .8rem;\n");
      out.write("  font-weight: 700;\n");
      out.write("  vertical-align: bottom;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".thumbnail__content {\n");
      out.write("  align-self: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1,\n");
      out.write("h2 {\n");
      out.write("  font-weight: 300;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".heading--primary {\n");
      out.write("  font-size: 1.999rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".heading--secondary {\n");
      out.write("  font-size: 1.414rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".thumbnail__links {\n");
      out.write("  align-self: flex-end;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".thumbnail__links a {\n");
      out.write("  font-size: 1rem;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".thumbnail__links a:focus, .thumbnail__links a:hover {\n");
      out.write("  color: rgba(255, 255, 255, 0.5);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".signup__form {\n");
      out.write("  padding: 2.5rem;\n");
      out.write("  background: #fafafa;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  font-size: .85rem;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  color: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control {\n");
      out.write("  background-color: transparent;\n");
      out.write("  border-top: 0;\n");
      out.write("  border-right: 0;\n");
      out.write("  border-left: 0;\n");
      out.write("  border-radius: 0;\n");
      out.write("}\n");
      out.write(".form-control:focus {\n");
      out.write("  border-color: #111;\n");
      out.write("}\n");
      out.write("\n");
      out.write("[type=\"text\"] {\n");
      out.write("  color: #111;\n");
      out.write("}\n");
      out.write("\n");
      out.write("[type=\"password\"] {\n");
      out.write("  color: #111;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn--form {\n");
      out.write("  padding: .5rem 2.5rem;\n");
      out.write("  font-size: .95rem;\n");
      out.write("  font-weight: 600;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  color: #fff;\n");
      out.write("  background: #111;\n");
      out.write("  border-radius: 2.1875rem;\n");
      out.write("}\n");
      out.write(".btn--form:focus, .btn--form:hover {\n");
      out.write("  background: #323232;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".signup__link {\n");
      out.write("  font-size: .8rem;\n");
      out.write("  font-weight: 600;\n");
      out.write("  text-decoration: underline;\n");
      out.write("  color: #999;\n");
      out.write("}\n");
      out.write(".signup__link:focus, .signup__link:hover {\n");
      out.write("  color: #787878;\n");
      out.write("}</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- partial:index.partial.html -->\n");
      out.write("<div class=\"signup__container\">\n");
      out.write("  <div class=\"container__child signup__thumbnail\">\n");
      out.write("    <div class=\"thumbnail__logo\">\n");
      out.write("      <h1 class=\"logo__text\">Taklidi</h1>\n");
      out.write("    </div>\n");
      out.write("    ");
 String erreur=request.getParameter("erreur"); if(!erreur.isEmpty()){ 
      out.write("\n");
      out.write("      ");
      out.print(erreur);
      out.write("\n");
      out.write("       ");
}
      out.write("\n");
      out.write("    <div class=\"thumbnail__content text-center\">\n");
      out.write("      <h1 class=\"heading--primary\">Bienvenu sur Taklidi.</h1>\n");
      out.write("      <h2 class=\"heading--secondary\">voulez-vous vous connecter?</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"thumbnail__links\">\n");
      out.write("      <ul class=\"list-inline m-b-0 text-center\">\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"signup__overlay\"></div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container__child signup__form\">\n");
      out.write("    <form action=\"login\" method=\"Get\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"nom\">Nom d'utilisateur</label>\n");
      out.write("        <input class=\"form-control\" type=\"text\" name=\"username\" id=\"username\" placeholder=\"Nom d'utilisateur\" required />\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"password\">Mot de Passe</label>\n");
      out.write("        <input class=\"form-control\" type=\"password\" name=\"password\" id=\"password\" placeholder=\"********\" required />\n");
      out.write("      </div>\n");
      out.write("      <div class=\"m-t-lg\">\n");
      out.write("        <ul class=\"list-inline\">\n");
      out.write("          <li>\n");
      out.write("            <input class=\"btn btn--form\" type=\"submit\" value=\"connecter\" />\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a class=\"signup__link\" href=\"register.jsp\">inscrivez vous</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </form>  \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- partial -->\n");
      out.write("  \n");
      out.write("</body>\n");
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
