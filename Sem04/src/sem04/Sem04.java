/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem04;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.lang.Exception;

public class Sem04 {

    
    public static void main(String[] args) {
        double valor1;
        int valor2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor ingrese dos numero enteros.");
        System.out.println("Ingrese el primer numero y presione la tecla enter.");
        String primeraLectura = scan.next();
        
        System.out.println("Ingrese el segundo numero y presione la tecla enter.");
        String segundaLectura = scan.next();
        
        try{
            
        if(primeraLectura.length() <3){
            throw new IOException("El usuario no ha ingresado ningun caracter.");
        }    
        valor1 = Double.parseDouble(primeraLectura);
        valor2 = Integer.parseInt(segundaLectura);
        
        System.out.println("Primer valor: "+valor1+". Segundo valor: "+valor2);
        
        
        double resultado = valor1 / valor2;
        
        System.out.println("El resultado de la division de "+valor1+ "dividido entre "
                +valor2+ " es: "+resultado);
        }catch(IOException e){
            System.out.println("Error IOException: "+e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Debe ingresar valores numericos y presionar enter.");
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        
        }finally{
            System.out.println("Cerrando ejecucion del programa.");
            //Ejemplo: conexionDB.cerrarConexion();
        }
    }
}
