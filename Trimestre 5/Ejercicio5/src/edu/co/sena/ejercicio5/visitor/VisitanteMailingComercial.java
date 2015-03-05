/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio5.visitor;

/**
 *
 * @author My PC
 */
public class VisitanteMailingComercial implements Visitante{

    @Override
    public void visita(EmpresaSinFilial empresa) {
        System.out.println("Envia un email a " + empresa.getNombre() + " direccion: " + empresa.getEmail() + " Propuesta comercial para su empresa");
    }

    @Override
    public void visita(EmpresaMadre empresa) {
        System.out.println("Envia un email a " + empresa.getNombre() + " direccion: " + empresa.getEmail() + " Propuesta comercial para su grupo");
        System.out.println("Impresión de un correo para " + empresa.getNombre() + " dirección" + empresa.getDireccion() + " Propuesta comercial para su grupo");
    }
    
}
