/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedstatement;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ColsutecR
 */
public class CuentaAPP {

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

        CuentaDTO cuen = new CuentaDTO();
        cuen.setTipoDocumento("CC");
        cuen.setNumeroDocumento("1008273458");
//        cuen.setPrimerNombre("john");
//        cuen.setSegundoNombre("Alex");
//        cuen.setPrimerApellido("Gutierrez");
//        cuen.setSegundoApellido("Cabezas");
//        cuen.setContrasena("123jhon");
//        cuen.setEmail("jhon@hotmail.com");
//        cuen.setIdUsuario("Alex143");
//        cuen.setTipoDocumento("CC");
//        cuen.setNumeroDocumento("1023547851");

        CuentaAPP i = new CuentaAPP();
//        insert.actualizar(cuen);
        
        CuentaDTO busc = i.buscar(cuen);
        System.out.println(busc.toString());
    }

    public void insertar(CuentaDTO c1) throws SQLException {

        java.sql.Connection conexion = null;
        String servidor = "jdbc:mysql://localhost/tiendaenlinea";
        String usuario = "root";
        String password = "123456789";
        PreparedStatement sentencia = null;
        String sql = "INSERT INTO tiendaenlinea.cuenta "
                + "(tipoDocumento, "
                + "numeroDocumento, "
                + "primerNombre, "
                + "segundoNombre, "
                + "primerApellido, "
                + "segundoApellido, "
                + "contrasena, "
                + "email, "
                + "Usuario_idUsuario) "
                + "VALUES"
                + "(?,?,?,?,?,?,?,?,?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, c1.getTipoDocumento());
            sentencia.setString(2, c1.getNumeroDocumento());
            sentencia.setString(3, c1.getPrimerNombre());
            sentencia.setString(4, c1.getSegundoNombre());
            sentencia.setString(5, c1.getPrimerApellido());
            sentencia.setString(6, c1.getSegundoApellido());
            sentencia.setString(7, c1.getEmail());
            sentencia.setString(8, c1.getContrasena());
            sentencia.setString(9, c1.getIdUsuario());
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

    public void actualizar(CuentaDTO c1) throws SQLException {

        String sql = "UPDATE tiendaenlinea.cuenta "
                + "SET "
                + "primerNombre = ?, "
                + "segundoNombre = ?, "
                + "primerApellido = ?, "
                + "segundoApellido = ?, "
                + "contrasena = ?, "
                + "email = ?, "
                + "Usuario_idUsuario = ? "
                + "WHERE tipoDocumento = ? AND numeroDocumento = ?;";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, c1.getPrimerNombre());
            sentencia.setString(2, c1.getSegundoNombre());
            sentencia.setString(3, c1.getPrimerApellido());
            sentencia.setString(4, c1.getSegundoApellido());
            sentencia.setString(5, c1.getEmail());
            sentencia.setString(6, c1.getContrasena());
            sentencia.setString(7, c1.getIdUsuario());
            sentencia.setString(8, c1.getTipoDocumento());
            sentencia.setString(9, c1.getNumeroDocumento());
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

    public void borrar(CuentaDTO c1) throws SQLException {

        String sql = "DELETE FROM tiendaenlinea.cuenta WHERE tipoDocumento = ? AND numeroDocumento = ?;";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, c1.getTipoDocumento());
            sentencia.setString(2, c1.getNumeroDocumento());

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

    public CuentaDTO buscar(CuentaDTO c1) throws SQLException {

        CuentaDTO temp = new CuentaDTO();

        String sql = "SELECT * FROM tiendaenlinea.cuenta WHERE tipoDocumento = ? AND numeroDocumento = ? ;";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuario, password);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sql);

             sentencia.setString(1, c1.getTipoDocumento());
            sentencia.setString(2, c1.getNumeroDocumento());

            System.out.println("sentencia ejecutada " + sql);

            rs = sentencia.executeQuery();

            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    temp.setTipoDocumento(rs.getString("tipoDocumento"));
                    temp.setNumeroDocumento(rs.getString("numeroDocumento"));
                    temp.setPrimerNombre(rs.getString("primerNombre"));
                    temp.setSegundoNombre(rs.getString("segundoNombre"));
                    temp.setPrimerApellido(rs.getString("primerApellido"));
                    temp.setSegundoApellido(rs.getString("segundoApellido"));
                    temp.setEmail(rs.getString("email"));
                    temp.setContrasena(rs.getString("contrasena"));
                    temp.setIdUsuario(rs.getString("Usuario_idUsuario"));
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
