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

/**
 *
 * @author My PC
 */
public class CarritoAPP {

    java.sql.Connection conexion = null;
    String servidor = "jdbc:mysql://localhost/tiendaenlinea";
    String usuario = "root";
    String password = "123456789";
    PreparedStatement sentencia = null;
    ResultSet rs = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        CarritoDTO c1 = new CarritoDTO();
        c1.setIdCarrito(1);
//        c1.setImpuestos(2000);
//        c1.setSubtotal(120000);
//        c1.setPresioTotal(12000);
//        c1.setIdCarrito(111);

        CarritoAPP car = new CarritoAPP();
//        car.borrar(c1);

        CarritoDTO carrito = car.buscar(c1);
        System.out.println(carrito.toString());
        
    }

    public void insertar(CarritoDTO c1) throws SQLException {

        String sql = "INSERT INTO tiendaenlinea.carritodecompras "
                + "(idCarritoDeCompras, "
                + "subtotal, "
                + "precioTotal, "
                + "impuestos) "
                + "VALUES "
                + "(?,?,?,?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, c1.getIdCarrito());
            sentencia.setDouble(2, c1.getSubtotal());
            sentencia.setDouble(3, c1.getPresioTotal());
            sentencia.setDouble(4, c1.getImpuestos());
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

    public void actualizar(CarritoDTO c1) throws SQLException {

        String sql = "UPDATE tiendaenlinea.carritodecompras "
                + "SET "
                + "subtotal = ?, "
                + "precioTotal = ?, "
                + "impuestos = ? "
                + "WHERE idCarritoDeCompras = ?;";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setDouble(1, c1.getSubtotal());
            sentencia.setDouble(2, c1.getPresioTotal());
            sentencia.setDouble(3, c1.getImpuestos());
            sentencia.setInt(4, c1.getIdCarrito());
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

    public void borrar(CarritoDTO c1) throws SQLException {

        String sql = "DELETE FROM tiendaenlinea.carritodecompras WHERE idCarritoDeCompras = ? ;";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, c1.getIdCarrito());

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

    public CarritoDTO buscar(CarritoDTO c1) throws SQLException {

        CarritoDTO temp = new CarritoDTO();

        String sql = "SELECT * FROM tiendaenlinea.carritodecompras WHERE idCarritoDeCompras = ? ;";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, c1.getIdCarrito());

            System.out.println("sentencia ejecutada " + sql);

            rs = sentencia.executeQuery();

            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    temp.setIdCarrito(rs.getInt("idCarritoDeCompras"));
                    temp.setSubtotal(rs.getDouble("subTotal"));
                    temp.setPresioTotal(rs.getDouble("precioTotal"));
                    temp.setImpuestos(rs.getDouble("impuestos"));
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
