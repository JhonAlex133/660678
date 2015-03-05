/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Ejercicio5.facade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class ComponenteCatalogo implements Catalogo {

    protected Object[] descipcionVehiculo = 
    {
        "Berlina 5 puertas", 6000, "Compacto 3 puertas", 4000,
        "Espace 5 puertas", 8000, "Break 5 puertas", 7000,
        "Coupé 2 puertas", 9000, "Utilitario 3 puertas", 5000

    };
    
    @Override
    public List<String> buscaVehiculo(int precioMin, int precioMax ){
        int indice, tamano;
        List<String> resultado = new ArrayList<>();
        tamano = descipcionVehiculo.length / 2;
        for (indice = 0;  indice < tamano ; indice++) {
            int precio = (Integer)descipcionVehiculo[2 * indice + 1];
            if ((precio >= precioMin) && (precio <= precioMax)) {
                resultado.add((String)descipcionVehiculo[2 * indice]);
            }
        }
        return resultado;
    }

}
