
package sem06;

import java.util.ArrayList;
import java.util.HashMap;

public class Sem06 {

    public static void main(String[] args) {
        
        int numero = 1;
        Factura factura = new Factura();
        
        //Colecciones Genericas
        ArrayList arreglo = new ArrayList(); 
        arreglo.add(factura);//agrega objeto de tipo Factura
        arreglo.add(factura);//agrega objeto de tipo Factura
        arreglo.add(numero);//agrega entero
        
        //Coleccion con tipo (Factura)
        ArrayList<Factura> arregloTipado = new ArrayList(); 
        arregloTipado.add(factura);//agrega objeto de tipo Factura
        arregloTipado.add(factura);//agrega objeto de tipo Factura
        //arregloTipado.add(numero);//agrega entero, no lo permite
        
        
        HashMap map = new HashMap();
        map.put("numeroFactura",factura);//inserta objeto de tipo Factura
        map.put("numeroEntero", numero);//inserta entero
        
        HashMap<String, Factura> mapaTipado = new HashMap();
        mapaTipado.put("primeraFactura", factura);
        mapaTipado.put("primeraFactura", factura);
        mapaTipado.put("primeraFactura", factura);
        mapaTipado.put("primeraFactura", factura);

        //System.out.println("mapaTipado.primeraFactura: "+mapaTipado.get("primeraFactura").toString());
        
        //Hilos
        Hilo hilo = new Hilo();
        hilo.start();        
        
        
        
        
        
        
        
        
        
        
    }
}
