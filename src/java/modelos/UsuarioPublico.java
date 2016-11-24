package modelos;

import java.sql.Connection;

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
    
    // Variables
    private String nombre;
    private String idUsuario;

    public UsuarioPublico() {
    }

    public UsuarioPublico(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }
    
    public void consultarEquipo() {
        
    }
    
    public void generaReporteProblema() {
        
    }
    
    public void crear(String nombre, String IDUsuario, Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public int validar(String IDUsuario, Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
