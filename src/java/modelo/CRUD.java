/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public interface CRUD {
    public ArrayList<Object> mostrar()throws ClassNotFoundException, SQLException;
    public int agregar(Object ob)throws ClassNotFoundException, SQLException;
    public int modificar(Object ob)throws ClassNotFoundException, SQLException;
    public int eliminar(Object ob)throws ClassNotFoundException, SQLException;
    
}
