/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lichi
 */
public class Conexion {
    Connection con;
    public Connection getConnection(){
        try {
            String myDb="jdbc:mysql://localhost:3306/sistemaventa";
            con = DriverManager.getConnection(myDb, "root", "");
            return con;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
}
