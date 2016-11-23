package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Equipo {
    
    // Variables
    private String nombre;
    private String estado;
    private Datos datos;
    private DispositivoRastreo rastreador;
    
    public Equipo() {
        
    }

    public Equipo(String nombre, String estado, Datos datos, DispositivoRastreo rastreador) {
        this.nombre = nombre;
        this.estado = estado;
        this.datos = datos;
        this.rastreador = rastreador;
    }
    
    public void consultarEquipo() {
        
    }

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }
}
