package sem09;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    
     public static void main(String[] args) {
         //1. Crear el Socket (No hay ServerSocket, solo Socket)
         Socket socket = null;
         
         try {
             //IP, PortID
             socket = new Socket("127.0.0.1", 8528);
             //2. Crear la clase/objeto para construir mensajes (DataInputStream)
         } catch (IOException ex) {
             Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
             while(true){
                 try {
                    try{
                       DataInputStream stream = new DataInputStream(socket.getInputStream());
                      
                      //mensaje
                      System.out.println(stream.readUTF());


                        //3. Escribir el mensaje
                        //lectura del mensaje
                       // stream.readUTF();

                       //4. Cerrar Mensaje
                       stream.close();
                    }
                    catch(IOException ex){
                         Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 //5. Cerrar Socket.
                 socket.close();
             } catch (IOException ex) {
                 Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
