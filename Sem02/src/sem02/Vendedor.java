/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem02;

/**
 *
 * @author Laboratorio
 */
public class Vendedor extends Empleado {
    public static int cuotaVentas = 100000; // 100 mil colones
    public String idEmpleado;
    public final String nombreEmpresa = "Fidelitas";
    
    public Vendedor() {
    }

    public Vendedor(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    public int calcularVentas(int totalVendido){
        //int resultado = cuotaVentas - totalVendido;
        return cuotaVentas - totalVendido;
    }
    
    //Sobrecarga de Metodos
    //No pueden tener mismos parametros en el mismo orden (por su tipo de dato)
    public int calcularVentas(int prueba, String comision){
        return 1;
    }
    
    public int calcularVentas(String prueba, int prueba2){
        return 1;
    }
    
    public String getNombreEmpresa(){
        return this.nombreEmpresa;
    }
    
    @Override
    public void InactivarEmpleadoVoluntario(){
        System.out.println("Este empleado no califica para voluntariado.");
    }
    
}
