/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio2.integracion.entity.DAO.memory;

import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author ColsutecR
 */
public class EmployeedDAOMemoryImpl implements EmployeedDAO{

    @Override
    public void insert(PeopleDTO p) {
        System.out.println("Insertar empleado en Memoria" + p.toString());
    }

    @Override
    public void update(PeopleDTO p) {
        System.out.println("Actualiza empleado en Memoria" + p.toString());
    }

    @Override
    public void delete(PeopleDTO p) {
        System.out.println("Eliminar empleado en Memoria" + p.toString());
    }

    @Override
    public void findById(PeopleDTO p) {
        System.out.println("Buscar empleado en Memoria" + p.toString());    
    }

    @Override
    public void insert(Collection<PeopleDTO> p1) {
        for (PeopleDTO empleado : p1) {
            System.out.println("insertar empleado a memoria" + p1.toString());   
        }
    }
    
    
}
