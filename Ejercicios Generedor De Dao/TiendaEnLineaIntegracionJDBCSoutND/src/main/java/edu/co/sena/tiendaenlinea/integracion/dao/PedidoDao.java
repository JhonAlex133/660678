/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dao;

import edu.co.sena.tiendaenlinea.integracion.dto.*;
import edu.co.sena.tiendaenlinea.integracion.exceptions.*;

public interface PedidoDao
{
	/** 
	 * Inserts a new row in the pedido table.
	 */
	public PedidoPk insert(Pedido dto) throws PedidoDaoException;

	/** 
	 * Updates a single row in the pedido table.
	 */
	public void update(PedidoPk pk, Pedido dto) throws PedidoDaoException;

	/** 
	 * Deletes a single row in the pedido table.
	 */
	public void delete(PedidoPk pk) throws PedidoDaoException;

	/** 
	 * Returns the rows from the pedido table that matches the specified primary-key value.
	 */
	public Pedido findByPrimaryKey(PedidoPk pk) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pedido findByPrimaryKey(Integer facturaIdfactura) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria ''.
	 */
	public Pedido[] findAll() throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pedido[] findByFactura(Integer facturaIdfactura) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pedido[] findWhereFacturaIdfacturaEquals(Integer facturaIdfactura) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'total = :total'.
	 */
	public Pedido[] findWhereTotalEquals(Float total) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'subtotal = :subtotal'.
	 */
	public Pedido[] findWhereSubtotalEquals(Float subtotal) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'impuestos = :impuestos'.
	 */
	public Pedido[] findWhereImpuestosEquals(Float impuestos) throws PedidoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the pedido table that match the specified arbitrary SQL statement
	 */
	public Pedido[] findByDynamicSelect(String sql, Object[] sqlParams) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the specified arbitrary SQL statement
	 */
	public Pedido[] findByDynamicWhere(String sql, Object[] sqlParams) throws PedidoDaoException;

}
