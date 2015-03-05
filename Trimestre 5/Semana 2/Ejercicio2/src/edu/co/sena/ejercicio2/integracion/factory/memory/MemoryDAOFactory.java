/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio2.integracion.factory.memory;

import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.memory.CustommerDAOMemoryImpl;
import edu.co.sena.ejercicio2.integracion.entity.DAO.memory.EmployeedDAOMemoryImpl;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;

/**
 *
 * @author ColsutecR
 */
public class MemoryDAOFactory  extends DAOAbstractFactory {

    @Override
    public EmployeedDAO crearEmployeeDAO() {
        return new EmployeedDAOMemoryImpl();
    }

    @Override
    public CustommerDAO crearCustommerDAO() {
        return new CustommerDAOMemoryImpl();
    }
    
}
