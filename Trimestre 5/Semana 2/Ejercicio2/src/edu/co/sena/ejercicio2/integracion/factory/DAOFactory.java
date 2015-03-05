/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio2.integracion.factory;

import edu.co.sena.ejercicio2.integracion.entity.DAO.CustommerDAO;
import edu.co.sena.ejercicio2.integracion.entity.DAO.EmployeedDAO;

/**
 *
 * @author ColsutecR
 */
public interface DAOFactory {
    
    public EmployeedDAO crearEmployeeDAO();
    public CustommerDAO crearCustommerDAO();
    
}
