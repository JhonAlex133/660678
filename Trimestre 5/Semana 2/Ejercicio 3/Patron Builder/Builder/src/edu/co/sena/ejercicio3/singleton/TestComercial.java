/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.singleton;

/**
 *
 * @author ColsutecR
 */
public class TestComercial {

    public static void main(String[] args) {
        
        // inicialización del comercial en el sistema
        Comercial elComercial = Comercial.Instance();
        elComercial.setNombre("Comercial Auto");
        elComercial.setDireccion("Madrid");
        elComercial.setEmail("comercial@comerciales.com ");
        
        // muestra el comercial del sistema
        visualiza();
    }

    public static void visualiza() {
        Comercial elComercial = Comercial.Instance();
        elComercial.visualiza();
    }
}

