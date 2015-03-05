/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.chainofresponsability;

/**
 *
 * @author colstecR
 */
public class Modelo extends ObjetoBasico{

    protected String descripcion;
    protected String nombre;

    public Modelo(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
    
    @Override
    protected String getDescripcion() {
        if (descripcion != null) {
            return "Modelo " + nombre + " : " + descripcion;
        }else{
            return null;
        }
    }
    
    
    
}
