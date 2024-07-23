/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem10;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Laboratorio
 */
public class Sem10 {

    
    public static void main(String[] args) {
       try {
        ConexionDB conexion = new ConexionDB();
        conexion.setConexion();
        
        conexion.setConsulta("select idprofesor, nombre from profesores order by idprofesor asc");
        ResultSet resultado = conexion.getResultado();
        
        
            while(resultado.next()){
                int idProfesor = resultado.getInt("idprofesor");
                String nombreProfesor = resultado.getString("nombre");
                System.out.println("Id: "+ idProfesor);  
                System.out.println("Nobmre: "+ nombreProfesor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sem10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
