/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio5.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class VistaCatalogo {
    
    protected List<VistaVehiculo> contenido = new ArrayList<>();
    protected DibujaCatalogo dibujo;
    
    public VistaCatalogo(DibujaCatalogo dibujo){
        contenido.add(new VistaVehiculo("Vehiculo economico"));
        contenido.add(new VistaVehiculo("Vehiculo amplio"));
        contenido.add(new VistaVehiculo("Vehiculo rapido"));
        contenido.add(new VistaVehiculo("Vehiculo confortable"));
        contenido.add(new VistaVehiculo("Vehiculo deportivo"));
        this.dibujo = dibujo;
    }
    
    public void dibuja(){
        dibujo.dibuja(contenido);
    }
}
