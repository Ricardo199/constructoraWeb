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
public class Maquinaria {
    private int idmaquinaria;
    private String nombre;
    private String tipoMaquinaria;
    private String marca;
    private double precioDia;
    private int existencia;
    private String estado;

    public Maquinaria() {
    }

    public Maquinaria(int idmaquinaria, String nombre,
            String tipoMaquinaria, String marca, double precioDia, 
            int existencia, String estado) {
        this.idmaquinaria = idmaquinaria;
        this.nombre = nombre;
        this.tipoMaquinaria = tipoMaquinaria;
        this.marca = marca;
        this.precioDia = precioDia;
        this.existencia = existencia;
        this.estado = estado;
    }

    public int getIdmaquinaria() {
        return idmaquinaria;
    }

    public void setIdmaquinaria(int idmaquinaria) {
        this.idmaquinaria = idmaquinaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMaquinaria() {
        return tipoMaquinaria;
    }

    public void setTipoMaquinaria(String tipoMaquinaria) {
        this.tipoMaquinaria = tipoMaquinaria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
