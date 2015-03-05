/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio5.mediator;

/**
 *
 * @author My PC
 */
public abstract class Control {
    
    protected  String valor = "";
    public Formulario director;
    public String nombre;

    public Control(String nombre) {
        setNombre(nombre);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    protected void setValor(String valor) {
        this.valor = valor;
    }

    protected Formulario getDirector() {
        return director;
    }

    public void setDirector(Formulario director) {
        this.director = director;
    }
    
    public abstract void informa();
    
    protected void modifica(){
        getDirector().controlModificado(this);
    }
    
    
    
}
