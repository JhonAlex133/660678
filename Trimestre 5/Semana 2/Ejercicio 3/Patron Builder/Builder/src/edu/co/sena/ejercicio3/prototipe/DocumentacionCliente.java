/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.prototipe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class DocumentacionCliente extends Documentacion {

    public DocumentacionCliente(String informacion) {

        documentos = new ArrayList<>();
        DocumentacionEnBlanco docuEnBlanco = DocumentacionEnBlanco.instance();
        List<Documento> documentosEnBlanco = docuEnBlanco.getDocumentos();

        for (Documento documento : documentosEnBlanco) {
            Documento copiaDocumento = documento.duplica();
            copiaDocumento.rellena(informacion);
            documentos.add(copiaDocumento);
        }

    }

    public void visualiza() {
        for (Documento documento : documentos) {
            documento.visualiza();
        }
    }

    public void imprime() {
        for (Documento documento : documentos) {
            documento.imprime();
        }
    }
}


