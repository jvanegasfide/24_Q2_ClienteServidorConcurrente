
package sem01;

/**
 *
 * @author Laboratorio
 */
public class Sem01 {
    public static void main(String[] args) {
        Vehiculo carroRojo;
        carroRojo = new Vehiculo();
        
        //Valor original Annio Fabricacion
        //System.out.println(carroRojo.annioFabricacion);
        
        //Modificar valor de Annio Fabriacion
        carroRojo.annioFabricacion = 2020;
        //Imprime en consola
        //System.out.println(carroRojo.annioFabricacion);
        
        //carroRojo.setMarca("Toyota");
        carroRojo.arrancar();
        carroRojo.frenar();
        
        
        Camion camionCarga = new Camion();
        System.out.println(camionCarga.capacidadCarga);
        //camionCarga.
        
    }
}
