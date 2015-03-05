/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.Ejercicio4.factorymetod;

/**
 *
 * @author My PC
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cli = new ClienteContado();
        cli.nuevoPedido(2000.0);
        cli.nuevoPedido(10000.0);
        
        Cliente cli1 = new ClienteCredito();
        cli1.nuevoPedido(2000.0);
        cli1.nuevoPedido(10000.0);
    }
    
}
