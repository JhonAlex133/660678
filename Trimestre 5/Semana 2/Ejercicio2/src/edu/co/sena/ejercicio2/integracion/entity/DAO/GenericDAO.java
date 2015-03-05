/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio2.integracion.entity.DAO;

import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author ColsutecR
 */
public interface GenericDAO {
    
    public void insert(PeopleDTO p);
    public void update(PeopleDTO p);
    public void delete(PeopleDTO p);
    public void findById(PeopleDTO p);
    
    public void insert(Collection<PeopleDTO> p1);
    
}
