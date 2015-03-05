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
public class WebSericeAutoImpl implements WebServiceAuto{
            
    protected Catalogo catalogo = new ComponenteCatalogo();
    protected GestionDocumeto gestionDocumeto = new ComponenteGestionDocumento();

    @Override
    public String documento(int indice) {
        return gestionDocumeto.documento(indice);
    }

    @Override
    public List<String> buscaVehiculos(int precioMedio, int desviacionMax) {
        return catalogo.buscaVehiculo(precioMedio - desviacionMax, precioMedio + desviacionMax);
    }
    
    
    
}
