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

public class Categoria implements Serializable
{
	/** 
	 * This attribute maps to the column idCategoria in the categoria table.
	 */
	protected Integer idCategoria;

	/** 
	 * This attribute maps to the column nombreCategoria in the categoria table.
	 */
	protected String nombreCategoria;

	/** 
	 * This attribute maps to the column activa in the categoria table.
	 */
	protected Short activa;

	/** 
	 * This attribute maps to the column pariente in the categoria table.
	 */
	protected Integer pariente;

	/**
	 * Method 'Categoria'
	 * 
	 */
	public Categoria()
	{
	}

	/**
	 * Method 'getIdCategoria'
	 * 
	 * @return Integer
	 */
	public Integer getIdCategoria()
	{
		return idCategoria;
	}

	/**
	 * Method 'setIdCategoria'
	 * 
	 * @param idCategoria
	 */
	public void setIdCategoria(Integer idCategoria)
	{
		this.idCategoria = idCategoria;
	}

	/**
	 * Method 'getNombreCategoria'
	 * 
	 * @return String
	 */
	public String getNombreCategoria()
	{
		return nombreCategoria;
	}

	/**
	 * Method 'setNombreCategoria'
	 * 
	 * @param nombreCategoria
	 */
	public void setNombreCategoria(String nombreCategoria)
	{
		this.nombreCategoria = nombreCategoria;
	}

	/**
	 * Method 'getActiva'
	 * 
	 * @return Short
	 */
	public Short getActiva()
	{
		return activa;
	}

	/**
	 * Method 'setActiva'
	 * 
	 * @param activa
	 */
	public void setActiva(Short activa)
	{
		this.activa = activa;
	}

	/**
	 * Method 'getPariente'
	 * 
	 * @return Integer
	 */
	public Integer getPariente()
	{
		return pariente;
	}

	/**
	 * Method 'setPariente'
	 * 
	 * @param pariente
	 */
	public void setPariente(Integer pariente)
	{
		this.pariente = pariente;
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
		
		if (!(_other instanceof Categoria)) {
			return false;
		}
		
		final Categoria _cast = (Categoria) _other;
		if (idCategoria == null ? _cast.idCategoria != idCategoria : !idCategoria.equals( _cast.idCategoria )) {
			return false;
		}
		
		if (nombreCategoria == null ? _cast.nombreCategoria != nombreCategoria : !nombreCategoria.equals( _cast.nombreCategoria )) {
			return false;
		}
		
		if (activa == null ? _cast.activa != activa : !activa.equals( _cast.activa )) {
			return false;
		}
		
		if (pariente == null ? _cast.pariente != pariente : !pariente.equals( _cast.pariente )) {
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
		if (idCategoria != null) {
			_hashCode = 29 * _hashCode + idCategoria.hashCode();
		}
		
		if (nombreCategoria != null) {
			_hashCode = 29 * _hashCode + nombreCategoria.hashCode();
		}
		
		if (activa != null) {
			_hashCode = 29 * _hashCode + activa.hashCode();
		}
		
		if (pariente != null) {
			_hashCode = 29 * _hashCode + pariente.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CategoriaPk
	 */
	public CategoriaPk createPk()
	{
		return new CategoriaPk(idCategoria);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.Categoria: " );
		ret.append( "idCategoria=" + idCategoria );
		ret.append( ", nombreCategoria=" + nombreCategoria );
		ret.append( ", activa=" + activa );
		ret.append( ", pariente=" + pariente );
		return ret.toString();
	}

}
