/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.genericos.ejemplo3;

import java.util.Comparator;

/**
 *
 * @author ColsutecR
 */
public class EstudianteOrdenadosNombre implements Comparator<Estudiante>{

    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        int result = o1.getNombre().compareTo(o2.getNombre());
        if (result!=0) {
            return result;
        }else{
            return 0;
        }
    }
}
