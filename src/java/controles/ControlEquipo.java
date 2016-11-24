/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import java.sql.Connection;
import modelos.Equipo;

/**
 *
 * @author Evan
 */
public class ControlEquipo {
    Equipo equipo;
    
    public ControlEquipo() {
        Equipo equipo = new Equipo();
    }
    
    public void agregarCliente(String nombre, String nombreAdmin, String paswd, int cuenta, Connection con) {
//        equipo.crearEquipo(nombre, nombreAdmin, paswd, con);
    }
}
