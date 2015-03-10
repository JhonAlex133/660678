
import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ColsutecR
 */
public class Cuenta {
    
    java.sql.Connection conexion = null;
        String servidor = "jdbc:mysql://localhost/tiendaenlinea";
        String usuarioDB = "root";
        String passwordDB = "123456789";
        CallableStatement sentencia = null;
        ResultSet rs  = null;
    
    public static void main(String[] args) throws SQLException {
        
        CuentaDTO cuenta = new CuentaDTO();
        cuenta.setTipoDocumento("CC");
        cuenta.setNumeroDocumento("1234");
        cuenta.setPrimerNombre("A");
        cuenta.setSegundoNombre("J");
        cuenta.setPrimerApellido("G");
        cuenta.setSegundoApellido("C");
        cuenta.setEmail("john@hto.com");
        cuenta.setContrasena("111");
        cuenta.setIdUsuario("john133");
        
        Cuenta c1 = new Cuenta();
        c1.procedimiento(cuenta);
        
    }
    
    public void procedimiento(CuentaDTO c1) throws SQLException{
        String sql = "call tiendaenlinea.crear_cuenta(?,?,?,?,?,?,?,?,?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

            sentencia = conexion.prepareCall(sql);
            sentencia.setString(1, c1.getTipoDocumento());
            sentencia.setString(2, c1.getNumeroDocumento());
            sentencia.setString(3, c1.getPrimerNombre());
            sentencia.setString(4, c1.getSegundoNombre());
            sentencia.setString(5, c1.getPrimerApellido());
            sentencia.setString(6, c1.getSegundoApellido());
            sentencia.setString(7, c1.getEmail());
            sentencia.setString(8, c1.getContrasena());
            sentencia.setString(9, c1.getIdUsuario());
            
            System.out.println("sentencia ejecutada " + sql );

            rs = sentencia.getResultSet();
            
            if (rs != null) {

                    rs.beforeFirst();
                    
                    while (rs.next() == true) {
                        System.out.print(rs.getString(1)+"\t");
                        System.out.print(rs.getString(2)+"\t");
                        System.out.print(rs.getString(3)+"\t");
                        System.out.print(rs.getString(4)+"\t");
                        System.out.print(rs.getString(5)+"\t");
                        System.out.print(rs.getString(6)+"\t");
                        System.out.print(rs.getString(7)+"\t");
                        System.out.print(rs.getString(8)+"\t");
                        System.out.print(rs.getString(9)+"\n");
                        
                        
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
