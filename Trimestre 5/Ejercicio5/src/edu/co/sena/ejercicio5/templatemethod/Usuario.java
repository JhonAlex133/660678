/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.templatemethod;

/**
 *
 * @author My PC
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pedido pedidoEspaña = new PedidoEspaña();
        pedidoEspaña.setImporteSinIVA(10000);
        pedidoEspaña.calculaPrecioConIVA();
        pedidoEspaña.visualiza();
        Pedido pedidoLuxemburgo = new PedidoLuxemburgo();
        pedidoLuxemburgo.setImporteSinIVA(10000);
        pedidoLuxemburgo.calculaPrecioConIVA();
        pedidoLuxemburgo.visualiza();
    }

}
