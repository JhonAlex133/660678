/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodeselect;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author My PC
 */
public class Factura extends Cuenta {

    private int idFactura;
    private Date fecha;
    private float total;

    public void fac() throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
//            String servidor = "jdbc:mysql://172.16.4.142/pijamax";
            String servidor = "jdbc:mysql://localhost/tiendaenlinea";
            String usuario = "root";
            String password = "123456789";
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();
//            // Leyendo datos para un select en la base de datos 
//            String a = JOptionPane.showInputDialog("Escriba el tipo de documento");
//            String b = JOptionPane.showInputDialog("Escriba el numero de documento");

            String sql = "select factura.idFactura, cuenta.primerNombre, cuenta.segundoNombre, cuenta.primerApellido, cuenta.segundoApellido,"
                    + "	pedido.subtotal, pedido.impuestos, factura.total "
                    + "from tiendaenlinea.factura factura inner join tiendaenlinea.cuenta cuenta inner join tiendaenlinea.pedido pedido "
                    + "on pedido.Factura_idFactura = factura.idFactura and factura.Cuenta_numeroDocumento = cuenta.numeroDocumento"
                    + "	and factura.Cuenta_tipoDocumento = cuenta.tipoDocumento "
                    + "	WHERE Cuenta_numeroDocumento='" + cuen() + "';";

            //Para saber si el SQL si esta bien ejecutado
            System.out.println(sql);
            rs = sentencia.executeQuery(sql);

            //Mostrar en pantalla la informacion de la tabla del RESULTSET
            if (rs != null) {
                while (rs.next() == true) {
                    //Con nombre de la columna
                    System.out.println("=========================================================");
                    System.out.println("id Factura: " + rs.getString("idFactura"));
                    System.out.println("Primer Nombre: " + rs.getString("primerNombre"));
                    System.out.println("Segundo Nombre: " + rs.getString("segundoNombre"));
                    System.out.println("Primer Apellido: " + rs.getString("primerApellido"));
                    System.out.println("Segundo Apellido: " + rs.getString("segundoApellido"));
                    System.out.println("Subtotal: " + rs.getDouble("subtotal"));
                    System.out.println("Impuestos: " + rs.getDouble("impuestos"));
                    System.out.println("Total: " + rs.getDouble("total"));
                    System.out.println("=========================================================");
                }
            } else {
                System.out.println("no hay datos");
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.toString());
        } finally {
            //Cerrando el Statement 
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el Statement corectamente");
            }
            //Cerrar el ResultSet
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el ResultSet corectamente");
            }
            //Cerrando la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion corectamente");
            }
        }
    }

}
