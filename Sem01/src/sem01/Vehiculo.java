
package sem01;

/**
 *
 * @author Laboratorio
 */
public class Vehiculo {
    // Atributos / Caracteristicas
    public int numVentanas;
    public String tipoCombustible;
    private String marca;
    public int annioFabricacion;
    private String modelo;
    
    
    //Set: guardan datos en atributos
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMarca(String parametro1){
        //instrucciones para definir atributo marca
        this.marca = parametro1;
    }
    
    //Get: leen los valores de los atributos
    public String getModelo(){
        //Opcion 1: String valor = this.modelo;
        //return valor;
        return this.modelo;
    }
    
    public String getMarca(){
        //String valorMarca = this.marca;
        //return valorMarca;
        
        return this.marca;
    }
    
    //Comportamientos / Metodos
    public void arrancar(){
        //
    }
    
    public void frenar(){
    }
    
    public void bajarVentanas(){
    }
    
    public void subirVentanas(){
    }
}
