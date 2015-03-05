/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.prototipe;

/**
 *
 * @author ColsutecR
 */
public class SolicitudMatriculacion extends Documento{

    @Override
    public void imprime() {
        System.out.println("Imprime la certificado de cesion: " + contenido);

    }

    @Override
    public void visualiza() {
        System.out.println("Muesta la certificado de cesion: " + contenido);
    }
    
}
