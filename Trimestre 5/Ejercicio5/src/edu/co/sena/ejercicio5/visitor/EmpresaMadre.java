/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class EmpresaMadre extends Empresa {

    protected List<Empresa> filiales = new ArrayList<Empresa>();

    public EmpresaMadre(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }

    public void aceptaVisitante(Visitante visitante) {
        visitante.visita(this);
        for (Empresa filial : filiales) {
            filial.aceptaVisitante(visitante);
        }
    }
    public boolean agregaFilial(Empresa filial){
        return filiales.add(filial);
    }
}
