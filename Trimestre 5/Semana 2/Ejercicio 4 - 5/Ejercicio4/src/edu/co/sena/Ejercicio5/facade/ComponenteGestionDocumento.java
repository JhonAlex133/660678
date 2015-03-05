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
public class ComponenteGestionDocumento implements GestionDocumeto{

    @Override
    public String documento(int indice){
        return "Documento número " + indice;
    }
        
    
    
    
    
}
