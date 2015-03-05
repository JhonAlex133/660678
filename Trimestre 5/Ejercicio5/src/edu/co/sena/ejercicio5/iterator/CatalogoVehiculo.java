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
public class CatalogoVehiculo extends Catalogo<Vehiculo, IteradorVehiculo> {

    public CatalogoVehiculo() {
        contenido.add(new Vehiculo("vehiculo economico"));
        contenido.add(new Vehiculo("pequeño vehiculo economico"));
        contenido.add(new Vehiculo("vehiculo de gran calidad"));
    }

    protected IteradorVehiculo creaIterador() {
        return new IteradorVehiculo();
    }

}
