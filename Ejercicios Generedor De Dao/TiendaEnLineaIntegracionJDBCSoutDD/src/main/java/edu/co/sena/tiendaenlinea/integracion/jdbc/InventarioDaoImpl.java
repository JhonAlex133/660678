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
import java.util.Date;
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

public class InventarioDaoImpl extends AbstractDAO implements InventarioDao
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
	protected final String SQL_SELECT = "SELECT idInventario, fecha, cantidad, Producto_idProducto, Proveedor_idProveedor, Proveedor_tipoDeIdentificacion FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idInventario, fecha, cantidad, Producto_idProducto, Proveedor_idProveedor, Proveedor_tipoDeIdentificacion ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idInventario = ?, fecha = ?, cantidad = ?, Producto_idProducto = ?, Proveedor_idProveedor = ?, Proveedor_tipoDeIdentificacion = ? WHERE idInventario = ? AND Producto_idProducto = ? AND Proveedor_idProveedor = ? AND Proveedor_tipoDeIdentificacion = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idInventario = ? AND Producto_idProducto = ? AND Proveedor_idProveedor = ? AND Proveedor_tipoDeIdentificacion = ?";

	/** 
	 * Index of column idInventario
	 */
	protected static final int COLUMN_ID_INVENTARIO = 1;

	/** 
	 * Index of column fecha
	 */
	protected static final int COLUMN_FECHA = 2;

	/** 
	 * Index of column cantidad
	 */
	protected static final int COLUMN_CANTIDAD = 3;

	/** 
	 * Index of column Producto_idProducto
	 */
	protected static final int COLUMN_PRODUCTO_IDPRODUCTO = 4;

	/** 
	 * Index of column Proveedor_idProveedor
	 */
	protected static final int COLUMN_PROVEEDOR_IDPROVEEDOR = 5;

	/** 
	 * Index of column Proveedor_tipoDeIdentificacion
	 */
	protected static final int COLUMN_PROVEEDOR_TIPODEIDENTIFICACION = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column idInventario
	 */
	protected static final int PK_COLUMN_ID_INVENTARIO = 1;

	/** 
	 * Index of primary-key column Producto_idProducto
	 */
	protected static final int PK_COLUMN_PRODUCTO_IDPRODUCTO = 2;

	/** 
	 * Index of primary-key column Proveedor_idProveedor
	 */
	protected static final int PK_COLUMN_PROVEEDOR_IDPROVEEDOR = 3;

	/** 
	 * Index of primary-key column Proveedor_tipoDeIdentificacion
	 */
	protected static final int PK_COLUMN_PROVEEDOR_TIPODEIDENTIFICACION = 4;

	/** 
	 * Inserts a new row in the inventario table.
	 */
	public InventarioPk insert(Inventario dto) throws InventarioDaoException
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
			if (dto.isIdInventarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "idInventario" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "fecha" );
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
		
			if (dto.isProductoIdproductoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Producto_idProducto" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isProveedorIdproveedorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Proveedor_idProveedor" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isProveedorTipodeidentificacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Proveedor_tipoDeIdentificacion" );
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
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdInventarioModified()) {
				if (dto.getIdInventario() != null) {
					stmt.setInt( index++, dto.getIdInventario().intValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.INTEGER);
				}
		
			}
		
			if (dto.isFechaModified()) {
				stmt.setDate(index++, dto.getFecha()==null ? null : new java.sql.Date( dto.getFecha().getTime() ) );
			}
		
			if (dto.isCantidadModified()) {
				if (dto.getCantidad() != null) {
					stmt.setInt( index++, dto.getCantidad().intValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.INTEGER);
				}
		
			}
		
			if (dto.isProductoIdproductoModified()) {
				stmt.setString( index++, dto.getProductoIdproducto() );
			}
		
			if (dto.isProveedorIdproveedorModified()) {
				stmt.setString( index++, dto.getProveedorIdproveedor() );
			}
		
			if (dto.isProveedorTipodeidentificacionModified()) {
				stmt.setString( index++, dto.getProveedorTipodeidentificacion() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdInventario( new Integer( rs.getInt(1) ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new InventarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the inventario table.
	 */
	public void update(InventarioPk pk, Inventario dto) throws InventarioDaoException
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
			if (dto.isIdInventarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "idInventario=?" );
				modified=true;
			}
		
			if (dto.isFechaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "fecha=?" );
				modified=true;
			}
		
			if (dto.isCantidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "cantidad=?" );
				modified=true;
			}
		
			if (dto.isProductoIdproductoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Producto_idProducto=?" );
				modified=true;
			}
		
			if (dto.isProveedorIdproveedorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Proveedor_idProveedor=?" );
				modified=true;
			}
		
			if (dto.isProveedorTipodeidentificacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Proveedor_tipoDeIdentificacion=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE idInventario=? AND Producto_idProducto=? AND Proveedor_idProveedor=? AND Proveedor_tipoDeIdentificacion=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdInventarioModified()) {
				if (dto.getIdInventario() != null) {
					stmt.setInt( index++, dto.getIdInventario().intValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.INTEGER);
				}
		
			}
		
			if (dto.isFechaModified()) {
				stmt.setDate(index++, dto.getFecha()==null ? null : new java.sql.Date( dto.getFecha().getTime() ) );
			}
		
			if (dto.isCantidadModified()) {
				if (dto.getCantidad() != null) {
					stmt.setInt( index++, dto.getCantidad().intValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.INTEGER);
				}
		
			}
		
			if (dto.isProductoIdproductoModified()) {
				stmt.setString( index++, dto.getProductoIdproducto() );
			}
		
			if (dto.isProveedorIdproveedorModified()) {
				stmt.setString( index++, dto.getProveedorIdproveedor() );
			}
		
			if (dto.isProveedorTipodeidentificacionModified()) {
				stmt.setString( index++, dto.getProveedorTipodeidentificacion() );
			}
		
			if (pk.getIdInventario() != null) {
				stmt.setInt( index++, pk.getIdInventario().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, pk.getProductoIdproducto() );
			stmt.setString( index++, pk.getProveedorIdproveedor() );
			stmt.setString( index++, pk.getProveedorTipodeidentificacion() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new InventarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the inventario table.
	 */
	public void delete(InventarioPk pk) throws InventarioDaoException
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
			if (pk.getIdInventario() != null) {
				stmt.setInt( 1, pk.getIdInventario().intValue() );
			} else {
				stmt.setNull(1, java.sql.Types.INTEGER);
			}
		
			stmt.setString( 2, pk.getProductoIdproducto() );
			stmt.setString( 3, pk.getProveedorIdproveedor() );
			stmt.setString( 4, pk.getProveedorTipodeidentificacion() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new InventarioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the inventario table that matches the specified primary-key value.
	 */
	public Inventario findByPrimaryKey(InventarioPk pk) throws InventarioDaoException
	{
		return findByPrimaryKey( pk.getIdInventario(), pk.getProductoIdproducto(), pk.getProveedorIdproveedor(), pk.getProveedorTipodeidentificacion() );
	}

	/** 
	 * Returns all rows from the inventario table that match the criteria 'idInventario = :idInventario AND Producto_idProducto = :productoIdproducto AND Proveedor_idProveedor = :proveedorIdproveedor AND Proveedor_tipoDeIdentificacion = :proveedorTipodeidentificacion'.
	 */
	public Inventario findByPrimaryKey(Integer idInventario, String productoIdproducto, String proveedorIdproveedor, String proveedorTipodeidentificacion) throws InventarioDaoException
	{
		Inventario ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idInventario = ? AND Producto_idProducto = ? AND Proveedor_idProveedor = ? AND Proveedor_tipoDeIdentificacion = ?", new Object[] { idInventario, productoIdproducto, proveedorIdproveedor, proveedorTipodeidentificacion } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the inventario table that match the criteria ''.
	 */
	public Inventario[] findAll() throws InventarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idInventario, Producto_idProducto, Proveedor_idProveedor, Proveedor_tipoDeIdentificacion", null );
	}

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Producto_idProducto = :productoIdproducto'.
	 */
	public Inventario[] findByProducto(String productoIdproducto) throws InventarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Producto_idProducto = ?", new Object[] { productoIdproducto } );
	}

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Proveedor_idProveedor = :proveedorIdproveedor AND Proveedor_tipoDeIdentificacion = :proveedorTipodeidentificacion'.
	 */
	public Inventario[] findByProveedor(String proveedorIdproveedor, String proveedorTipodeidentificacion) throws InventarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Proveedor_idProveedor = ? AND Proveedor_tipoDeIdentificacion = ?", new Object[] { proveedorIdproveedor, proveedorTipodeidentificacion } );
	}

	/** 
	 * Returns all rows from the inventario table that match the criteria 'idInventario = :idInventario'.
	 */
	public Inventario[] findWhereIdInventarioEquals(Integer idInventario) throws InventarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idInventario = ? ORDER BY idInventario", new Object[] { idInventario } );
	}

	/** 
	 * Returns all rows from the inventario table that match the criteria 'fecha = :fecha'.
	 */
	public Inventario[] findWhereFechaEquals(Date fecha) throws InventarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fecha = ? ORDER BY fecha", new Object[] { fecha==null ? null : new java.sql.Date( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the inventario table that match the criteria 'cantidad = :cantidad'.
	 */
	public Inventario[] findWhereCantidadEquals(Integer cantidad) throws InventarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE cantidad = ? ORDER BY cantidad", new Object[] { cantidad } );
	}

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Producto_idProducto = :productoIdproducto'.
	 */
	public Inventario[] findWhereProductoIdproductoEquals(String productoIdproducto) throws InventarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Producto_idProducto = ? ORDER BY Producto_idProducto", new Object[] { productoIdproducto } );
	}

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Proveedor_idProveedor = :proveedorIdproveedor'.
	 */
	public Inventario[] findWhereProveedorIdproveedorEquals(String proveedorIdproveedor) throws InventarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Proveedor_idProveedor = ? ORDER BY Proveedor_idProveedor", new Object[] { proveedorIdproveedor } );
	}

	/** 
	 * Returns all rows from the inventario table that match the criteria 'Proveedor_tipoDeIdentificacion = :proveedorTipodeidentificacion'.
	 */
	public Inventario[] findWhereProveedorTipodeidentificacionEquals(String proveedorTipodeidentificacion) throws InventarioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Proveedor_tipoDeIdentificacion = ? ORDER BY Proveedor_tipoDeIdentificacion", new Object[] { proveedorTipodeidentificacion } );
	}

	/**
	 * Method 'InventarioDaoImpl'
	 * 
	 */
	public InventarioDaoImpl()
	{
	}

	/**
	 * Method 'InventarioDaoImpl'
	 * 
	 * @param userConn
	 */
	public InventarioDaoImpl(final java.sql.Connection userConn)
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
		return "tiendaenlinea.inventario";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Inventario fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Inventario dto = new Inventario();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Inventario[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Inventario dto = new Inventario();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Inventario ret[] = new Inventario[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Inventario dto, ResultSet rs) throws SQLException
	{
		dto.setIdInventario( new Integer( rs.getInt(COLUMN_ID_INVENTARIO) ) );
		dto.setFecha( rs.getDate(COLUMN_FECHA ) );
		dto.setCantidad( new Integer( rs.getInt(COLUMN_CANTIDAD) ) );
		dto.setProductoIdproducto( rs.getString( COLUMN_PRODUCTO_IDPRODUCTO ) );
		dto.setProveedorIdproveedor( rs.getString( COLUMN_PROVEEDOR_IDPROVEEDOR ) );
		dto.setProveedorTipodeidentificacion( rs.getString( COLUMN_PROVEEDOR_TIPODEIDENTIFICACION ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Inventario dto)
	{
		dto.setIdInventarioModified( false );
		dto.setFechaModified( false );
		dto.setCantidadModified( false );
		dto.setProductoIdproductoModified( false );
		dto.setProveedorIdproveedorModified( false );
		dto.setProveedorTipodeidentificacionModified( false );
	}

	/** 
	 * Returns all rows from the inventario table that match the specified arbitrary SQL statement
	 */
	public Inventario[] findByDynamicSelect(String sql, Object[] sqlParams) throws InventarioDaoException
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
			throw new InventarioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the inventario table that match the specified arbitrary SQL statement
	 */
	public Inventario[] findByDynamicWhere(String sql, Object[] sqlParams) throws InventarioDaoException
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
			throw new InventarioDaoException( "Exception: " + _e.getMessage(), _e );
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
