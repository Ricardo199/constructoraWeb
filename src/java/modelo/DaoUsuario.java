/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidades.Rol;
import Entidades.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class DaoUsuario extends Conexion implements CRUD {

    PreparedStatement ps;
    ResultSet rs;
    int res = 0;
    Rol r;
    Usuarios usu;

    @Override
    public ArrayList<Object> mostrar() throws ClassNotFoundException, SQLException {
          ArrayList<Object> ar=new ArrayList<>();
      ps=super.con.prepareStatement("SELECT * FROM usuario, rol "
              + "WHERE usuario.idrol=rol.idrol AND `estado`= 0");
        try {
            rs=ps.executeQuery();
            
            while(rs.next()){
            
                r=new Rol(rs.getInt(7),rs.getString(8));
                usu=new Usuarios(rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4),r);
                ar.add(usu);
            }
        } catch (Exception e) {
        }finally{
            ps.close();
            super.con.close();
        }
        return ar;
    }

    @Override
    public int agregar(Object ob) throws ClassNotFoundException, SQLException {
         usu=(Usuarios) ob;
        ps=super.con.prepareStatement("INSERT INTO usuario(usuario,password,"
                + "correo,idrol) VALUES(?,?,?,?)");
        ps.setString(1, usu.getUsuario());
            ps.setString(2, usu.getPassword());
            ps.setString(3, usu.getCorreo());
            ps.setInt(4, usu.getR().getId_rol());            
        try {
            res=ps.executeUpdate();
            
        } catch (Exception e) {
        }finally{
            ps.close();
            super.con.close();
        }
       return res;
    }

    @Override
    public int modificar(Object ob) throws ClassNotFoundException, SQLException {
       usu=(Usuarios) ob;
        ps=super.con.prepareStatement("UPDATE usuario set usuario=?,password=?,"
                + "correo=?,idrol=? WHERE idusuario=?");
        ps.setString(1, usu.getUsuario());
        ps.setString(2, usu.getPassword());
        ps.setString(3, usu.getCorreo());
        ps.setInt(4, usu.getR().getId_rol());
        ps.setInt(5, usu.getIdusuario());
        try {
            res=ps.executeUpdate();
            
        } catch (Exception e) {
        }finally{
            ps.close();
            super.con.close();
        }
       return res;
    }

    @Override
    public int eliminar(Object ob) throws ClassNotFoundException, SQLException {
        usu=(Usuarios) ob;
        ps=super.con.prepareStatement("UPDATE `usuario` SET estado= 1 "
                + "where `idusuario`=? ");
  
        ps.setInt(1, usu.getIdusuario());
        try {
            res=ps.executeUpdate();
            
        } catch (Exception e) {
        }finally{
            ps.close();
            super.con.close();
        }
       return res;
    }

}
