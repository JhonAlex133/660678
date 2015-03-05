/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio2.integracion.entity.DAO.mysql;

import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author ColsutecR
 */
public class CustommerDAOMysqlImpl implements CustommerDAO{
    
    @Override
    public void insert(PeopleDTO p) {
        System.out.println("Insertar cliente en MySQL" + p.toString());
    }

    @Override
    public void update(PeopleDTO p) {
        System.out.println("Actualiza cliente en MySQL" + p.toString());
    }

    @Override
    public void delete(PeopleDTO p) {
        System.out.println("Eliminar cliente en MySQL" + p.toString());
    }

    @Override
    public void findById(PeopleDTO p) {
        System.out.println("Buscar cliente en MySQL" + p.toString());    
    }

    @Override
    public void insert(Collection<PeopleDTO> p1) {
        for (PeopleDTO cliente : p1) {
            System.out.println("Se imserto el cliente en MySQL"+p1.toString());
        }
    }
    
}
