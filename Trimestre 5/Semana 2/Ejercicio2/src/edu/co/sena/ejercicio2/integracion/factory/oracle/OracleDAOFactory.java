/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.factory.oracle;

import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.oracle.EmployeedDAOOracleImpl;
import edu.co.sena.ejercicio2.integracion.entity.DAO.oracle.CustomerDAOOracleImpl;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;

/**
 *
 * @author ColsutecR
 */
public class OracleDAOFactory extends DAOAbstractFactory {

    @Override
    public EmployeedDAO crearEmployeeDAO() {
        return new EmployeedDAOOracleImpl();
    }

    @Override
    public CustommerDAO crearCustommerDAO() {
        return new CustomerDAOOracleImpl();
    }

}
