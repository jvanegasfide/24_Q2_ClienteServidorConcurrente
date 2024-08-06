
package view;

import javax.swing.JOptionPane;
import model.ProfesorModel;

public class ProfesorView {
    public void MostrarError(String mensajeError){
        JOptionPane.showMessageDialog(null, mensajeError);
    }
    
    public void MostrarProfesor(ProfesorModel model){
        JOptionPane.showMessageDialog(null, 
                "Los datos del profesor son: "+model.toString());
    }
    
    public ProfesorModel ActualizarProfesor(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre.");
        String mail = JOptionPane.showInputDialog("Ingrese el mail.");
        ProfesorModel model = new ProfesorModel(id, nombre, mail);
        return model;
    }
}
