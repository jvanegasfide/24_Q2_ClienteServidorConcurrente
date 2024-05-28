/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem02;

/**
 *
 * @author Laboratorio
 */
public class Empleado extends Persona {
    public String fechaContratacion;
    public boolean esVoluntarioActivo;
    
    public void InactivarEmpleadoVoluntario(){
        this.esVoluntarioActivo = false;
        System.out.println("Se ha inactivado el empleado Voluntario.");
    }
}
