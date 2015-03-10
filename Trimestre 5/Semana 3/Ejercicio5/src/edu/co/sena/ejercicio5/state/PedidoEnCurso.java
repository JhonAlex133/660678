/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.state;

/**
 *
 * @author My PC
 */
public class PedidoEnCurso extends EstadoPedido {

    public PedidoEnCurso(Pedido pedido) {
        super(pedido);
    }
    
    @Override
    public void agregaProducto(Producto producto) {
        pedido.getProductos().add(producto);
    }

    @Override
    public void borra() {
        pedido.getProductos().clear();
    }

    @Override
    public void suprimeProducto(Producto producto) {
        pedido.getProductos().remove(producto);
    }

    public EstadoPedido estadoSiguiente() {
        return new PedidoValidado(pedido);
    }

    


}
