/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Ejercicio4.abstractfactory.modelo;

import edu.co.sena.Ejercicio4.abstractfactory.DTO.AutomovilElectricoDTO;
import edu.co.sena.Ejercicio4.abstractfactory.DTO.AutomovilGasolinaDTO;
import edu.co.sena.Ejercicio4.abstractfactory.DTO.ScooterElectricidadDTO;
import edu.co.sena.Ejercicio4.abstractfactory.DTO.ScooterGasolinaDTO;

/**
 *
 * @author colsutec18
 */
public class Catalogo {
    
    public static void main(String[] args) {
        
        FabricaVehiculo f1 = new FabricaVehiculoElectricidad();
        AutomovilElectricoDTO ae1 = (AutomovilElectricoDTO)f1.crearAutomovil();
        ae1.setColor("Rojo");
        ae1.setModelo("1996");
        ae1.setPasajero(4);
        ae1.setPlaca("123-ESD");
        ae1.setAmperaje("1000");
        ae1.setVoltaje("1000");
        
        System.out.println(ae1.toString());
        
        ScooterElectricidadDTO se1 = (ScooterElectricidadDTO)f1.crearScooter();
        se1.setAmperaje("100");
        se1.setColor("Verde");
        se1.setModelo("2008");
        se1.setPasajero(5);
        se1.setPlaca("432-WAS");
        se1.setVoltaje("100");
        
        System.out.println("");
        System.out.println(se1.toString());
        
        FabricaVehiculo f2 = new FabricaVehiculoGasolina();
        AutomovilGasolinaDTO ag1 = (AutomovilGasolinaDTO)f2.crearAutomovil();
        ag1.setCapasidadTanque("50");
        ag1.setColor("Negro");
        ag1.setModelo("1999");
        ag1.setPasajero(4);
        ag1.setPlaca("654-SER");  
        
        System.out.println("");
        System.out.println(ag1.toString());
        
        ScooterGasolinaDTO sg1 = (ScooterGasolinaDTO)f2.crearScooter();
        ag1.setCapasidadTanque("100");
        ag1.setColor("Azul");
        ag1.setModelo("1993");
        ag1.setPasajero(3);
        ag1.setPlaca("543-SDR");
        
        System.out.println("");
        System.out.println(ag1.toString());
        
    }
    
}
