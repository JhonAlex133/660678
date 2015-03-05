/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.Ejercicio4.adapter;

/**
 *
 * @author ColsutecR
 */
public class ServidorWeb {
    
    public static void main(String[] args) {
        Documento doc1, doc2;
        doc1 = new DocumentoHtml();
        doc1.setContenido("Hello");
        doc1.dibujar();
        System.out.println();
        doc2 = new DocumentoPDF();
        doc2.setContenido("Hola");
        doc2.dibujar();
    }
    
}
