/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.negocio.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.tiendaenlinea.integracion.dao.DomicilioCuentaDao;
import edu.co.sena.tiendaenlinea.integracion.dto.DomicilioCuenta;
import edu.co.sena.tiendaenlinea.integracion.exceptions.DomicilioCuentaDaoException;
import edu.co.sena.tiendaenlinea.integracion.factory.DomicilioCuentaDaoFactory;

public class DomicilioCuentaDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByCuenta("", "");
		// findByMunicipio("");
		// findWhereCuentaTipodocumentoEquals("");
		// findWhereCuentaNumerodocumentoEquals("");
		// findWhereTelefonoEquals("");
		// findWhereDireccionEquals("");
		// findWhereBarrioEquals("");
		// findWhereLocalidadEquals("");
		// findWhereMunicipioIdmunicipioEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			DomicilioCuentaDao _dao = getDomicilioCuentaDao();
			DomicilioCuenta _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCuenta'
	 * 
	 * @param cuentaTipodocumento
	 * @param cuentaNumerodocumento
	 */
	public static void findByCuenta(String cuentaTipodocumento, String cuentaNumerodocumento)
	{
		try {
			DomicilioCuentaDao _dao = getDomicilioCuentaDao();
			DomicilioCuenta _result[] = _dao.findByCuenta(cuentaTipodocumento, cuentaNumerodocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByMunicipio'
	 * 
	 * @param municipioIdmunicipio
	 */
	public static void findByMunicipio(String municipioIdmunicipio)
	{
		try {
			DomicilioCuentaDao _dao = getDomicilioCuentaDao();
			DomicilioCuenta _result[] = _dao.findByMunicipio(municipioIdmunicipio);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCuentaTipodocumentoEquals'
	 * 
	 * @param cuentaTipodocumento
	 */
	public static void findWhereCuentaTipodocumentoEquals(String cuentaTipodocumento)
	{
		try {
			DomicilioCuentaDao _dao = getDomicilioCuentaDao();
			DomicilioCuenta _result[] = _dao.findWhereCuentaTipodocumentoEquals(cuentaTipodocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCuentaNumerodocumentoEquals'
	 * 
	 * @param cuentaNumerodocumento
	 */
	public static void findWhereCuentaNumerodocumentoEquals(String cuentaNumerodocumento)
	{
		try {
			DomicilioCuentaDao _dao = getDomicilioCuentaDao();
			DomicilioCuenta _result[] = _dao.findWhereCuentaNumerodocumentoEquals(cuentaNumerodocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTelefonoEquals'
	 * 
	 * @param telefono
	 */
	public static void findWhereTelefonoEquals(String telefono)
	{
		try {
			DomicilioCuentaDao _dao = getDomicilioCuentaDao();
			DomicilioCuenta _result[] = _dao.findWhereTelefonoEquals(telefono);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDireccionEquals'
	 * 
	 * @param direccion
	 */
	public static void findWhereDireccionEquals(String direccion)
	{
		try {
			DomicilioCuentaDao _dao = getDomicilioCuentaDao();
			DomicilioCuenta _result[] = _dao.findWhereDireccionEquals(direccion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereBarrioEquals'
	 * 
	 * @param barrio
	 */
	public static void findWhereBarrioEquals(String barrio)
	{
		try {
			DomicilioCuentaDao _dao = getDomicilioCuentaDao();
			DomicilioCuenta _result[] = _dao.findWhereBarrioEquals(barrio);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereLocalidadEquals'
	 * 
	 * @param localidad
	 */
	public static void findWhereLocalidadEquals(String localidad)
	{
		try {
			DomicilioCuentaDao _dao = getDomicilioCuentaDao();
			DomicilioCuenta _result[] = _dao.findWhereLocalidadEquals(localidad);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereMunicipioIdmunicipioEquals'
	 * 
	 * @param municipioIdmunicipio
	 */
	public static void findWhereMunicipioIdmunicipioEquals(String municipioIdmunicipio)
	{
		try {
			DomicilioCuentaDao _dao = getDomicilioCuentaDao();
			DomicilioCuenta _result[] = _dao.findWhereMunicipioIdmunicipioEquals(municipioIdmunicipio);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getDomicilioCuentaDao'
	 * 
	 * @return DomicilioCuentaDao
	 */
	public static DomicilioCuentaDao getDomicilioCuentaDao()
	{
		return DomicilioCuentaDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(DomicilioCuenta dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getCuentaTipodocumento() );
		buf.append( ", " );
		buf.append( dto.getCuentaNumerodocumento() );
		buf.append( ", " );
		buf.append( dto.getTelefono() );
		buf.append( ", " );
		buf.append( dto.getDireccion() );
		buf.append( ", " );
		buf.append( dto.getBarrio() );
		buf.append( ", " );
		buf.append( dto.getLocalidad() );
		buf.append( ", " );
		buf.append( dto.getMunicipioIdmunicipio() );
		System.out.println( buf.toString() );
	}

}
