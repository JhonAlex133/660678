/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio2.integracion.factory.mysql;

import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.mysql.CustommerDAOMysqlImpl;
import edu.co.sena.ejercicio2.integracion.entity.DAO.mysql.EmployeedDAOMysqlImpl;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;

/**
 *
 * @author ColsutecR
 */
public class MysqlDAOFactory  extends DAOAbstractFactory{

    @Override
    public EmployeedDAO crearEmployeeDAO() {
        return new EmployeedDAOMysqlImpl();
    }

    @Override
    public CustommerDAO crearCustommerDAO() {
        return new CustommerDAOMysqlImpl();
    }
    
}
