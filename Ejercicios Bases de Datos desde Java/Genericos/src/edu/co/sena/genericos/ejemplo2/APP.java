/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.genericos.ejemplo2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona<String,String,String,String> per1 =  new Persona<>();
        
        per1.setPrimerNombre("Diana");
        per1.setSegundoNombre("Carolina");
        per1.setPrimerApellido("Ramirez");
        per1.setSegundoApellido("Perez");
        
        System.out.println(per1.toString());
        List<Integer> lista = new ArrayList<>(3);
//        lista.add(1);
//        lista.add(2);
//        lista.add(3);
//        lista.add(4);
//        lista.add(5);
        for (Integer lista1 : lista) {
            System.out.println(lista1);
        }
        
        Deque<Integer> cola = new ArrayDeque<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);
        cola.add(6);
        for (Integer cola1 : cola) {
            System.out.println(cola1);
        }
        System.out.println("Cola despues de eliminar");
        cola.remove();
        cola.remove();
        for (Integer cola1 : cola) {
            System.out.println(cola1);
        }
        System.out.println("Lista");
        Deque<Integer> pila = new ArrayDeque<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        for (Integer pila1 : pila) {
            System.out.println(pila1); 
        }
        System.out.println("Lista despues de eliminar");
        pila.pop();
        pila.pop();
        for (Integer pila1 : pila) {
            System.out.println(pila1); 
        }
    }
    
}
