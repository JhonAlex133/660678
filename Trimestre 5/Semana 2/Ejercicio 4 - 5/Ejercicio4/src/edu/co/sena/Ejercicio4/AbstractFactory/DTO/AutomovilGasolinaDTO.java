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
public class AutomovilGasolinaDTO extends AutomovilDTO{
    
    private String capasidadTanque;

    public String getCapasidadTanque() {
        return capasidadTanque;
    }

    public void setCapasidadTanque(String capasidadTanque) {
        this.capasidadTanque = capasidadTanque;
    }

    @Override
    public String toString() {
        return "AutomovilGasolinaDTO{" + "Placa = " + this.getPlaca()
                + " ,Modelo = " + this.getModelo()
                + " ,Color = " + this.getColor()
                + " ,pasajero = " + this.getPasajero()
                + " ,capasidadTanque = " + capasidadTanque + '}';
    }
    
    
}
