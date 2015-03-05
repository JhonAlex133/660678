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
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ObjetoBasico vehiculo1 = new Vehiculo("Auto++ Kt500 Vehiculo de ocasion en buen estado");
        System.out.println(vehiculo1.devuelveDescripcion());
        ObjetoBasico modelo1 = new Modelo("Vehiculo amplio y confialble","KT400");
        
        ObjetoBasico vehiculo2 = new Vehiculo(null);
        vehiculo2.setSiguiente(modelo1);
        System.out.println(vehiculo2.devuelveDescripcion());
        
        ObjetoBasico marca = new Marca("Marca del automovil", "de gran calidad","Auto++");
        ObjetoBasico modelo2 = new Modelo(null,"KT700");
        
        modelo2.setSiguiente(marca);
        
        ObjetoBasico vehiculo3 = new Vehiculo(null);
        vehiculo3.setSiguiente(modelo2);
        System.out.println(vehiculo3.devuelveDescripcion());
        
        ObjetoBasico vehiculo4 = new Vehiculo(null);
        System.out.println(vehiculo4.devuelveDescripcion()  );
    }
    
}
