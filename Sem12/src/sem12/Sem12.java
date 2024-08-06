
package sem12;

import controller.ProfesorController;
import view.ProfesorView;
import model.ProfesorModel;

public class Sem12 {

    public static void main(String[] args) {
        ProfesorModel model = new ProfesorModel(1,"Pedro Jimenez", "test@ufide.ac.cr");
        ProfesorView view = new ProfesorView();
        ProfesorController controller= new ProfesorController(model, view);
        
        controller.CrearProfesor(model); 
        controller.ActualizarProfesor();
    }
}
