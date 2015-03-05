/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Ejercicio4.abstractfactory.DTO;

/**
 *
 * @author colsutec18
 */
public class AutomovilElectricoDTO extends AutomovilDTO{
    
    private String amperaje;
    private String voltaje;

    public String getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(String amperaje) {
        this.amperaje = amperaje;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public String toString() {
        return "AutomovilElectricoDTO{" + "Placa = " + this.getPlaca()
                + " ,Modelo = " + this.getModelo()
                + " ,Color = " + this.getColor()
                + " ,pasajero = " + this.getPasajero()
                + " ,amperaje= " +  amperaje + 
                ", voltaje=" + voltaje + '}';
    }
    
    
}
