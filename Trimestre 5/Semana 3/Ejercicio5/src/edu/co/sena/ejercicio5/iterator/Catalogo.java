/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 * @param <TElemento>
 * @param <TIterator>
 */
public abstract class Catalogo<TElemento extends Elemento, TIterador extends Iterador<TElemento>>{
    
    protected List<TElemento> contenido = new ArrayList<>();

    protected abstract TIterador creaIterador();

    public TIterador busqueda(String palabraClaveConsulta) {
        TIterador resultado = creaIterador();
        resultado.setPalabraClaveConsulta(palabraClaveConsulta,contenido);
        return resultado;
    }

}
