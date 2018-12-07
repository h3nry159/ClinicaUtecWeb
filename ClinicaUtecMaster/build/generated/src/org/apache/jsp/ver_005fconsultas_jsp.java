package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ver_005fconsultas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("        <title>Lista Consultas</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/dataTables.bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                        <li class=\"active\"><a href=\"reservas.jsp\">Ver consultas <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"nuevoPaciente.jsp\">Añadir Paciente</a></li>\n");
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
      out.write("        <section>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"box-header\">\n");
      out.write("                            <h3 class=\"box-title\" align=\"center\">Lista de consultas</h3>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table table-striped table-bordered table-sm table-hover display\" id=\"tblConsultas\">\n");
      out.write("                                <!--cabezare de la tabla-->\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>N° Reserva</th>\n");
      out.write("                                        <th>DUI</th>\n");
      out.write("                                        <th>Paciente</th>\n");
      out.write("                                        <th>Razon</th>\n");
      out.write("                                        <th>Fecha</th>\n");
      out.write("                                        <th>Hora</th>\n");
      out.write("                                        <th>Accion</th>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                <tbody>\n");
      out.write("                                </tbody>\n");
      out.write("                                </thead>\n");
      out.write("                                <!--fin de cabezera-->\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                          \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"confirmar_reserva\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" data-keyboard=\"false\" data-backdrop=\"static\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form method=\"post\" action=\"ServletAsignarDoctor\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("                            <h4 class=\"modal-title\">N° de reserva <span id=\"n_reserva\" name=\"n_reserva\"></span></h4>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-md-6\">\n");
      out.write("                                <label for=\"fecha_consulta\" class=\"control-label\">Fecha de consulta:</label>\n");
      out.write("                                <div>\n");
      out.write("                                    <input id=\"fecha_consulta\" name=\"fecha_consulta\" type=\"text\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-md-6\">\n");
      out.write("                                <label for=\"n_dui\" class=\"control-label\">N° DUI:</label>\n");
      out.write("                                <div>\n");
      out.write("                                    <input id=\"n_dui\" name=\"n_dui\" type=\"text\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-md-6\">\n");
      out.write("                                <label for=\"hora_consulta\" class=\"control-label\">Hora:</label>\n");
      out.write("                                <div>\n");
      out.write("                                    <input id=\"hora_consulta\" name=\"hora_consulta\" type=\"text\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-md-6\">\n");
      out.write("                                <label for=\"paciente\" class=\"control-label\">Paciente:</label>\n");
      out.write("                                <div>\n");
      out.write("                                    <input id=\"paciente\" name=\"paciente\" type=\"text\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-md-6\">\n");
      out.write("                                <label for=\"doctor\" class=\"control-label\">Doctor :</label>\n");
      out.write("                                <div>\n");
      out.write("                                       <select id=\"doctor\" class=\"form-control\" name=\"ddlDoctor\">\n");
      out.write("                                           \n");
      out.write("                            </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-md-6\">\n");
      out.write("                                <label for=\"estado\" class=\"control-label\">Estado de Reserva :</label>\n");
      out.write("                                <div>\n");
      out.write("                                      <select id=\"estado\" class=\"form-control\"  name=\"ddlEstado\">\n");
      out.write("                                            <option>Seleccione....</option>\n");
      out.write("                                            <option>Pendiente</option>\n");
      out.write("                                            <option>Aprobado</option>\n");
      out.write("                                            <option>Denegado</option>\n");
      out.write("                                        </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                           \n");
      out.write("                            <input type=\"text\" name =\"id_usuario\" value=\"\" hidden=\"true\">\n");
      out.write("                            <input type=\"text\" id=\"id_reserva\" name =\"n_reserva\" hidden=\"true\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- fin modal body-->\n");
      out.write("\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary pull-right\" name=\"btnAsignar\" ><span class=\"fa fa-save\"></span> Confirmar</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-danger pull-left\" name=\"cancelar\" data-dismiss=\"modal\"><span class=\"fa fa-trash\"></span> Cancelar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
      out.write("        <script src=\"js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/datatable.js\"></script>\n");
      out.write("        <script src=\"js/CustomJs.js\"></script>\n");
      out.write("        \n");
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
