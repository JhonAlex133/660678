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

public class Item implements Serializable
{
	/** 
	 * This attribute maps to the column Producto_idProducto in the item table.
	 */
	protected String productoIdproducto;

	/** 
	 * This attribute maps to the column Pedido_Factura_idFactura in the item table.
	 */
	protected Integer pedidoFacturaIdfactura;

	/** 
	 * This attribute maps to the column cantidad in the item table.
	 */
	protected Integer cantidad;

	/** 
	 * This attribute maps to the column costoUnitario in the item table.
	 */
	protected Float costoUnitario;

	/** 
	 * This attribute maps to the column costoTotal in the item table.
	 */
	protected Float costoTotal;

	/**
	 * Method 'Item'
	 * 
	 */
	public Item()
	{
	}

	/**
	 * Method 'getProductoIdproducto'
	 * 
	 * @return String
	 */
	public String getProductoIdproducto()
	{
		return productoIdproducto;
	}

	/**
	 * Method 'setProductoIdproducto'
	 * 
	 * @param productoIdproducto
	 */
	public void setProductoIdproducto(String productoIdproducto)
	{
		this.productoIdproducto = productoIdproducto;
	}

	/**
	 * Method 'getPedidoFacturaIdfactura'
	 * 
	 * @return Integer
	 */
	public Integer getPedidoFacturaIdfactura()
	{
		return pedidoFacturaIdfactura;
	}

	/**
	 * Method 'setPedidoFacturaIdfactura'
	 * 
	 * @param pedidoFacturaIdfactura
	 */
	public void setPedidoFacturaIdfactura(Integer pedidoFacturaIdfactura)
	{
		this.pedidoFacturaIdfactura = pedidoFacturaIdfactura;
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return Integer
	 */
	public Integer getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(Integer cantidad)
	{
		this.cantidad = cantidad;
	}

	/**
	 * Method 'getCostoUnitario'
	 * 
	 * @return Float
	 */
	public Float getCostoUnitario()
	{
		return costoUnitario;
	}

	/**
	 * Method 'setCostoUnitario'
	 * 
	 * @param costoUnitario
	 */
	public void setCostoUnitario(Float costoUnitario)
	{
		this.costoUnitario = costoUnitario;
	}

	/**
	 * Method 'getCostoTotal'
	 * 
	 * @return Float
	 */
	public Float getCostoTotal()
	{
		return costoTotal;
	}

	/**
	 * Method 'setCostoTotal'
	 * 
	 * @param costoTotal
	 */
	public void setCostoTotal(Float costoTotal)
	{
		this.costoTotal = costoTotal;
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
		
		if (!(_other instanceof Item)) {
			return false;
		}
		
		final Item _cast = (Item) _other;
		if (productoIdproducto == null ? _cast.productoIdproducto != productoIdproducto : !productoIdproducto.equals( _cast.productoIdproducto )) {
			return false;
		}
		
		if (pedidoFacturaIdfactura == null ? _cast.pedidoFacturaIdfactura != pedidoFacturaIdfactura : !pedidoFacturaIdfactura.equals( _cast.pedidoFacturaIdfactura )) {
			return false;
		}
		
		if (cantidad == null ? _cast.cantidad != cantidad : !cantidad.equals( _cast.cantidad )) {
			return false;
		}
		
		if (costoUnitario == null ? _cast.costoUnitario != costoUnitario : !costoUnitario.equals( _cast.costoUnitario )) {
			return false;
		}
		
		if (costoTotal == null ? _cast.costoTotal != costoTotal : !costoTotal.equals( _cast.costoTotal )) {
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
		if (productoIdproducto != null) {
			_hashCode = 29 * _hashCode + productoIdproducto.hashCode();
		}
		
		if (pedidoFacturaIdfactura != null) {
			_hashCode = 29 * _hashCode + pedidoFacturaIdfactura.hashCode();
		}
		
		if (cantidad != null) {
			_hashCode = 29 * _hashCode + cantidad.hashCode();
		}
		
		if (costoUnitario != null) {
			_hashCode = 29 * _hashCode + costoUnitario.hashCode();
		}
		
		if (costoTotal != null) {
			_hashCode = 29 * _hashCode + costoTotal.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ItemPk
	 */
	public ItemPk createPk()
	{
		return new ItemPk(productoIdproducto, pedidoFacturaIdfactura);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.integracion.dto.Item: " );
		ret.append( "productoIdproducto=" + productoIdproducto );
		ret.append( ", pedidoFacturaIdfactura=" + pedidoFacturaIdfactura );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", costoUnitario=" + costoUnitario );
		ret.append( ", costoTotal=" + costoTotal );
		return ret.toString();
	}

}
