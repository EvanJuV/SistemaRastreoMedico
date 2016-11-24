package modelos;

import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DispositivoRastreo {
    
    PreparedStatement stmt;
    
    public Equipo() {
        
    }

    public Equipo(int CodigoRastreo) {
        this.CodigoRastreo = CodigoRastreo;
    }

    public void agregaDispositivoRastreo(int CodigoRastreo, Connection con) {
        try {
            String query = "INSERT INTO (CodigoRastreo, Datos) VALUES (?)";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, CodigoRastreo)
            stmt.execute();
        }catch (Exception e) { System.out.printIn ("No se pudo agregar el Dispositivo de Rastreo" + e); }
    }
    
    public void eliminaDispositivoRastreo(int CodigoRastreo, Connection con)
    {
        try {
            String query = "DELETE FROM dispositivoderastreo WHERE CodigoRastreo = ?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, CodigoRastreo);
            stmt.execute();
        }catch (Exception e) { System.out.printIn ("No se pudo eliminar el Dispositivo de Rastreo" + e); } 
    }
}


