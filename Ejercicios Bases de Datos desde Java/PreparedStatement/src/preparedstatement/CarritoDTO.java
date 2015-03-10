/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedstatement;

/**
 *
 * @author ColsutecR
 */
public class CarritoDTO {
    
    private int idCarrito;
    private double subtotal;
    private double presioTotal;
    private double impuestos;

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPresioTotal() {
        return presioTotal;
    }

    public void setPresioTotal(double presioTotal) {
        this.presioTotal = presioTotal;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    @Override
    public String toString() {
        return "CarritoDTO{" + "idCarrito=" + idCarrito + ", subtotal=" + subtotal + ", presioTotal=" + presioTotal + ", impuestos=" + impuestos + '}';
    }
    
    
    
}
