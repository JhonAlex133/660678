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
public class OperadorY extends OperadorBinario{

    public OperadorY(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }
    
    public boolean evalua(String descripcion) {
        return operandoIzquierdo.evalua(descripcion) && operandoDerecho.evalua(descripcion);        
    }
    
    public static Expresion parsea()throws Exception{
        Expresion resultadoIzquierdo, resultadoDerecho;
        resultadoIzquierdo = Expresion.parsea();
        while((pieza != null) && (pieza.equals("y"))){
            siguientePieza();
            resultadoDerecho = Expresion.parsea();
            resultadoIzquierdo = new OperadorY(resultadoIzquierdo, resultadoDerecho);
        }
        return resultadoIzquierdo;
    }
    
}
