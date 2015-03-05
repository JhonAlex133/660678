/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.prototipe;

import com.sun.jmx.remote.util.OrderClassLoaders;

/**
 *
 * @author ColsutecR
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // iniciacion de documentos en blanco
        DocumentacionEnBlanco docuEnBlanco = DocumentacionEnBlanco.instance();
        docuEnBlanco.incluye(new OrdenDePedido());
        docuEnBlanco.incluye(new CertificadoCesion());
        docuEnBlanco.incluye(new SolicitudMatriculacion());
        
        // creacion de documentacion nueva para dos clientes
        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
    }

}
