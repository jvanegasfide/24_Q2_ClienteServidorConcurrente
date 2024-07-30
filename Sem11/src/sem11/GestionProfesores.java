
package sem11;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionProfesores {
    ConexionDB conexion = new ConexionDB();
    
    //transacciones contra DB
    //Select, Create, Update Delete
    
    public ArrayList<Profesor> SelectProfesores(String where){
        try {
            // establecer conexion a DB
            conexion.setConexion();
            //definimos la consulta
            if(where==null){
                where = "";
            }
            conexion.setConsulta("SELECT idprofesor,nombre,mail FROM profesores "+where);
            
            //Ejecutamos la consulta / leemos los resultados
            ResultSet resultados = conexion.getResultado();
            ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
                    
            //Lectura de datos
            while(resultados.next()){
                
                //idprofesor
                int id = resultados.getInt("idprofesor");
                //nombre
                String nombre = resultados.getString("nombre");
                //mail
                String email = resultados.getString("mail");
                //agregamos resultados
                listaProfesores.add(new Profesor(id, nombre, email));
            }
            
            //Cerrar conexion
            conexion.CerrarConexion();
            
            return listaProfesores;
        } catch (SQLException ex) {
            Logger.getLogger(GestionProfesores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Profesor SelectProfesorById(int id){
       return this.SelectProfesores("WHERE idprofesor = "+id).removeFirst();
    }
    
    public void CreateProfesor(String nombre, String correo){
        try {
            //Conexion contra DB
            conexion.setConexion();
            
            //Definir la consulta
            //conexion.setConsulta("INSERT INTO profesores(nombre,mail)"
            //        + " VALUES('"+nombre+"', '"+correo+"')");
            
            conexion.setConsulta("INSERT INTO profesores(nombre,mail) "
                    + "VALUES(?,?)");
            conexion.getconsulta().setString(1, nombre);
            conexion.getconsulta().setString(2, correo);

            
            //insercion
            if(conexion.getconsulta().executeUpdate() > 0){
                System.out.println("Profesor insertado correctamente.");
            }else{
                System.out.println("La insercion ha fallado.");
            }
            
            //Cerrar conexion a DB
            conexion.CerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(GestionProfesores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void UpdateProfesor(int id, String nombre, String correo){
    
        try {
            //1. Seleccionar el registro en DB
            Profesor profesor = this.SelectProfesorById(id);
            profesor.nombre = nombre;
            profesor.mail = correo;
            
            //Levantar conexion a BD
            conexion.setConexion();
            
            //Definir script de SQL
            conexion.setConsulta("UPDATE profesores "
                    + "SET nombre = '"+nombre+"', mail = '"+correo+"' "
                            + "WHERE idprofesor = "+id);
            
            if(conexion.getconsulta().executeUpdate() > 0){
                System.out.println("La actualizacion se ejecuto satisfactoriamente.");
            }else{
                System.out.println("La actualizacion fallo.");
            }
            
            //Cerrar conexion a DB
            conexion.CerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(GestionProfesores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void DeleteProfesor(int id){
        try {
            //conexion a BD
            conexion.setConexion();
            
            //definir la consulta
            conexion.setConsulta("DELETE FROM profesores WHERE idprofesor = "+id);
            
            //ejecutar la transaccion
            if(conexion.getconsulta().executeUpdate() > 0){
                System.out.println("Profesor con id: "+id+" eliminado.");
            }else{
                System.out.println("Eliminacion fallida. Profesor con id: "+id+".");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionProfesores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
