/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio5.mediator;

/**
 *
 * @author My PC
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Formulario f1 = new Formulario();
        f1.agregarControl(new ZonaInformacion("nombre"));
        f1.agregarControl(new ZonaInformacion("Apellidos"));
        
        PopupMenu menu = new PopupMenu("Coprestatario");
        menu.egregaOpcion("Sin Coprestatario");
        menu.egregaOpcion("Con Coprestatario");
        
        f1.agregarControl(menu);
        f1.setMenuCoprestataio(menu);
        
        Boton b1 = new Boton("OK");
        f1.agregarControl(b1);
        f1.setBotonOK(b1);
        
        f1.agregarControlCoprestatario(new ZonaInformacion("Nombre del coprestatario"));
        f1.agregarControlCoprestatario(new ZonaInformacion("Apellidos del coprestatario"));
        f1.informa();
        
    }
    
}
