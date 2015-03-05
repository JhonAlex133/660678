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
public class OrdenDePedido extends Documento{

    @Override
    public void imprime() {
        System.out.println("Imprime la orden de pedido: " + contenido);

    }

    @Override
    public void visualiza() {
        System.out.println("Muesta la orden de pedido: " + contenido);

    }
    
}
