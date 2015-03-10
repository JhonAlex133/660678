/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedstatement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class ProductoAPP {

    java.sql.Connection conexion = null;
    String servidor = "jdbc:mysql://localhost/tiendaenlinea";
    String usuario = "root";
    String password = "123456789";
    PreparedStatement sentencia = null;
    ResultSet rs = null;

    public static void main(String[] args) throws SQLException {

        ProductoDTO prod = new ProductoDTO();
        prod.setIdProducto("A0001");

        ProductoAPP p1 = new ProductoAPP();
        
        ProductoDTO productoBusqueda =p1.buscar(prod);

        System.out.println(productoBusqueda.toString());
    }

    public void insertar(ProductoDTO p1) throws SQLException {

        String sql = "INSERT INTO tiendaenlinea.producto "
                + "(idProducto, "
                + "nombre, "
                + "marca, "
                + "referencia, "
                + "descripcion, "
                + "material, "
                + "color, "
                + "cantidad, "
                + "activo, "
                + "precioUnitario, "
                + "descuento, "
                + "Categoria_idCategoria, "
                + "Catalogo_idCatalogo) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, p1.getIdProducto());
            sentencia.setString(2, p1.getNombre());
            sentencia.setString(3, p1.getMarca());
            sentencia.setString(4, p1.getReferencia());
            sentencia.setString(5, p1.getDescripcion());
            sentencia.setString(6, p1.getMaterial());
            sentencia.setString(7, p1.getColor());
            sentencia.setInt(8, p1.getCantidad());
            sentencia.setShort(9, p1.getActivo());
            sentencia.setDouble(10, p1.getPrecioUnitario());
            sentencia.setDouble(11, p1.getDescuento());
            sentencia.setInt(12, p1.getIdCategoria());
            sentencia.setInt(13, p1.getIdCatalogo());
            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("se insertaron " + resultado);
            } else {
                System.out.println("no se inserto");
            }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {
            //cerrar el statement
            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            //cerre la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }

    }

    public void actualizar(ProductoDTO p1) throws SQLException {

        String sql = "UPDATE tiendaenlinea.producto "
                + "SET "
                + "nombre = ? ,"
                + "marca = ? ,"
                + "referencia = ? ,"
                + "descripcion = ? ,"
                + "material = ? ,"
                + "color = ? ,"
                + "cantidad = ? ,"
                + "activo = ? ,"
                + "precioUnitario = ? ,"
                + "descuento = ? ,"
                + "Categoria_idCategoria = ? ,"
                + "Catalogo_idCatalogo = ? "
                + "WHERE idProducto = ? ;";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, p1.getNombre());
            sentencia.setString(2, p1.getMarca());
            sentencia.setString(3, p1.getReferencia());
            sentencia.setString(4, p1.getDescripcion());
            sentencia.setString(5, p1.getMaterial());
            sentencia.setString(6, p1.getColor());
            sentencia.setInt(7, p1.getCantidad());
            sentencia.setShort(8, p1.getActivo());
            sentencia.setDouble(9, p1.getPrecioUnitario());
            sentencia.setDouble(10, p1.getDescuento());
            sentencia.setInt(11, p1.getIdCategoria());
            sentencia.setInt(12, p1.getIdCatalogo());
            sentencia.setString(13, p1.getIdProducto());
            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("se actualizo " + resultado);
            } else {
                System.out.println("no se Actualizo");
            }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {
            //cerrar el statement
            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            //cerre la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }
    }

    public void borrar(ProductoDTO p1) throws SQLException {

        String sql = "DELETE FROM tiendaenlinea.producto WHERE idProducto = ? ;";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, p1.getIdProducto());

            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("se Borro " + resultado);
            } else {
                System.out.println("no se Borro");
            }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {
            //cerrar el statement
            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            //cerre la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }

    }

    public ProductoDTO buscar(ProductoDTO p1) throws SQLException {

        ProductoDTO temp = new ProductoDTO();
        
        String sql = "SELECT * FROM tiendaenlinea.producto WHERE idProducto = ? ;";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, p1.getIdProducto());

            System.out.println("sentencia ejecutada " + sql);

            rs = sentencia.executeQuery();

            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    temp.setIdProducto(rs.getString("idProducto"));
                    temp.setNombre(rs.getString("nombre"));
                    temp.setMarca(rs.getString("marca"));
                    temp.setReferencia(rs.getString("referencia"));
                    temp.setDescripcion(rs.getString("descripcion"));
                    temp.setMaterial(rs.getString("material"));
                    temp.setColor(rs.getString("color"));
                    temp.setCantidad(rs.getInt("cantidad"));
                    temp.setActivo(rs.getShort("activo"));
                    temp.setPrecioUnitario(rs.getDouble("precioUnitario"));
                    temp.setDescuento(rs.getDouble("descuento"));
                    temp.setIdCategoria(rs.getInt("Categoria_idCategoria"));
                    temp.setIdCatalogo(rs.getInt("Catalogo_idCatalogo")); 
                    System.out.println("=========================================================");
                }
            }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {
            //cerrar el statement
            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            //cerre la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }
    
        
        return temp;
        
    }

}
