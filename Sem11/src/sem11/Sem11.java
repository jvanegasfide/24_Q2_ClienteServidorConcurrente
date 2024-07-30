/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem11;

/**
 *
 * @author Laboratorio
 */
public class Sem11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionProfesores crudProfesor = new GestionProfesores();
        
        //for(Profesor profesor : crudProfesor.SelectProfesores("")){
        //   System.out.println("Profesor: "+profesor.nombre+", correo: "+profesor.mail
        //    +", id: "+profesor.idprofesor);
        //   }
        
        //Profesor resultado = crudProfesor.SelectProfesorById(1);
        // System.out.println("Profesor: "+resultado.nombre+", correo: "+resultado.mail
        //    +", id: "+resultado.idprofesor);+
        
        //crudProfesor.CreateProfesor("Amanda Gonzalez", "prueba3@ufide.ac.cr");
        //crudProfesor.UpdateProfesor(3,"Amanda Gonzalez", "agonzalez@ufide.ac.cr");
        crudProfesor.DeleteProfesor(1);
    }
}
