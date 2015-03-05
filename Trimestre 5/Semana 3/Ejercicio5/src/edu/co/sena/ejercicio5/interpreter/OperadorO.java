/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.interpreter;

/**
 *
 * @author My PC
 */
public class OperadorO extends OperadorBinario {

    public OperadorO(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }


    @Override
    public boolean evalua(String descripcion) {
        return operandoIzquierdo.evalua(descripcion) || operandoDerecho.evalua(descripcion);
    }

    public static Expresion parsea() throws Exception {
        Expresion resultadoIzquierdo, resultadoDerecho;
        resultadoIzquierdo = OperadorY.parsea();
        while ((pieza != null) && (pieza.equals("o"))) {
            siguientePieza();
            resultadoDerecho = OperadorY.parsea();
            resultadoIzquierdo = new OperadorO(resultadoIzquierdo, resultadoDerecho);
        }
        return resultadoIzquierdo;
    }

}
