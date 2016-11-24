package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
public class UsuarioPublico {
    
    
    PreparedStatement stmt;
    // Variables
    private String nombre;
    private int idUsuario;

    public UsuarioPublico() {
    }

    public UsuarioPublico(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }
    
    public ArrayList<UsuarioPublico> listarUsuarios(Connection con) {
        ArrayList<UsuarioPublico> usuarios = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM UsuarioPublico;";
            stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                UsuarioPublico usuario = new UsuarioPublico();
                usuario.idUsuario = rs.getInt("idUsuario");
                usuario.nombre = rs.getString("nombre");
                
                usuarios.add(usuario);
            }

            rs.close();
            
            return usuarios;
        }catch (Exception e) {
            System.out.println("No se pudo ejecutar listarUsuarios() a la tabla UsuarioPublico" + e);
        }
                
        return null;
    }
    
    public void crear(String nombre, String IDUsuario, Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public int validar(String IDUsuario, Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
