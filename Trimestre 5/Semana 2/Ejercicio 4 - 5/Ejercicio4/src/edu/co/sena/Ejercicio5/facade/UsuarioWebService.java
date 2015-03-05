/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.Ejercicio5.facade;

import java.util.List;

/**
 *
 * @author My PC
 */
public class UsuarioWebService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WebServiceAuto webSericeAuto = new WebSericeAutoImpl();
        System.out.println(webSericeAuto.documento(0));
        System.out.println(webSericeAuto.documento(1));
        List<String> resultados = webSericeAuto.buscaVehiculos(6000, 1000);
        if (resultados.size() > 0) {
            System.out.println("Vehículo(s) cuyo precio está comprendido entre 5000 y 7000");
            for(String resultado: resultados){
            System.out.println("  " + resultado);
            }
        } 
    }
    
}
