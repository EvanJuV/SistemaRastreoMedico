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
public class Administrador {
   
    // Variables
    private String nombre;
    private String usuario;
    private String password;

    public Administrador() {
    }

    public Administrador(String nombre, String usuario, String password) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
    }
    
    public void generarReporte() {
        
    }
    
    public void eliminaDispositivoRastreo(DispositivoRastreo dr) {
        
    }
    
    public void modificaDispositivoRastreo(DispositivoRastreo dr) {
        
    }
    
    public void agregaDispositivoRastreo() {
        
    }
    
    public void eliminaDispositivoReferencia(DispositivoReferencia dr) {
        
    }
    
    public void modificaDispositivoReferencia(DispositivoReferencia dr) {
        
    }
    
    public void agregaDispositivoReferencia() {
        
    }

    public void crear(String nombre, String nombreAdmin, String paswd, Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int validar(String usuario, String password, Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
