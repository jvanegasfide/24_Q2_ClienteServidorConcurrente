/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem02;

/**
 *
 * @author Laboratorio
 */
public class Sem02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vendedor empleado; //declaracion
       empleado = new Vendedor(); 
       
        //System.out.println(Vendedor.cuotaVentas);
        
        // guardando valor en atributo idEmpleado
        empleado.idEmpleado = "E001"; 
        
        // imprimo el valor del atributo
        //System.out.println(empleado.idEmpleado); 
        
        //atributos herencia
        empleado.setCedula(1);
        
        //System.out.println(empleado.getCedula());  
        //sout + tab (tecla en el teclado) = System.out.println();
        int pendienteCuotaVentas = empleado.calcularVentas(20000);
        //System.out.println(pendienteCuotaVentas);
        
        //System.out.println(empleado.getNombreEmpresa());
        //no se puede redefinir valor de atributo/variable final
        //empleado.nombreEmpresa = "123";
        
        //sobrecarga
        System.out.println(empleado.calcularVentas(20000, "prueba"));
        
        empleado.InactivarEmpleadoVoluntario();
    }    
}
