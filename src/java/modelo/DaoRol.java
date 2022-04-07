/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Entidades.Rol;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class DaoRol extends Conexion implements CRUD{
     PreparedStatement ps;
    ResultSet rs;
    int res=0;
    Rol r;
    @Override
    public ArrayList<Object> mostrar() throws ClassNotFoundException, SQLException {
         ArrayList<Object> ar=new ArrayList<>();
      ps=super.con.prepareStatement("SELECT * FROM rol ");
        try {
            rs=ps.executeQuery();
            
            while(rs.next()){
            
                r=new Rol(rs.getInt(1),rs.getString(2));
                
                ar.add(r);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(Object ob) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Object ob) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
