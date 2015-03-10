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
import javax.swing.JOptionPane;

/**
 *
 * @author My PC
 */
public class Cuenta {
    
    private String tipoDocumento;
    private String numeroDocumento;
    
    public String cuen() throws SQLException{
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
            String a = JOptionPane.showInputDialog("Escriba el usuario");
            String b = JOptionPane.showInputDialog("Escriba la contraseña");
            
            String sql = "SELECT * FROM tiendaenlinea.cuenta "
                    + "WHERE Usuario_idUsuario='" + a + "' and contrasena=" + b;

            //Para saber si el SQL si esta bien ejecutado
            //System.out.println(sql);
            rs = sentencia.executeQuery(sql);

            //Mostrar en pantalla la informacion de la tabla del RESULTSET
            if (!rs.wasNull()) {
                while (rs.next() == true) {
                    //Con nombre de la columna
                    System.out.println("Existe la cuenta");
                    tipoDocumento = rs.getString("tipoDocumento");
                    numeroDocumento = rs.getString("numeroDocumento");
                    System.out.println("=========================================================");
                    
                }
            } else {
                System.out.println("no Existe la cuenta");
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
        return numeroDocumento;
    }
    
}
