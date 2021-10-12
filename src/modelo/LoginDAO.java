/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

/**
 *
 * @author Lichi
 */
public class LoginDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion cn = new Conexion();
    public Login log(String correo, String pass) {
        Login l= new Login();
        String sql = "select * from usuarios where correo =? and pass = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if(rs.next()){
                l.setId(rs.getInt("id"));
                l.setNombre(rs.getString("nombre"));
                l.setCorreo(rs.getString("correo"));
                l.setPass(rs.getString("pass"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return l;
    }
}
