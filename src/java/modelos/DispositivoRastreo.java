package modelos;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
class DispositivoRastreo {
    
    // Variables
    private String ubicacion;
    private Date fecha;
    private String codigoRastreo;

    public DispositivoRastreo() {
    }

    public DispositivoRastreo(Date fecha, String ubicacion, String codigoRastreo) {
        this.fecha = fecha;
        this.codigoRastreo = codigoRastreo;
        this.ubicacion = ubicacion;
    }
}


