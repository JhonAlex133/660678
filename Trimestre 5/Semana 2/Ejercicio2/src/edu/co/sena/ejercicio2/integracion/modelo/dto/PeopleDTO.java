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
public class PeopleDTO implements Serializable{
    
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    public PeopleDTO() {
    }
    
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String toString() {
        return "Persona {" +
                "Primer Nombre = " + this.getPrimerNombre() +
                ", Segundo Nombre = " + this.getSegundoNombre() + 
                ", Primer Apellido = " + this.getPrimerApellido() + 
                ", Segundo Apellido = " + this.getSegundoApellido() + '}';
    }
    
    
}
