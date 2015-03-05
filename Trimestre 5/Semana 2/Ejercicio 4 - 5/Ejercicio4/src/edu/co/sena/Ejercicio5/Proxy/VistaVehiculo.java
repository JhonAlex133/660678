/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Ejercicio5.Proxy;

/**
 *
 * @author My PC
 */
public class VistaVehiculo {

    public static void main(String[] args) {

        Animacion animacion = new AnimacionProxy();
        animacion.dibujar();
        animacion.clic();
        animacion.dibujar();

    }

}
