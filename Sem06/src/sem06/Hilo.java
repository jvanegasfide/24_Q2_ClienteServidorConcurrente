
package sem06;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo extends Thread {
    
    
    @Override
    public void run(){
        for(var indice = 0; indice<10; indice++){
            try {
                System.out.println("Ejecucion numero: "+indice);
                sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
