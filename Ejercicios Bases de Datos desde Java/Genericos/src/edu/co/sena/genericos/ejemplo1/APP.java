/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.genericos.ejemplo1;

/**
 *
 * @author ColsutecR
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Shirt cam1 = new Shirt();
        cam1.setMarca("Pajarito");
        cam1.setMaterial("Tela");
        cam1.setTalla("XXXL");

        CacheAny<Shirt> objeto1 = new CacheAny<>();

    }
}
