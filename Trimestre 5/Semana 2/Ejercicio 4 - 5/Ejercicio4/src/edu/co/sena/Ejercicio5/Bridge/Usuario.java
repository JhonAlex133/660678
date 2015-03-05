/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Ejercicio5.Bridge;

/**
 *
 * @author My PC
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FormularioMatriculacionPortugal formulario1 = new FormularioMatriculacionPortugal(new FormHtmlImpl());
        formulario1.visualiza();
        
        if (formulario1.administraZona()) {
            formulario1.generaDocumento();
        }
        
        System.out.println();
        
        FormularioMatriculacionEspana formulario2 = new FormularioMatriculacionEspana(new FormAppletImpl());
        formulario2.visualiza();
        if (formulario2.administraZona()) {
            formulario2.generaDocumento();
            
        }

    }

}
