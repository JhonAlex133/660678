/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.Ejercicio5.Proxy;

/**
 *
 * @author My PC
 */
public class Video implements Animacion{
    
    @Override
    public void clic(){ }
    
    @Override
    public void dibujar(){
        System.out.println("Mostrar el video");
    }
    
    public  void carga(){
        System.out.println("Carga el video");
    }
    
    public  void reproduce(){
        System.out.println("Reproducir el vídeo");
    }
}
