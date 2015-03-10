/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the pedido table.
 */
public class PedidoPk implements Serializable
{
	protected Integer facturaIdfactura;

	/** 
	 * Sets the value of facturaIdfactura
	 */
	public void setFacturaIdfactura(Integer facturaIdfactura)
	{
		this.facturaIdfactura = facturaIdfactura;
	}

	/** 
	 * Gets the value of facturaIdfactura
	 */
	public Integer getFacturaIdfactura()
	{
		return facturaIdfactura;
	}

	/**
	 * Method 'PedidoPk'
	 * 
	 */
	public PedidoPk()
	{
	}

	/**
	 * Method 'PedidoPk'
	 * 
	 * @param facturaIdfactura
	 */
	public PedidoPk(final Integer facturaIdfactura)
	{
		this.facturaIdfactura = facturaIdfactura;
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
		
		if (!(_other instanceof PedidoPk)) {
			return false;
		}
		
		final PedidoPk _cast = (PedidoPk) _other;
		if (facturaIdfactura == null ? _cast.facturaIdfactura != facturaIdfactura : !facturaIdfactura.equals( _cast.facturaIdfactura )) {
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
		if (facturaIdfactura != null) {
			_hashCode = 29 * _hashCode + facturaIdfactura.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.PedidoPk: " );
		ret.append( "facturaIdfactura=" + facturaIdfactura );
		return ret.toString();
	}

}