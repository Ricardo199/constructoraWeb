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
public class Rol {
    private int id_rol;
    private String nombre;

    public Rol() {
    }

    public Rol(int id_rol) {
        this.id_rol = id_rol;
    }
    
    public Rol(int id_rol, String nombre) {
        this.id_rol = id_rol;
        this.nombre = nombre;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
