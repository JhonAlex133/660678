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
public class AnimacionProxy implements Animacion

{
    
    protected Video video = null;
    protected String foto = "mostrar la foto";

    @Override
    public void clic() {
        if (video == null) {
            video = new Video();
            video.carga();
        }
        video.reproduce();
    }

    @Override
    public void dibujar() {
        if (video != null) {
            video.dibujar();
        } else {
            dibuja(foto);
        }
    }
    
    public void dibuja(String foto){
        System.out.println(foto);
    }
}
