/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import Entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ricardo Burgos
 */
public class DaoCliente extends Conexion implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    int res=0;
    Cliente cl;

    @Override
    public ArrayList<Object> mostrar() throws ClassNotFoundException, SQLException {
        ArrayList<Object> ar = new ArrayList<>();
        ps=super.con.prepareStatement("SELECT * FROM cliente");
        try {
            rs= ps.executeQuery();
            while (rs.next()) {
               cl= new Cliente(res, null, null, null, null, res, null);
            }
        } catch (Exception e) {
        }
        finally{
            ps.close();
            super.con.close();
            }
        return ar;
    }

    @Override
    public int agregar(Object ob) throws ClassNotFoundException, SQLException {
        cl = (Cliente) ob;
        ps= super.con.prepareStatement("INSERT INTO cliente(nombre,direccion,"
                + "telefono,dui,estado )"
                + "VALUES(?,?,?,?,?)");
        ps.setString(1, cl.getNombre());
        ps.setString(2, cl.getDireccion());
        ps.setString(3, cl.getTelefono());
        ps.setString(4, cl.getDui());
        ps.setString(5, "activo");
        try {
            res= ps.executeUpdate();
        } catch (Exception e) {
        }finally{
        ps.close();
        super.con.close();
        }
        return res;
        }

    @Override
    public int modificar(Object ob) throws ClassNotFoundException, SQLException {
       cl = (Cliente) ob;
       ps= super.con.prepareStatement("UPDATE cliente SET nombre=?,"
               + "direccion=?, telefono=?, dui=?");
       ps.setString(1, cl.getNombre());
       ps.setString(2, cl.getDireccion());
       ps.setString(3, cl.getTelefono());
       ps.setString(4, cl.getDui());
       try{
           res= ps.executeUpdate();
       }catch(Exception e){
       }finally{
        ps.close();
        super.con.close();
        }
        return res;
    }

    @Override
    public int eliminar(Object ob) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
