/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio2.negocio;

import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;
import edu.co.sena.ejercicio2.integracion.factory.DAOFactory;
import edu.co.sena.ejercicio2.integracion.modelo.dto.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       
        PeopleDTO p1 = new PeopleDTO();
        p1.setPrimerApellido("Fernandez");
        p1.setSegundoApellido("Ochoa");
        p1.setPrimerNombre("Migue");
        p1.setSegundoNombre("Alejandro");
        
        CustommerDTO c1 = new CustommerDTO();
        c1.setIdCustomer("12345");
        c1.setPrimerApellido("Gutierrez");
        c1.setSegundoApellido("cabezas");
        c1.setPrimerNombre("Jhon");
        c1.setSegundoNombre("Alexander");
        
        EmployeedDTO e1 = new EmployeedDTO();
        e1.setIdEmpleado("1234567");
        e1.setPrimerApellido("Perez");
        e1.setSegundoApellido("Cabrera");
        e1.setPrimerNombre("Andres");
        e1.setSegundoNombre("Julian");
        
//        System.out.println(c1.toString());
//        System.out.println(e1.toString());
//        System.out.println(p1.toString
        DAOFactory f1 = DAOAbstractFactory.getDAOfactory(DAOAbstractFactory.ORACLE_FACTORY);
        EmployeedDAO empFabrica = f1.crearEmployeeDAO();
        CustommerDAO cliFabrica = f1.crearCustommerDAO();
       
        empFabrica.insert(e1);
        empFabrica.delete(e1);
        empFabrica.update(e1);
        System.out.println("");
        cliFabrica.insert(c1);
        cliFabrica.update(c1);
        cliFabrica.delete(c1);
        System.out.println("");
        List<PeopleDTO> lisCliente = new ArrayList<>();
        lisCliente.add(c1);
        lisCliente.add(c1);
        lisCliente.add(c1);
        
        List<PeopleDTO> lisEmp = new ArrayList<>();
        lisEmp.add(e1);
        lisEmp.add(e1);
        lisEmp.add(e1);
        lisEmp.add(e1);
        lisEmp.add(e1);
        
        System.out.println("");
        cliFabrica.insert(lisCliente);
        System.out.println("");
        empFabrica.insert(lisEmp);
    }
    
}
