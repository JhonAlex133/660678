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

public interface ItemDao
{
	/** 
	 * Inserts a new row in the item table.
	 */
	public ItemPk insert(Item dto) throws ItemDaoException;

	/** 
	 * Updates a single row in the item table.
	 */
	public void update(ItemPk pk, Item dto) throws ItemDaoException;

	/** 
	 * Deletes a single row in the item table.
	 */
	public void delete(ItemPk pk) throws ItemDaoException;

	/** 
	 * Returns the rows from the item table that matches the specified primary-key value.
	 */
	public Item findByPrimaryKey(ItemPk pk) throws ItemDaoException;

	/** 
	 * Returns all rows from the item table that match the criteria 'Producto_idProducto = :productoIdproducto AND Pedido_Factura_idFactura = :pedidoFacturaIdfactura'.
	 */
	public Item findByPrimaryKey(String productoIdproducto, Integer pedidoFacturaIdfactura) throws ItemDaoException;

	/** 
	 * Returns all rows from the item table that match the criteria ''.
	 */
	public Item[] findAll() throws ItemDaoException;

	/** 
	 * Returns all rows from the item table that match the criteria 'Pedido_Factura_idFactura = :pedidoFacturaIdfactura'.
	 */
	public Item[] findByPedido(Integer pedidoFacturaIdfactura) throws ItemDaoException;

	/** 
	 * Returns all rows from the item table that match the criteria 'Producto_idProducto = :productoIdproducto'.
	 */
	public Item[] findByProducto(String productoIdproducto) throws ItemDaoException;

	/** 
	 * Returns all rows from the item table that match the criteria 'Producto_idProducto = :productoIdproducto'.
	 */
	public Item[] findWhereProductoIdproductoEquals(String productoIdproducto) throws ItemDaoException;

	/** 
	 * Returns all rows from the item table that match the criteria 'Pedido_Factura_idFactura = :pedidoFacturaIdfactura'.
	 */
	public Item[] findWherePedidoFacturaIdfacturaEquals(Integer pedidoFacturaIdfactura) throws ItemDaoException;

	/** 
	 * Returns all rows from the item table that match the criteria 'cantidad = :cantidad'.
	 */
	public Item[] findWhereCantidadEquals(Integer cantidad) throws ItemDaoException;

	/** 
	 * Returns all rows from the item table that match the criteria 'costoUnitario = :costoUnitario'.
	 */
	public Item[] findWhereCostoUnitarioEquals(Float costoUnitario) throws ItemDaoException;

	/** 
	 * Returns all rows from the item table that match the criteria 'costoTotal = :costoTotal'.
	 */
	public Item[] findWhereCostoTotalEquals(Float costoTotal) throws ItemDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the item table that match the specified arbitrary SQL statement
	 */
	public Item[] findByDynamicSelect(String sql, Object[] sqlParams) throws ItemDaoException;

	/** 
	 * Returns all rows from the item table that match the specified arbitrary SQL statement
	 */
	public Item[] findByDynamicWhere(String sql, Object[] sqlParams) throws ItemDaoException;

}
