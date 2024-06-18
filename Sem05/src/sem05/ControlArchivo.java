
package sem05;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ControlArchivo {
    
    public static void agregar(){
    
        try{
            //crear el archivo
            DataOutputStream archivo = new DataOutputStream(new FileOutputStream("estudiantes.txt",true));
            //leemos los datos del usuario que vamos a guardar
            Estudiante estudiante = new Estudiante();
            
            Scanner lectura = new Scanner(System.in);
            
            //nombre, apellido, email
            System.out.println("Por favor ingrese el nombre.");
            estudiante.nombre = lectura.next();
            
            System.out.println("Por favor ingrese el apellido.");
            estudiante.apellido = lectura.next();
            
            System.out.println("Por favor ingrese el correo.");
            estudiante.email = lectura.next();
            
            //validamos los datos y escribimos al archivo
            archivo.writeUTF(estudiante.nombre);
            archivo.writeUTF(estudiante.apellido);
            archivo.writeUTF(estudiante.email);
            
            System.out.println("Los datos se han guardado correctamente.");
            
            //Cerrar conexion al archivo
            archivo.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public static void modificar(){
        String nombre, apellido, correo, correoEstudianteObjetivo;
        
        //Leer el estudiante objetivo
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el correo del estudiante a modificar.");
        correoEstudianteObjetivo = lectura.next();
        
        try{
            DataInputStream archivoLectura = new DataInputStream(new FileInputStream("estudiantes.txt"));
            DataOutputStream archivoEscritura = new DataOutputStream(new FileOutputStream("estudiantesActualizado.txt"));
            
            try{
                while(true){
                    nombre= archivoLectura.readUTF();
                    apellido= archivoLectura.readUTF();
                    correo= archivoLectura.readUTF();
                    
                    if(correoEstudianteObjetivo.equals(correo)){
                        System.out.println("Ingrese el nuevo nombre");
                        nombre=lectura.next();
                        
                        System.out.println("Ingrese el nuevo apellido.");
                        apellido=lectura.next();
                        
                        System.out.println("Ingrese el nuevo correo");
                        correo=lectura.next();
                    }
                    archivoEscritura.writeUTF(nombre);
                    archivoEscritura.writeUTF(apellido);
                    archivoEscritura.writeUTF(correo);
                }
            }catch(EOFException e){
                System.out.println();
                archivoEscritura.close();
                archivoLectura.close();
            }
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado.");
        }catch(IOException e){
            System.out.println("El archivo tiene errores de lectura-escritura.");
        }
    }
    
    public static void intercambiar(){
    
    }
    
    public static void eliminar(){
        System.out.println("Digite el correo del estudiante a eliminar.");
        Scanner lectura = new Scanner(System.in);
        String correoObjetivo = lectura.next();
        String nombre,apellido,correo;
        try{
            DataInputStream archivoLectura = new DataInputStream(new FileInputStream("estudiante.txt"));
            DataOutputStream archivoEscritura = new DataOutputStream(new FileOutputStream("estudiantesActualizado.txt",true));

            try{
                while(true){

                    nombre = archivoLectura.readUTF();
                    apellido = archivoLectura.readUTF();
                    correo = archivoLectura.readUTF();

                    if(!correo.equals(correoObjetivo)){
                        archivoEscritura.writeUTF(nombre);
                        archivoEscritura.writeUTF(apellido);
                        archivoEscritura.writeUTF(correo);
                    }
                }
            }catch(EOFException ex){
                archivoLectura.close();
                archivoEscritura.close();
            }
        }catch(FileNotFoundException e){
            System.out.println("Error al localizar el archivo: "+e.getMessage());
        }catch(IOException exe){
            System.out.println("El archivo tiene errores de escritura.");
        }
    }
    
    
}
