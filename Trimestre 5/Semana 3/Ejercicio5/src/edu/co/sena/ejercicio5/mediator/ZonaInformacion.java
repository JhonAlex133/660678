/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio5.mediator;

import java.util.Scanner;

/**
 *
 * @author My PC
 */
public class ZonaInformacion extends Control{
    
    Scanner reader = new Scanner(System.in);

    public ZonaInformacion(String nombre) {
        super(nombre);
    }
    
    public void informa(){
        System.out.println("Información de: " + nombre);
        setValor(reader.nextLine());
        this.modifica();
    }
    
}
