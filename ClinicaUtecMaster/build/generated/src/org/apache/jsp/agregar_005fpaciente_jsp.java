package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregar_005fpaciente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("\n");
      out.write("        <title>Nuevo Paciente</title>\n");
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
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"indexEnfermera.jsp\">Ver consultas <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Añadir Paciente</a></li>\n");
      out.write("                        <li><a href=\"#\">Generar Receta</a></li>\n");
      out.write("                        <li><a href=\"#\">Nuevo expediente</a></li>\n");
      out.write("                        <li><a href=\"../index.jsp?cerrar=true\">Cerrar Sesion</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("            </div><!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h3 align=\"center\">Nuevo Paciente</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid fieldset\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <form action=\"ServletNuevo\"  method=\"post\"class=\"form-horizontal\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputNombre\" class=\"col-sm-2 control-label\">Nombre :</label>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <input type=\"text\" name=\"inputNombre\" class=\"form-control\" id=\"inputNombre\" placeholder=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputDui\" class=\"col-sm-2 control-label\">N° DUI :</label>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <input type=\"text\" name=\"inputDui\" class=\"form-control\" id=\"inputDui\" placeholder=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputCorreo\" class=\"col-sm-2 control-label\">Correo :</label>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <input type=\"text\" name=\"inputCorreo\" class=\"form-control\" id=\"inputCorreo\" placeholder=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputClave\" class=\"col-sm-2 control-label\">Clave :</label>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <input type=\"password\" name=\"inputClave\" class=\"form-control\" id=\"inputClave\" placeholder=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputConfirmar_Clave\" class=\"col-sm-2 control-label\">Confirmar Clave :</label>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <input type=\"password\" name=\"inputConfirmar_Clave\"  class=\"form-control\" id=\"inputConfirmar_Clave\" placeholder=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" name=\"btn_nuevo_paciente\">Registrar</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\"navbar navbar-default navbar-fixed-bottom\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.3.1.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
