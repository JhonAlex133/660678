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

public class Pedido implements Serializable
{
	/** 
	 * This attribute maps to the column Factura_idFactura in the pedido table.
	 */
	protected Integer facturaIdfactura;

	/** 
	 * This attribute maps to the column total in the pedido table.
	 */
	protected Float total;

	/** 
	 * This attribute maps to the column subtotal in the pedido table.
	 */
	protected Float subtotal;

	/** 
	 * This attribute maps to the column impuestos in the pedido table.
	 */
	protected Float impuestos;

	/**
	 * Method 'Pedido'
	 * 
	 */
	public Pedido()
	{
	}

	/**
	 * Method 'getFacturaIdfactura'
	 * 
	 * @return Integer
	 */
	public Integer getFacturaIdfactura()
	{
		return facturaIdfactura;
	}

	/**
	 * Method 'setFacturaIdfactura'
	 * 
	 * @param facturaIdfactura
	 */
	public void setFacturaIdfactura(Integer facturaIdfactura)
	{
		this.facturaIdfactura = facturaIdfactura;
	}

	/**
	 * Method 'getTotal'
	 * 
	 * @return Float
	 */
	public Float getTotal()
	{
		return total;
	}

	/**
	 * Method 'setTotal'
	 * 
	 * @param total
	 */
	public void setTotal(Float total)
	{
		this.total = total;
	}

	/**
	 * Method 'getSubtotal'
	 * 
	 * @return Float
	 */
	public Float getSubtotal()
	{
		return subtotal;
	}

	/**
	 * Method 'setSubtotal'
	 * 
	 * @param subtotal
	 */
	public void setSubtotal(Float subtotal)
	{
		this.subtotal = subtotal;
	}

	/**
	 * Method 'getImpuestos'
	 * 
	 * @return Float
	 */
	public Float getImpuestos()
	{
		return impuestos;
	}

	/**
	 * Method 'setImpuestos'
	 * 
	 * @param impuestos
	 */
	public void setImpuestos(Float impuestos)
	{
		this.impuestos = impuestos;
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
		
		if (!(_other instanceof Pedido)) {
			return false;
		}
		
		final Pedido _cast = (Pedido) _other;
		if (facturaIdfactura == null ? _cast.facturaIdfactura != facturaIdfactura : !facturaIdfactura.equals( _cast.facturaIdfactura )) {
			return false;
		}
		
		if (total == null ? _cast.total != total : !total.equals( _cast.total )) {
			return false;
		}
		
		if (subtotal == null ? _cast.subtotal != subtotal : !subtotal.equals( _cast.subtotal )) {
			return false;
		}
		
		if (impuestos == null ? _cast.impuestos != impuestos : !impuestos.equals( _cast.impuestos )) {
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
		
		if (total != null) {
			_hashCode = 29 * _hashCode + total.hashCode();
		}
		
		if (subtotal != null) {
			_hashCode = 29 * _hashCode + subtotal.hashCode();
		}
		
		if (impuestos != null) {
			_hashCode = 29 * _hashCode + impuestos.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PedidoPk
	 */
	public PedidoPk createPk()
	{
		return new PedidoPk(facturaIdfactura);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.Pedido: " );
		ret.append( "facturaIdfactura=" + facturaIdfactura );
		ret.append( ", total=" + total );
		ret.append( ", subtotal=" + subtotal );
		ret.append( ", impuestos=" + impuestos );
		return ret.toString();
	}

}