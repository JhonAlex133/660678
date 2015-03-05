/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.Ejercicio5.flyweight;

/**
 *
 * @author My PC
 */
public class OpcionVehiculo {
    protected String nombre;
    protected String descripcion;
    protected int precioEstadar;

    public OpcionVehiculo(String nombre, String descripcion, int precioEstadar) {
        this.nombre = nombre;
        this.descripcion = "Descripción de " + nombre;
        this.precioEstadar = 100;
    }

    public void visualiza(int precioDeVenta){
        System.out.println("Opción");
        System.out.println("Nombre: " + nombre);
        System.out.println(descripcion);
        System.out.println("Precio estandár: " + precioEstadar);
        System.out.println("Precio de venta: " + precioDeVenta);
    }
    
}
