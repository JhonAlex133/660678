/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Ejercicio5.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class VehiculoSolicitado {

    protected List<OpcionVehiculo> opciones= new ArrayList<OpcionVehiculo>();
    protected List<Integer> precioDeVentaOpciones = new ArrayList<Integer>();

    public void agregaOpciones(String nombre, int precioDeVenta, FabricaOpcion fabrica) {
        opciones.add(fabrica.getOption(nombre));
        precioDeVentaOpciones.add(precioDeVenta);
    }

    public void muestraOpciones() {
        int indice, tamano;
        tamano = opciones.size();
        for (indice = 0; indice < tamano; indice++) {
            opciones.get(indice).visualiza(
                    precioDeVentaOpciones.get(indice));
            System.out.println();
        }
    }

}
