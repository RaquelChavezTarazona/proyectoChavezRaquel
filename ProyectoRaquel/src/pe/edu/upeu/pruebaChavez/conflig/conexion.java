/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.pruebaChavez.conflig;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author alum.fial8
 */
public class conexion {
    private static Connection conex = null;
    private static String url = "jdbc:mysql://localhost/bd_vistas";
    private static String usuario ="root"; 
    private static String clave ="root"; 
    public static void Connection getConexion() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            if(conex == null)
            {
                conex = DriverManager.getConnection(url, usuario, clave);
            }
            else
            {
                conex = null;
            }
            cath(ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            return conex;
        }
    }
}
