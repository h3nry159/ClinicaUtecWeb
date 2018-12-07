package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">ClinicaUtec</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("            </div><!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <center><h1>Bienvenido</h1></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid login\"> \n");
      out.write("\n");
      out.write("        <form class=\"form-horizontal\" action=\"ServletLogin\" method=\"post\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid formLogin\"> \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                    <label class=\"control-label\" for =\"usuario\">USUARIO :</label>  \n");
      out.write("                    <input class=\"form-control\" id=\"usuario\" value=\"\" type =\"text\" name=\"txtUsuario\" placeholder=\"Ingrese su documento de identidad \"required>    \n");
      out.write("                </div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">    \n");
      out.write("                    <label class=\"control-label\" for=\"clave\">CLAVE : </label>\n");
      out.write("                    <input class=\"form-control\" id=\"clave\" type =\"password\" value=\"\" name=\"txtContra\"  placeholder=\"Ingrese su contraseña\" required>\n");
      out.write("                </div>  \n");
      out.write("                \n");
      out.write("                <div class=\"form-group \">\n");
      out.write("                    <label class=\"control-label\">Seleccione el tipo de Usuario : </label>\n");
      out.write("                    <div class=\"radio\">\n");
      out.write("                        <label>\n");
      out.write("                            <input type=\"radio\" name=\"paciente\" id=\"paciente\" value=\"1\">\n");
      out.write("                            Paciente\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"radio\">\n");
      out.write("                        <label>\n");
      out.write("                            <input type=\"radio\" name=\"doctor\" id=\"doctor\" value=\"2\">\n");
      out.write("                            Doctor\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"radio\">\n");
      out.write("                        <label>\n");
      out.write("                            <input type=\"radio\" name=\"enfermera\" id=\"enfermera\" value=\"3\">\n");
      out.write("                            Enfermera\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"pull-right\"><button type=\"submit\" name=\"btnLogin\" class=\"btn btn-primary\">Login</button></div>\n");
      out.write("                </div>   \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer class=\"navbar navbar-default navbar-fixed-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery-3.3.1.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
