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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FabricaOpcion fabrica = new FabricaOpcion();
        VehiculoSolicitado vehiculo = new VehiculoSolicitado();
        vehiculo.agregaOpciones("air bag", 80, fabrica);
        vehiculo.agregaOpciones("dirección asistida", 90, fabrica);
        vehiculo.agregaOpciones("elevalunas eléctricos", 85, fabrica);
        vehiculo.muestraOpciones();
    }

}
