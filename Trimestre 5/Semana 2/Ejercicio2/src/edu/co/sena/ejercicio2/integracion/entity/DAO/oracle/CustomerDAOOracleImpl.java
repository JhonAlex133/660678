/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.entity.DAO.oracle;

import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author ColsutecR
 */
public class CustomerDAOOracleImpl implements CustommerDAO {

    @Override
    public void insert(PeopleDTO p) {
        System.out.println("Insertar cliente en Oracle" + p.toString());
    }

    @Override
    public void update(PeopleDTO p) {
        System.out.println("Actualiza cliente en Oracle" + p.toString());
    }

    @Override
    public void delete(PeopleDTO p) {
        System.out.println("Eliminar cliente en Oracle" + p.toString());
    }

    @Override
    public void findById(PeopleDTO p) {
        System.out.println("Buscar cliente en Oracle" + p.toString());
    }

    @Override
    public void insert(Collection<PeopleDTO> p1) {
        for (PeopleDTO cliente : p1) {
            System.out.println("Se imserto el cliente en Oracle"+p1.toString());
        }
    }
}
