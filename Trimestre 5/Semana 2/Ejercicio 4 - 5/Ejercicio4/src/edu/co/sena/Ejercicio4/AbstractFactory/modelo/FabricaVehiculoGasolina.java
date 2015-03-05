/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Ejercicio4.abstractfactory.modelo;

import edu.co.sena.Ejercicio4.abstractfactory.DTO.AutomovilDTO;
import edu.co.sena.Ejercicio4.abstractfactory.DTO.AutomovilGasolinaDTO;
import edu.co.sena.Ejercicio4.abstractfactory.DTO.ScooterDTO;
import edu.co.sena.Ejercicio4.abstractfactory.DTO.ScooterGasolinaDTO;

/**
 *
 * @author colsutec18
 */
public class FabricaVehiculoGasolina implements FabricaVehiculo{

    @Override
    public AutomovilDTO crearAutomovil() {
        return new AutomovilGasolinaDTO();
    }

    @Override
    public ScooterDTO crearScooter() {
        return new ScooterGasolinaDTO();
    }

    
    
}
