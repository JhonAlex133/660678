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
public class EmployeedDTO extends PeopleDTO implements Serializable{
    
    private String idEmpleado;

    public EmployeedDTO() {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado {" + "id Empleado=" + idEmpleado + 
                ", Primer Nombre = " + this.getPrimerNombre() +
                ", Segundo Nombre = " + this.getSegundoNombre() + 
                ", Primer Apellido = " + this.getPrimerApellido() + 
                ", Segundo Apellido = " + this.getSegundoApellido() + '}';
    }
    
    
}
