
package geometria;


public class Circulo extends Forma implements ICirculo, FigurasGrupales {

    public float getArea(){
        System.out.println("Ejecutando GetArea para Circulo.");
     return 1.1f;
    }
    
    public float getPerimetro(){
        System.out.println("Ejecutando GetPerimetro para Circulo.");
        return 1.1f;
    }
    
    public float calcularRadio(int parametro1){
        return 1.1f;
    }

}
