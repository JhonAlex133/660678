/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author colstecR
 */
public class SolicitudRebaja {

    protected List<Vehiculo> vehiculosEnStock = new ArrayList<>();
    protected long hoy;
    protected long tiempoEnStock;
    protected double tasaDescuento;
    
    public SolicitudRebaja(long hoy, long tiempoEnStock, double tasaDescuento) {
        this.hoy = hoy;
        this.tiempoEnStock = tiempoEnStock;
        this.tasaDescuento = tasaDescuento;
    }
    
    public void rebaja(List<Vehiculo> vehiculos) {
        vehiculosEnStock.clear();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getTiempoEnStock(hoy) >= tiempoEnStock) {
                vehiculosEnStock.add(vehiculo);
            }            
        }
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.modificaPrecio(1.0 - tasaDescuento);
        }
    }
    
    public void anula(){
        for (Vehiculo vehiculo : vehiculosEnStock) {
            vehiculo.modificaPrecio(1.0 / (1.0 - tasaDescuento));
        }
    }
    
    public void restablece(){
        for (Vehiculo vehiculo : vehiculosEnStock) {
            vehiculo.modificaPrecio(1.0 - tasaDescuento);
        }   
    }
    
}
