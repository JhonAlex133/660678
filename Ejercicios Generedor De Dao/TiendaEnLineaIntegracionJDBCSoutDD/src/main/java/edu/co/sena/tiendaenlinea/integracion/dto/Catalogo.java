/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dto;

import edu.co.sena.tiendaenlinea.integracion.dao.*;
import edu.co.sena.tiendaenlinea.integracion.factory.*;
import edu.co.sena.tiendaenlinea.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Catalogo implements Serializable
{
	/** 
	 * This attribute maps to the column idCatalogo in the catalogo table.
	 */
	protected Integer idCatalogo;

	/** 
	 * This attribute represents whether the attribute idCatalogo has been modified since being read from the database.
	 */
	protected boolean idCatalogoModified = false;

	/** 
	 * This attribute maps to the column nombreCatalogo in the catalogo table.
	 */
	protected String nombreCatalogo;

	/** 
	 * This attribute represents whether the attribute nombreCatalogo has been modified since being read from the database.
	 */
	protected boolean nombreCatalogoModified = false;

	/** 
	 * This attribute maps to the column descripcion in the catalogo table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/**
	 * Method 'Catalogo'
	 * 
	 */
	public Catalogo()
	{
	}

	/**
	 * Method 'getIdCatalogo'
	 * 
	 * @return Integer
	 */
	public Integer getIdCatalogo()
	{
		return idCatalogo;
	}

	/**
	 * Method 'setIdCatalogo'
	 * 
	 * @param idCatalogo
	 */
	public void setIdCatalogo(Integer idCatalogo)
	{
		this.idCatalogo = idCatalogo;
		this.idCatalogoModified = true;
	}

	/** 
	 * Sets the value of idCatalogoModified
	 */
	public void setIdCatalogoModified(boolean idCatalogoModified)
	{
		this.idCatalogoModified = idCatalogoModified;
	}

	/** 
	 * Gets the value of idCatalogoModified
	 */
	public boolean isIdCatalogoModified()
	{
		return idCatalogoModified;
	}

	/**
	 * Method 'getNombreCatalogo'
	 * 
	 * @return String
	 */
	public String getNombreCatalogo()
	{
		return nombreCatalogo;
	}

	/**
	 * Method 'setNombreCatalogo'
	 * 
	 * @param nombreCatalogo
	 */
	public void setNombreCatalogo(String nombreCatalogo)
	{
		this.nombreCatalogo = nombreCatalogo;
		this.nombreCatalogoModified = true;
	}

	/** 
	 * Sets the value of nombreCatalogoModified
	 */
	public void setNombreCatalogoModified(boolean nombreCatalogoModified)
	{
		this.nombreCatalogoModified = nombreCatalogoModified;
	}

	/** 
	 * Gets the value of nombreCatalogoModified
	 */
	public boolean isNombreCatalogoModified()
	{
		return nombreCatalogoModified;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
		this.descripcionModified = true;
	}

	/** 
	 * Sets the value of descripcionModified
	 */
	public void setDescripcionModified(boolean descripcionModified)
	{
		this.descripcionModified = descripcionModified;
	}

	/** 
	 * Gets the value of descripcionModified
	 */
	public boolean isDescripcionModified()
	{
		return descripcionModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Catalogo)) {
			return false;
		}
		
		final Catalogo _cast = (Catalogo) _other;
		if (idCatalogo == null ? _cast.idCatalogo != idCatalogo : !idCatalogo.equals( _cast.idCatalogo )) {
			return false;
		}
		
		if (idCatalogoModified != _cast.idCatalogoModified) {
			return false;
		}
		
		if (nombreCatalogo == null ? _cast.nombreCatalogo != nombreCatalogo : !nombreCatalogo.equals( _cast.nombreCatalogo )) {
			return false;
		}
		
		if (nombreCatalogoModified != _cast.nombreCatalogoModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idCatalogo != null) {
			_hashCode = 29 * _hashCode + idCatalogo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (idCatalogoModified ? 1 : 0);
		if (nombreCatalogo != null) {
			_hashCode = 29 * _hashCode + nombreCatalogo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreCatalogoModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CatalogoPk
	 */
	public CatalogoPk createPk()
	{
		return new CatalogoPk(idCatalogo);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.Catalogo: " );
		ret.append( "idCatalogo=" + idCatalogo );
		ret.append( ", nombreCatalogo=" + nombreCatalogo );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}
