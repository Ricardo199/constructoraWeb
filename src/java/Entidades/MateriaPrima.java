/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * Nombre de la clase: MateriaPrima Version: 1.0 Fecha:04/09/2019 
 * Copyright 
 * ITCA FEPADE
 * @author Manuel
 */
public class MateriaPrima {

    private int idmateriaPrima;
    private String nombre;
    private double precioUnidad;
    private double existencia;

    public MateriaPrima() {
    }

    public MateriaPrima(int idmateriaPrima, String nombre, 
            double precioUnidad, double existencia) {
        this.idmateriaPrima = idmateriaPrima;
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.existencia = existencia;
    }

    public int getIdmateriaPrima() {
        return idmateriaPrima;
    }

    public void setIdmateriaPrima(int idmateriaPrima) {
        this.idmateriaPrima = idmateriaPrima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

}
