/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Ejercicio5.flyweight;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author My PC
 */
public class FabricaOpcion {

    protected Map<String, OpcionVehiculo> opciones = new TreeMap<>();

    public OpcionVehiculo getOption(String nombre) {
        
        OpcionVehiculo resultado;
        if (opciones.containsKey(nombre)) {
            return opciones.get(nombre);
        } else {
            resultado = new OpcionVehiculo(nombre, nombre, 100);
            opciones.put(nombre, resultado);
        }
        return resultado;
    }
}
