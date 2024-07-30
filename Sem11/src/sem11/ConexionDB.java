/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexionDB {
    
    //nombre de usuario
    //password
    //URL de base de datos
    String url = "jdbc:mysql://localhost:3306/universidad";
    String username = "admin";
    //Adminadmin1
    String password = "Adminadmin1";
    Connection conexion = null;
    
    PreparedStatement consulta = null;
    ResultSet resultado = null;
    
    public void setConexion(){
        try {
            this.conexion = DriverManager.getConnection(url, username, password);
            System.out.println("Conexion establecida correctamente");
        } catch (SQLException error) {
           //imprime el error
           error.printStackTrace();
        }
    }
    
   
    public void setConsulta(String consulta){
        try { 
            this.consulta = conexion.prepareStatement(consulta);
        } catch (SQLException error) {
           //imprime el error
           error.printStackTrace();
        }
    }
    
    public PreparedStatement getconsulta(){
        return consulta;
    }
    
    public ResultSet getResultado(){
        try {
            return consulta.executeQuery();
        } catch (SQLException error) {
             error.printStackTrace();
            return null;
        }
    }
    
    public void CerrarConexion(){
        //cerramos y limpiamos resultados
        
        try{
            if(resultado!= null){
                resultado.close();
            }
         } catch (SQLException error) {
             error.printStackTrace();
        }

        //cerramos la consulta
        try {
            if(consulta!=null){
                consulta.close();
            }
        } catch (SQLException error) {
             error.printStackTrace();
        }
        
        //cerramos y limpiamos la conexion
        try {
            if(conexion!=null){
                conexion.close();
            }
        } catch (SQLException error) {
             error.printStackTrace();
        }
    }
}
