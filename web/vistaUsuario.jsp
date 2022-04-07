<%-- 
    Document   : vistaUsuario
    Created on : 10-06-2019, 09:40:02 AM
    Author     : Manuel
--%>

<%@page import="java.util.Collection"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" import="Entidades.*" import="java.util.*"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
    
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
        <script src="jquery-3.4.1.min.js" type="text/javascript"></script>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@8"></script>
        <script>
            $(document).ready(function(){
                $("#del").click(function(){
                    Swal.fire({
                        type:"info", 
                        title:"Eliminar registro",
                        text:"Despues de eliminado no se podra recuperar",
                        showCancelButton:true,
                        cancelButtonColor:"red",
                        cancelButtonText:"cancelar",
                        confirmButtonColor:"green",
                        confirmButtonText:"si, eliminar"
                    }).then(result=>{
                        if(result.value){
                            $("#oc").append("<input type='hidden' name='eliminar'>");
                            $("#f1").submit();
                        }
                    });
                });
            });
        </script>
    </head>
    <body>
        <h1>Gestion Usuarios</h1>
        <%
            if(request.getAttribute("usuario")==null)
                    response.sendRedirect("ControlUsuario?mostrar=1");
            %>
            <div class="col-md-5">
                <form name="f1" id="f1" action="#" method="POST">
                <div id="oc"></div>
                Id<input type="text" name="idusuario" id="idusuario" 
                         value="" class="form-control" disabled/>
                Usuario<input type="text" name="usuario" id="usuario" 
                              value="" class="form-control" />
                Correo Electronico<input type="text" name="correoE" id="correo"
                                         value="" class="form-control" />
                Rol<select name="idRol" id="idRol" class="form-control" >
                    <option></option>
                    <%
                        if(request.getAttribute("rol")!= null){
                            ArrayList<Rol> ro=new ArrayList<Rol>();
                            ro.addAll((Collection)request.getAttribute("rol"));
                            for(Rol r:ro){
                                out.println("<option value='"+r.getId_rol()
                                        +"'>"+r.getNombre()+"</option>");
                            }
                        }
                    %>
                </select>
                <br>
                <input type="reset" onclick="$('#g').attr('disabled',false)" value="Nuevo" name="nuevo" class="btn btn-success" />
                <input type="submit" disabled id="g" value="Guardar" name="guardar" class="btn btn-success" />
                <input type="submit" value="Modificar" name="modificar" class="btn btn-success"/>
                <input type="button" onclick="$('#password').attr('disabled',true)" id="del" value="Eliminar" name="eliminar" class="btn btn-success" />
                
                
                
            </form>
                
                <table class="table">
                    <tr>
                        <th>Id</th>
                        <th>Usuario</th>
                        <th>Correo</th>
                         <th>Rol</th>

                    </tr>
                    <% 
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
                    %>
                </table>

            </div>
                <%
                    if(request.getAttribute("r")!=null){
                        out.println("<script>Swal.fire('Resultado','"+request.getAttribute("r")+", "+request.getParameter("p")+"','info')</script>");
                    }
                    if(request.getAttribute("error")!=null){
                        out.println("<script>Swal.fire('Error','"+request.getAttribute("error")+"','info')</script>");
                    }
                %>
                
    </body>
</html>
