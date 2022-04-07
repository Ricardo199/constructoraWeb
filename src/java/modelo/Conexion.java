/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;
/**
 *
 * @author Administrador
 */
public class Conexion {
    private String PORT="3306";
    private String DATABASE="constructora";
    private String CLASSNAME="com.mysql.jdbc.Driver";
     private String HOST="localhost";
    private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
   
    private String USERNAME="root";
    private String PASSWORD="";
    public Connection con;
    
    public Conexion()
    {
        try {
            Class.forName(CLASSNAME);
            con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("ERROR"+e);
        }
    }
    public Connection getConnection()
    {
    return  con;
    }
       
    }

