package sem09;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorMultihilo {
    
     public static void main(String[] args) {
         ServerSocket serverSocket = null;
         
         try {
             serverSocket = new ServerSocket(8528);
         } catch (IOException ex) {
             Logger.getLogger(ServidorMultihilo.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         while(true){
             try {
                 final Socket socket = serverSocket.accept();
                 
                 //un hilo por cada socket instanciado 
                 //(por cada cliente que se conecta)
                 
                    new Thread( 
                            new Runnable(){
                                public void run(){
                                      //codigo para correr el mensaje del cliente
                                      startServer(socket);
                                }
                            }
                    ).start();
                 
             } catch (IOException ex) {
                 Logger.getLogger(ServidorMultihilo.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
     
     public static void startServer(Socket socket){
         
         try {
            DataOutputStream mensaje = new DataOutputStream(socket.getOutputStream());
            mensaje.writeUTF("Mensaje recibido del servidor con exito");
            System.out.println("mensaje recibido en servidor.");
            socket.close();
         } catch (IOException ex) {
             Logger.getLogger(ServidorMultihilo.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
}
