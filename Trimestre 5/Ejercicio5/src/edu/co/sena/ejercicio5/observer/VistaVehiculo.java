/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio5.observer;

/**
 *
 * @author My PC
 */
public class VistaVehiculo implements Observador{
    
    protected Vehiculo vehiculo;
    protected String texto = "";

    public VistaVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        vehiculo.agrega(this);
        actualizaTexto();
    }
    
    protected void actualizaTexto(){
        texto = "Descripcion " + vehiculo.descripcion + " Precio: " + vehiculo.precio;
    }
    
    public void actualiza(){
        actualizaTexto();
        this.redibuja();
    }
    
    public void redibuja(){
        System.out.println(texto);
    }
    
}
