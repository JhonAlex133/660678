/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.Ejercicio4.factorymetod;

/**
 *
 * @author colsutec18
 */
public class PedidoContacto extends Pedido{

    public PedidoContacto(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public void paga() {
        System.out.println("El pago del pedido por importe de: " + importe + " se ha realizado.");
    }
    
    
    
}
