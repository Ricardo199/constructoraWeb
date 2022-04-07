package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collection;
import java.util.ArrayList;
import Entidades.*;
import java.util.*;

public final class vistaUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Usuarios</title>\n");
      out.write("    \n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@8\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\"#del\").click(function(){\n");
      out.write("                    Swal.fire({\n");
      out.write("                        type:\"info\", \n");
      out.write("                        title:\"Eliminar registro\",\n");
      out.write("                        text:\"Despues de eliminado no se podra recuperar\",\n");
      out.write("                        showCancelButton:true,\n");
      out.write("                        cancelButtonColor:\"red\",\n");
      out.write("                        cancelButtonText:\"cancelar\",\n");
      out.write("                        confirmButtonColor:\"green\",\n");
      out.write("                        confirmButtonText:\"si, eliminar\"\n");
      out.write("                    }).then(result=>{\n");
      out.write("                        if(result.value){\n");
      out.write("                            $(\"#oc\").append(\"<input type='hidden' name='eliminar'>\");\n");
      out.write("                            $(\"#f1\").submit();\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Gestion Usuarios</h1>\n");
      out.write("        ");

            if(request.getAttribute("usuario")==null)
                    response.sendRedirect("ControlUsuario?mostrar=1");
            
      out.write("\n");
      out.write("            <div class=\"col-md-5\">\n");
      out.write("                <form name=\"f1\" id=\"f1\" action=\"#\" method=\"POST\">\n");
      out.write("                <div id=\"oc\"></div>\n");
      out.write("                Id<input type=\"text\" name=\"idusuario\" id=\"idusuario\" \n");
      out.write("                         value=\"\" class=\"form-control\" disabled/>\n");
      out.write("                Usuario<input type=\"text\" name=\"usuario\" id=\"usuario\" \n");
      out.write("                              value=\"\" class=\"form-control\" />\n");
      out.write("                Correo Electronico<input type=\"text\" name=\"correoE\" id=\"correo\"\n");
      out.write("                                         value=\"\" class=\"form-control\" />\n");
      out.write("                Rol<select name=\"idRol\" id=\"idRol\" class=\"form-control\" >\n");
      out.write("                    <option></option>\n");
      out.write("                    ");

                        if(request.getAttribute("rol")!= null){
                            ArrayList<Rol> ro=new ArrayList<Rol>();
                            ro.addAll((Collection)request.getAttribute("rol"));
                            for(Rol r:ro){
                                out.println("<option value='"+r.getId_rol()
                                        +"'>"+r.getNombre()+"</option>");
                            }
                        }
                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"reset\" onclick=\"$('#g').attr('disabled',false)\" value=\"Nuevo\" name=\"nuevo\" class=\"btn btn-success\" />\n");
      out.write("                <input type=\"submit\" disabled id=\"g\" value=\"Guardar\" name=\"guardar\" class=\"btn btn-success\" />\n");
      out.write("                <input type=\"submit\" value=\"Modificar\" name=\"modificar\" class=\"btn btn-success\"/>\n");
      out.write("                <input type=\"button\" onclick=\"$('#password').attr('disabled',true)\" id=\"del\" value=\"Eliminar\" name=\"eliminar\" class=\"btn btn-success\" />\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Usuario</th>\n");
      out.write("                        <th>Correo</th>\n");
      out.write("                         <th>Rol</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 
                         if(request.getAttribute("usuario")!=null){
                         ArrayList<Usuarios> usu=new ArrayList<Usuarios>();
                         usu.addAll((Collection) request.getAttribute("usuario"));
                         for(Usuarios u:usu){
                         out.println("<tr>"
                                 + "<td>"+u.getIdusuario()+"</td>"
                                 + "<td>"+u.getUsuario()+"</td>"
                                 + "<td>"+u.getCorreo()+"</td>"
                                 + "<td>"+u.getR().getNombre()+"</td>"
                                 + "<td><input type='button' value='Editar'"
                                 + "class='btn btn-danger' onclick=$('#idusuario')."
                                 + "val('"+u.getIdusuario()+"');$('#usuario')."
                                 + "val('"+u.getUsuario()+"');$('#correo')."
                                 + "val('"+u.getCorreo()+"');$('#idRol')."
                                 + "val('"+u.getR().getId_rol()+"');>"
                                 + "</td>"
                                 + "</tr>");
                         }
                         }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                ");

                    if(request.getAttribute("r")!=null){
                        out.println("<script>Swal.fire('Resultado','"+request.getAttribute("r")+", "+request.getParameter("p")+"','info')</script>");
                    }
                    if(request.getAttribute("error")!=null){
                        out.println("<script>Swal.fire('Error','"+request.getAttribute("error")+"','info')</script>");
                    }
                
      out.write("\n");
      out.write("                \n");
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
