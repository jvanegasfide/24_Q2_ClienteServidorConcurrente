/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem03;

import geometria.Circulo;
import geometria.Cuadrado;
import geometria.Triangulo;

public class Sem03 {

    public static void main(String[] args) {
        Sedan[] carros;
        carros = new Sedan[10];
        
        carros[1]= null;
        carros[2]= new Sedan();
        //carros[4]= new Camion();
        //carros[5] = new Vehiculo();
        
        // el maximo indice utilizable es el de la definicion menos uno
        //Ejemplo: 5-1 = 4
        Vehiculo[] vehiculos = new Vehiculo[5];
        vehiculos[0] = new Sedan();
        vehiculos[1] = new Vehiculo();
        vehiculos[4] = new Sedan();
        //vehiculos[5] = new Sedan();
        //vehiculos[6] = new Sedan();
        //vehiculos[1000] = null;
        
        if(vehiculos[1] instanceof Sedan){
           // System.out.println("Es de tipo Sedan.");
        }
        
        if(vehiculos[1] instanceof Vehiculo){
            //System.out.println("Es de tipo Vehiculo.");
        }
        
        //Clases Abstractas
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Triangulo triangulo = new Triangulo();
        
        circulo.getArea();
        triangulo.getArea();
        cuadrado.getArea();
   }
    
}
