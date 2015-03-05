/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio2.integracion.modelo.dto;

import java.io.Serializable;

/**
 *
 * @author ColsutecR
 */
public class CustommerDTO extends PeopleDTO implements Serializable{
    
    private String idCustomer;

    public CustommerDTO() {
    }
    
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Cliente {" + "id Cliente=" + idCustomer + 
                ", Primer Nombre = " + this.getPrimerNombre() +
                ", Segundo Nombre = " + this.getSegundoNombre() + 
                ", Primer Apellido = " + this.getPrimerApellido() + 
                ", Segundo Apellido = " + this.getSegundoApellido() + '}';
    }
    
    
}
