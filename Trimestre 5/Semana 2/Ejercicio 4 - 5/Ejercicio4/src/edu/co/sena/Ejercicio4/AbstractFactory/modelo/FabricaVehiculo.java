/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Ejercicio4.abstractfactory.modelo;

import edu.co.sena.Ejercicio4.abstractfactory.DTO.AutomovilDTO;
import edu.co.sena.Ejercicio4.abstractfactory.DTO.ScooterDTO;

/**
 *
 * @author colsutec18
 */
public interface FabricaVehiculo {

    public abstract AutomovilDTO crearAutomovil();
    public abstract ScooterDTO crearScooter();
    
}
