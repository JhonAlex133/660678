
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ColsutecR
 */
public class Producto {

    java.sql.Connection conexion = null;
    String servidor = "jdbc:mysql://localhost/tiendaenlinea";
    String usuarioDB = "root";
    String passwordDB = "123456789";
    CallableStatement sentencia = null;
    ResultSet rs = null;

    public static void main(String[] args) throws SQLException {

        ProductoDTO producto = new ProductoDTO();
        producto.setIdProducto("A12");
        producto.setNombre("Guitar");
        producto.setMarca("Fender");
        producto.setReferencia("qwe2324");
        producto.setDescripcion("Es una guitarra rara");
        producto.setMaterial("Caoba");
        producto.setColor("Negro");
        producto.setCantidad(1);
        producto.setActivo(new Short("1"));
        producto.setPrecioUnitario(120000);
        producto.setDescuento(0);
        producto.setIdCategoria(7);
        producto.setIdCatalogo(1);
        
        Producto p1 = new Producto();
        p1.procedimiento(producto);
        
    }

    public void procedimiento(ProductoDTO p1) throws SQLException {
        String sql = "call tiendaenlinea.producto_crear(?,?,?,?,?,?,?,?,?,?,?,?,?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

            sentencia = conexion.prepareCall(sql);
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

            rs = sentencia.getResultSet();

            if (rs != null) {

                rs.beforeFirst();

                while (rs.next() == true) {
                    System.out.print(rs.getString(1) + "\t");
                    System.out.print(rs.getString(2) + "\t");
                    System.out.print(rs.getString(3) + "\t");
                    System.out.print(rs.getString(4) + "\t");
                    System.out.print(rs.getString(5) + "\t");
                    System.out.print(rs.getString(6) + "\t");
                    System.out.print(rs.getString(7) + "\t");
                    System.out.print(rs.getString(8) + "\t");
                    System.out.print(rs.getString(9) + "\n");

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
    }
}
