/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.iterator;

/**
 *
 * @author My PC
 */
public class Vehiculo extends Elemento{

    public Vehiculo(String descripcion) {
        super(descripcion);
    }

    public void visualiza() {
        System.out.print("Descripcion del vehículo: " + descripcion);
    }

}
