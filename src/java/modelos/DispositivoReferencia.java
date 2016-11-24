package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
class DispositivoReferencia {
    PreparedStatement stmt;
    
    // Variables
    public int idReferencia;
    public String ubicacion;

    public DispositivoReferencia() {
    }

    public DispositivoReferencia(int idReferencia, String ubicacion) {
        this.idReferencia = idReferencia;
        this.ubicacion = ubicacion;
    }
    
     public void eliminaDispositivoReferencia(DispositivoReferencia dr, Connection con) {
         try {
         String query = "DELETE FROM DispositivoReferencia WHERE idReferencia = ?";
         stmt = con.prepareStatement(query);
         stmt.setInt(1, dr.idReferencia);
         stmt.execute();
      } catch (SQLException e) {System.out.println ("No se pudo ejecutar eliminaDispositivoReferencia() a la tabla DispositivoReferencia" + e);}
    }
    
    public void modificaDispositivoReferencia(DispositivoReferencia dr, Connection con) {
         try {
         String query = "UPDATE DispositivoReferencia SET ubicacion = ? WHERE idReferencia = ?";
         stmt = con.prepareStatement(query);
         stmt.setInt(1, dr.idReferencia);
         stmt.setString(2, dr.ubicacion);
         stmt.execute();
      } catch (SQLException e) {System.out.println ("No se pudo ejecutar modificaDispositivoReferencia() a la tabla DispositivoReferencia" + e);}
    }
  
    public void agregaDispositivoReferencia(int idReferencia, String ubicacion, Connection con) {
      try {
         String query = "INSERT INTO DispositivoReferencia (IDReferencia, Ubicacion) VALUES (?, ?)";
         stmt = con.prepareStatement(query);
         stmt.setInt(1, idReferencia);
         stmt.setString(2, ubicacion);
         stmt.execute();
      }
      catch (Exception e) 
      {
          System.out.println ("No se pudo ejecutar agregarDispositivoReferencia() a la tabla DispositivoReferencia" + e );
      }
   }
    
    /*
   public static void main(String[] args)
  {
    try
    {
      // create the mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/test";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
      
      // create the mysql delete statement.
      // i'm deleting the row where the id is "3", which corresponds to my
      // "Barney Rubble" record.
      String query = "delete from users where id = ?";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setInt(1, 3);

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

  }
    */
}
