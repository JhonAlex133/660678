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
public class ClienteContado extends Cliente{

    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoContacto(importe);
    }
    
}
