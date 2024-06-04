/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author Aulas Heredia
 */
public class Triangulo extends Forma{
    @Override
    public float getArea() {
        System.out.println("Ejecutando GetArea en Triangulo.");
        return 1.1f;
    }

    @Override
    public float getPerimetro() {
        System.out.println("Ejecutando GetPerimetro en Triangulo");
        return 0.1f;
    }
}
