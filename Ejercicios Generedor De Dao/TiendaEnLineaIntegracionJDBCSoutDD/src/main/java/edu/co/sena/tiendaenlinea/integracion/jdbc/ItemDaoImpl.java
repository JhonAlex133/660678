/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.jdbc;

import edu.co.sena.tiendaenlinea.integracion.dao.*;
import edu.co.sena.tiendaenlinea.integracion.factory.*;
import edu.co.sena.tiendaenlinea.integracion.dto.*;
import edu.co.sena.tiendaenlinea.integracion.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItemDaoImpl extends AbstractDAO implements ItemDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT Producto_idProducto, Pedido_Factura_idFactura, cantidad, costoUnitario, costoTotal FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( Producto_idProducto, Pedido_Factura_idFactura, cantidad, costoUnitario, costoTotal ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET Producto_idProducto = ?, Pedido_Factura_idFactura = ?, cantidad = ?, costoUnitario = ?, costoTotal = ? WHERE Producto_idProducto = ? AND Pedido_Factura_idFactura = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE Producto_idProducto = ? AND Pedido_Factura_idFactura = ?";

	/** 
	 * Index of column Producto_idProducto
	 */
	protected static final int COLUMN_PRODUCTO_IDPRODUCTO = 1;

	/** 
	 * Index of column Pedido_Factura_idFactura
	 */
	protected static final int COLUMN_PEDIDO_FACTURA_IDFACTURA = 2;

	/** 
	 * Index of column cantidad
	 */
	protected static final int COLUMN_CANTIDAD = 3;

	/** 
	 * Index of column costoUnitario
	 */
	protected static final int COLUMN_COSTO_UNITARIO = 4;

	/** 
	 * Index of column costoTotal
	 */
	protected static final int COLUMN_COSTO_TOTAL = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column Producto_idProducto
	 */
	protected static final int PK_COLUMN_PRODUCTO_IDPRODUCTO = 1;

	/** 
	 * Index of primary-key column Pedido_Factura_idFactura
	 */
	protected static final int PK_COLUMN_PEDIDO_FACTURA_IDFACTURA = 2;

	/** 
	 * Inserts a new row in the item table.
	 */
	public ItemPk insert(Item dto) throws ItemDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isProductoIdproductoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Producto_idProducto" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPedidoFacturaIdfacturaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Pedido_Factura_idFactura" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCantidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "cantidad" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCostoUnitarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "costoUnitario" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCostoTotalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "costoTotal" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isProductoIdproductoModified()) {
				stmt.setString( index++, dto.getProductoIdproducto() );
			}
		
			if (dto.isPedidoFacturaIdfacturaModified()) {
				if (dto.getPedidoFacturaIdfactura() != null) {
					stmt.setInt( index++, dto.getPedidoFacturaIdfactura().intValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.INTEGER);
				}
		
			}
		
			if (dto.isCantidadModified()) {
				if (dto.getCantidad() != null) {
					stmt.setInt( index++, dto.getCantidad().intValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.INTEGER);
				}
		
			}
		
			if (dto.isCostoUnitarioModified()) {
				if (dto.getCostoUnitario() != null) {
					stmt.setFloat( index++, dto.getCostoUnitario().floatValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.FLOAT);
				}
		
			}
		
			if (dto.isCostoTotalModified()) {
				if (dto.getCostoTotal() != null) {
					stmt.setFloat( index++, dto.getCostoTotal().floatValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.FLOAT);
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the item table.
	 */
	public void update(ItemPk pk, Item dto) throws ItemDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isProductoIdproductoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Producto_idProducto=?" );
				modified=true;
			}
		
			if (dto.isPedidoFacturaIdfacturaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Pedido_Factura_idFactura=?" );
				modified=true;
			}
		
			if (dto.isCantidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "cantidad=?" );
				modified=true;
			}
		
			if (dto.isCostoUnitarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "costoUnitario=?" );
				modified=true;
			}
		
			if (dto.isCostoTotalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "costoTotal=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE Producto_idProducto=? AND Pedido_Factura_idFactura=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isProductoIdproductoModified()) {
				stmt.setString( index++, dto.getProductoIdproducto() );
			}
		
			if (dto.isPedidoFacturaIdfacturaModified()) {
				if (dto.getPedidoFacturaIdfactura() != null) {
					stmt.setInt( index++, dto.getPedidoFacturaIdfactura().intValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.INTEGER);
				}
		
			}
		
			if (dto.isCantidadModified()) {
				if (dto.getCantidad() != null) {
					stmt.setInt( index++, dto.getCantidad().intValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.INTEGER);
				}
		
			}
		
			if (dto.isCostoUnitarioModified()) {
				if (dto.getCostoUnitario() != null) {
					stmt.setFloat( index++, dto.getCostoUnitario().floatValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.FLOAT);
				}
		
			}
		
			if (dto.isCostoTotalModified()) {
				if (dto.getCostoTotal() != null) {
					stmt.setFloat( index++, dto.getCostoTotal().floatValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.FLOAT);
				}
		
			}
		
			stmt.setString( index++, pk.getProductoIdproducto() );
			if (pk.getPedidoFacturaIdfactura() != null) {
				stmt.setInt( index++, pk.getPedidoFacturaIdfactura().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the item table.
	 */
	public void delete(ItemPk pk) throws ItemDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setString( 1, pk.getProductoIdproducto() );
			if (pk.getPedidoFacturaIdfactura() != null) {
				stmt.setInt( 2, pk.getPedidoFacturaIdfactura().intValue() );
			} else {
				stmt.setNull(2, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the item table that matches the specified primary-key value.
	 */
	public Item findByPrimaryKey(ItemPk pk) throws ItemDaoException
	{
		return findByPrimaryKey( pk.getProductoIdproducto(), pk.getPedidoFacturaIdfactura() );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'Producto_idProducto = :productoIdproducto AND Pedido_Factura_idFactura = :pedidoFacturaIdfactura'.
	 */
	public Item findByPrimaryKey(String productoIdproducto, Integer pedidoFacturaIdfactura) throws ItemDaoException
	{
		Item ret[] = findByDynamicSelect( SQL_SELECT + " WHERE Producto_idProducto = ? AND Pedido_Factura_idFactura = ?", new Object[] { productoIdproducto, pedidoFacturaIdfactura } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the item table that match the criteria ''.
	 */
	public Item[] findAll() throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY Producto_idProducto, Pedido_Factura_idFactura", null );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'Pedido_Factura_idFactura = :pedidoFacturaIdfactura'.
	 */
	public Item[] findByPedido(Integer pedidoFacturaIdfactura) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Pedido_Factura_idFactura = ?", new Object[] { pedidoFacturaIdfactura } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'Producto_idProducto = :productoIdproducto'.
	 */
	public Item[] findByProducto(String productoIdproducto) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Producto_idProducto = ?", new Object[] { productoIdproducto } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'Producto_idProducto = :productoIdproducto'.
	 */
	public Item[] findWhereProductoIdproductoEquals(String productoIdproducto) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Producto_idProducto = ? ORDER BY Producto_idProducto", new Object[] { productoIdproducto } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'Pedido_Factura_idFactura = :pedidoFacturaIdfactura'.
	 */
	public Item[] findWherePedidoFacturaIdfacturaEquals(Integer pedidoFacturaIdfactura) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Pedido_Factura_idFactura = ? ORDER BY Pedido_Factura_idFactura", new Object[] { pedidoFacturaIdfactura } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'cantidad = :cantidad'.
	 */
	public Item[] findWhereCantidadEquals(Integer cantidad) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE cantidad = ? ORDER BY cantidad", new Object[] { cantidad } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'costoUnitario = :costoUnitario'.
	 */
	public Item[] findWhereCostoUnitarioEquals(Float costoUnitario) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE costoUnitario = ? ORDER BY costoUnitario", new Object[] { costoUnitario } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'costoTotal = :costoTotal'.
	 */
	public Item[] findWhereCostoTotalEquals(Float costoTotal) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE costoTotal = ? ORDER BY costoTotal", new Object[] { costoTotal } );
	}

	/**
	 * Method 'ItemDaoImpl'
	 * 
	 */
	public ItemDaoImpl()
	{
	}

	/**
	 * Method 'ItemDaoImpl'
	 * 
	 * @param userConn
	 */
	public ItemDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "tiendaenlinea.item";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Item fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Item dto = new Item();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Item[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Item dto = new Item();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Item ret[] = new Item[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Item dto, ResultSet rs) throws SQLException
	{
		dto.setProductoIdproducto( rs.getString( COLUMN_PRODUCTO_IDPRODUCTO ) );
		dto.setPedidoFacturaIdfactura( new Integer( rs.getInt(COLUMN_PEDIDO_FACTURA_IDFACTURA) ) );
		dto.setCantidad( new Integer( rs.getInt(COLUMN_CANTIDAD) ) );
		dto.setCostoUnitario( new Float( rs.getFloat(COLUMN_COSTO_UNITARIO) ) );
		dto.setCostoTotal( new Float( rs.getFloat(COLUMN_COSTO_TOTAL) ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Item dto)
	{
		dto.setProductoIdproductoModified( false );
		dto.setPedidoFacturaIdfacturaModified( false );
		dto.setCantidadModified( false );
		dto.setCostoUnitarioModified( false );
		dto.setCostoTotalModified( false );
	}

	/** 
	 * Returns all rows from the item table that match the specified arbitrary SQL statement
	 */
	public Item[] findByDynamicSelect(String sql, Object[] sqlParams) throws ItemDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the item table that match the specified arbitrary SQL statement
	 */
	public Item[] findByDynamicWhere(String sql, Object[] sqlParams) throws ItemDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
