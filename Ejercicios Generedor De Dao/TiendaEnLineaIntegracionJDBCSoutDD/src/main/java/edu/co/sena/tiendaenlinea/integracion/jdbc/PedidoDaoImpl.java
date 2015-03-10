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

public class PedidoDaoImpl extends AbstractDAO implements PedidoDao
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
	protected final String SQL_SELECT = "SELECT Factura_idFactura, total, subtotal, impuestos FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( Factura_idFactura, total, subtotal, impuestos ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET Factura_idFactura = ?, total = ?, subtotal = ?, impuestos = ? WHERE Factura_idFactura = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE Factura_idFactura = ?";

	/** 
	 * Index of column Factura_idFactura
	 */
	protected static final int COLUMN_FACTURA_IDFACTURA = 1;

	/** 
	 * Index of column total
	 */
	protected static final int COLUMN_TOTAL = 2;

	/** 
	 * Index of column subtotal
	 */
	protected static final int COLUMN_SUBTOTAL = 3;

	/** 
	 * Index of column impuestos
	 */
	protected static final int COLUMN_IMPUESTOS = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column Factura_idFactura
	 */
	protected static final int PK_COLUMN_FACTURA_IDFACTURA = 1;

	/** 
	 * Inserts a new row in the pedido table.
	 */
	public PedidoPk insert(Pedido dto) throws PedidoDaoException
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
			if (dto.isFacturaIdfacturaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Factura_idFactura" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTotalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "total" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isSubtotalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "subtotal" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImpuestosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "impuestos" );
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
			if (dto.isFacturaIdfacturaModified()) {
				if (dto.getFacturaIdfactura() != null) {
					stmt.setInt( index++, dto.getFacturaIdfactura().intValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.INTEGER);
				}
		
			}
		
			if (dto.isTotalModified()) {
				if (dto.getTotal() != null) {
					stmt.setFloat( index++, dto.getTotal().floatValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.FLOAT);
				}
		
			}
		
			if (dto.isSubtotalModified()) {
				if (dto.getSubtotal() != null) {
					stmt.setFloat( index++, dto.getSubtotal().floatValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.FLOAT);
				}
		
			}
		
			if (dto.isImpuestosModified()) {
				if (dto.getImpuestos() != null) {
					stmt.setFloat( index++, dto.getImpuestos().floatValue() );
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
			throw new PedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the pedido table.
	 */
	public void update(PedidoPk pk, Pedido dto) throws PedidoDaoException
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
			if (dto.isFacturaIdfacturaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Factura_idFactura=?" );
				modified=true;
			}
		
			if (dto.isTotalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "total=?" );
				modified=true;
			}
		
			if (dto.isSubtotalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "subtotal=?" );
				modified=true;
			}
		
			if (dto.isImpuestosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "impuestos=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE Factura_idFactura=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isFacturaIdfacturaModified()) {
				if (dto.getFacturaIdfactura() != null) {
					stmt.setInt( index++, dto.getFacturaIdfactura().intValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.INTEGER);
				}
		
			}
		
			if (dto.isTotalModified()) {
				if (dto.getTotal() != null) {
					stmt.setFloat( index++, dto.getTotal().floatValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.FLOAT);
				}
		
			}
		
			if (dto.isSubtotalModified()) {
				if (dto.getSubtotal() != null) {
					stmt.setFloat( index++, dto.getSubtotal().floatValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.FLOAT);
				}
		
			}
		
			if (dto.isImpuestosModified()) {
				if (dto.getImpuestos() != null) {
					stmt.setFloat( index++, dto.getImpuestos().floatValue() );
				} else {
					stmt.setNull(index++, java.sql.Types.FLOAT);
				}
		
			}
		
			if (pk.getFacturaIdfactura() != null) {
				stmt.setInt( index++, pk.getFacturaIdfactura().intValue() );
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
			throw new PedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the pedido table.
	 */
	public void delete(PedidoPk pk) throws PedidoDaoException
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
			if (pk.getFacturaIdfactura() != null) {
				stmt.setInt( 1, pk.getFacturaIdfactura().intValue() );
			} else {
				stmt.setNull(1, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the pedido table that matches the specified primary-key value.
	 */
	public Pedido findByPrimaryKey(PedidoPk pk) throws PedidoDaoException
	{
		return findByPrimaryKey( pk.getFacturaIdfactura() );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pedido findByPrimaryKey(Integer facturaIdfactura) throws PedidoDaoException
	{
		Pedido ret[] = findByDynamicSelect( SQL_SELECT + " WHERE Factura_idFactura = ?", new Object[] { facturaIdfactura } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria ''.
	 */
	public Pedido[] findAll() throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY Factura_idFactura", null );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pedido[] findByFactura(Integer facturaIdfactura) throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Factura_idFactura = ?", new Object[] { facturaIdfactura } );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'Factura_idFactura = :facturaIdfactura'.
	 */
	public Pedido[] findWhereFacturaIdfacturaEquals(Integer facturaIdfactura) throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Factura_idFactura = ? ORDER BY Factura_idFactura", new Object[] { facturaIdfactura } );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'total = :total'.
	 */
	public Pedido[] findWhereTotalEquals(Float total) throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE total = ? ORDER BY total", new Object[] { total } );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'subtotal = :subtotal'.
	 */
	public Pedido[] findWhereSubtotalEquals(Float subtotal) throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE subtotal = ? ORDER BY subtotal", new Object[] { subtotal } );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'impuestos = :impuestos'.
	 */
	public Pedido[] findWhereImpuestosEquals(Float impuestos) throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE impuestos = ? ORDER BY impuestos", new Object[] { impuestos } );
	}

	/**
	 * Method 'PedidoDaoImpl'
	 * 
	 */
	public PedidoDaoImpl()
	{
	}

	/**
	 * Method 'PedidoDaoImpl'
	 * 
	 * @param userConn
	 */
	public PedidoDaoImpl(final java.sql.Connection userConn)
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
		return "tiendaenlinea.pedido";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Pedido fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Pedido dto = new Pedido();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Pedido[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Pedido dto = new Pedido();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Pedido ret[] = new Pedido[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Pedido dto, ResultSet rs) throws SQLException
	{
		dto.setFacturaIdfactura( new Integer( rs.getInt(COLUMN_FACTURA_IDFACTURA) ) );
		dto.setTotal( new Float( rs.getFloat(COLUMN_TOTAL) ) );
		dto.setSubtotal( new Float( rs.getFloat(COLUMN_SUBTOTAL) ) );
		dto.setImpuestos( new Float( rs.getFloat(COLUMN_IMPUESTOS) ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Pedido dto)
	{
		dto.setFacturaIdfacturaModified( false );
		dto.setTotalModified( false );
		dto.setSubtotalModified( false );
		dto.setImpuestosModified( false );
	}

	/** 
	 * Returns all rows from the pedido table that match the specified arbitrary SQL statement
	 */
	public Pedido[] findByDynamicSelect(String sql, Object[] sqlParams) throws PedidoDaoException
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
			throw new PedidoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the pedido table that match the specified arbitrary SQL statement
	 */
	public Pedido[] findByDynamicWhere(String sql, Object[] sqlParams) throws PedidoDaoException
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
			throw new PedidoDaoException( "Exception: " + _e.getMessage(), _e );
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
