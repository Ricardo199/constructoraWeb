/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crontrolador;

import Entidades.Rol;
import Entidades.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.DaoRol;
import modelo.DaoUsuario;

/**
 *
 * @author Manuel
 */
public class ControlUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           DaoUsuario ob1=new DaoUsuario();
           DaoRol ob2=new DaoRol();
           RequestDispatcher res;
           Usuarios usu;
           Rol ro;
           int r=0;
            if (request.getParameter("mostrar")!=null) {
                try {
                    request.setAttribute("usuario", ob1.mostrar());
                    request.setAttribute("rol", ob2.mostrar());
                    
                } catch (Exception e) {
                     request.setAttribute("error", e.getMessage());
                }
            }
             if (request.getParameter("guardar")!=null) {                 
               try {
                   usu = new Usuarios(request.getParameter("idusuario"), 
                           request.getParameter("usuario"), 
                           request.getParameter("pass"), 
                           request.getParameter("correoE"), 
                      new Rol(Integer.parseInt(request.getParameter("idRol"))));
                  r= ob1.agregar(usu);
                    if (r>0) {
                        request.setAttribute("r", "El registro fue ingresado correctamente");
                    }else{
                    request.setAttribute("r", "El registro no fue ingresado correctamente");
                    }
                } catch (Exception e) {
                     request.setAttribute("error", e.getMessage());
                }
            }
                 if (request.getParameter("modificar")!=null) {
                try {
                  
                   usu=new Usuarios(Integer.parseInt(request.getParameter("idusuario")),request.getParameter("usuario"),
                           new Rol(Integer.parseInt(request.getParameter("idDepto"))));
                  r= ob1.modificar(usu);
                  request.setAttribute("usuario", ob1.mostrar());
                  request.setAttribute("rol", ob2.mostrar());
                    if (r>0) {
                        request.setAttribute("r", "El registro fue modificado correctamente");
                    }else{
                    request.setAttribute("r", "El registro no fue modificado correctamente");
                    }
                } catch (Exception e) {
                     request.setAttribute("error", e.getMessage());
                }
            }
            if (request.getParameter("eliminar")!=null) {
                try {
                  
                   usu=new Usuarios(Integer.parseInt(request.getParameter("idusuario")));
                  r= ob1.eliminar(usu);
                  request.setAttribute("usuario", ob1.mostrar());
                    request.setAttribute("rol", ob2.mostrar());
                    if (r>0) {
                        request.setAttribute("r", "El registro fue eliminado correctamente");
                    }else{
                    request.setAttribute("r", "El registro no fue eliminado correctamente");
                    }
                } catch (Exception e) {
                     request.setAttribute("error", e.getMessage());
                }
            }
          
           res=request.getRequestDispatcher("vistaUsuario.jsp");
           res.forward(request, response);
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
