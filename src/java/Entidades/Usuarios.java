/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Manuel
 */
public class Usuarios {

    private int idusuario;
    private String usuario;
    private String password;
    private String correo;
    private Rol r;

    public Usuarios() {
        
    }
    
    public Usuarios(int idusuario) {
        this.idusuario = idusuario;
    }

    public Usuarios(int idusuario, Rol r) {
        this.idusuario = idusuario;
        this.r = r;
    }
    
    public Usuarios(int idusuario, String usuario, String password, String correo, Rol r) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.password = password;     
        this.correo = correo;
        this.r = r;
    }
    

    public Usuarios(String usuario, String password, String nombre, String correo, Rol r) {
        this.usuario = usuario;
        this.password = password;    
        this.correo = correo;
        this.r = r;
    }

    public Usuarios(int idusuario, String usuario, Rol r) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.r = r;
    }
    
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Rol getR() {
        return r;
    }

    public void setR(Rol r) {
        this.r = r;
    }
    
    
    
    
    
}
