package sem09;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    
     public static void main(String[] args) {
         ServerSocket serverSocket = null;
          
         try {
             //1. Intanciar ServerSocket
             serverSocket = new ServerSocket(8528);
             
         } catch (IOException ex) {
             Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         while(true){
            try {
                //2. Aceptar conexion de Socket
                Socket socket = serverSocket.accept();

                //3. Leer paquetes/mensajes del Socket
                DataOutputStream mensaje = new DataOutputStream(socket.getOutputStream());

                //Llamar logica de negocio / ejecutar transacciones internas parte 
                //de nuestra aplicacion
                mensaje.writeUTF("mensaje recibido con exito");
                
                //cerrar el mensaje
                mensaje.close();
                
                //4. Cerrar Conexion
                socket.close();

            } catch (IOException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
         
         }
    }
}
