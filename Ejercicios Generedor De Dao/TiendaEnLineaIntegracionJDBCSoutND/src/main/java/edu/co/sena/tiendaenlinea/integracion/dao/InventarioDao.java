/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dao;

import java.util.Date;
import edu.co.sena.tiendaenlinea.integracion.dto.*;
import edu.co.sena.tiendaenlinea.integracion.exceptions.*;

public interface InventarioDao
{
	/** 
	 * Inserts a new row in the inventario table.
	 */
	public InventarioPk insert(Inventario dto) throws InventarioDaoException;

	/** 
	 * Updates a single row in the inventario table.
	 */
	public void update(InventarioPk pk, Inventario dto) throws InventarioDaoException;

	/** 
	 * Deletes a single row in the inventario table.
	 */
	public void delete(InventarioPk pk) throws InventarioDaoException;

	/** 
	 * Returns the rows from the inventario table that matches the specified primary-key value.
	 */
	public Inventario findByPrimaryKey(InventarioPk pk) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'idInventario = :idInventario AND Producto_idProducto = :productoIdproducto AND Proveedor_idProveedor = :proveedorIdproveedor AND Proveedor_tipoDeIdentificacion = :proveedorTipodeidentificacion'.
	 */
	public Inventario findByPrimaryKey(Integer idInventario, String productoIdproducto, String proveedorIdproveedor, String proveedorTipodeidentificacion) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria ''.
	 */
	public Inventario[] findAll() throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Producto_idProducto = :productoIdproducto'.
	 */
	public Inventario[] findByProducto(String productoIdproducto) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Proveedor_idProveedor = :proveedorIdproveedor AND Proveedor_tipoDeIdentificacion = :proveedorTipodeidentificacion'.
	 */
	public Inventario[] findByProveedor(String proveedorIdproveedor, String proveedorTipodeidentificacion) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'idInventario = :idInventario'.
	 */
	public Inventario[] findWhereIdInventarioEquals(Integer idInventario) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'fecha = :fecha'.
	 */
	public Inventario[] findWhereFechaEquals(Date fecha) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'cantidad = :cantidad'.
	 */
	public Inventario[] findWhereCantidadEquals(Integer cantidad) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Producto_idProducto = :productoIdproducto'.
	 */
	public Inventario[] findWhereProductoIdproductoEquals(String productoIdproducto) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Proveedor_idProveedor = :proveedorIdproveedor'.
	 */
	public Inventario[] findWhereProveedorIdproveedorEquals(String proveedorIdproveedor) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Proveedor_tipoDeIdentificacion = :proveedorTipodeidentificacion'.
	 */
	public Inventario[] findWhereProveedorTipodeidentificacionEquals(String proveedorTipodeidentificacion) throws InventarioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the inventario table that match the specified arbitrary SQL statement
	 */
	public Inventario[] findByDynamicSelect(String sql, Object[] sqlParams) throws InventarioDaoException;

	/** 
	 * Returns all rows from the inventario table that match the specified arbitrary SQL statement
	 */
	public Inventario[] findByDynamicWhere(String sql, Object[] sqlParams) throws InventarioDaoException;

}
