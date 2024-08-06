
package controller;
import model.ProfesorModel;
import view.ProfesorView;

public class ProfesorController {
    public ProfesorModel model;
    public ProfesorView view;

    public ProfesorController(ProfesorModel model, ProfesorView view) {
        this.model = model;
        this.view = view;
    }
    
    public void CrearProfesor(ProfesorModel model){
        
        //validaciones
        if(model.getNombre() == null || model.getMail() == null){
            //si falla validacion, solicitamos error grafico en la vista.
            view.MostrarError("Nombre o Mail no pueden estar vacios.");
        }
        
        this.model = model;
        //llama modulo DB
        
        //actualizamos vista
        view.MostrarProfesor(this.model);
    }
    
    
    
    public void ActualizarProfesor(){
        ProfesorModel model = view.ActualizarProfesor();
        //validaciones
        if(model.getNombre() == null || model.getMail() == null){
            //si falla validacion, solicitamos error grafico en la vista.
            view.MostrarError("Nombre o Mail no pueden estar vacios.");
        }
        
        //llama modulo DB
        this.model = model;

        //actualizamos vista
        view.MostrarProfesor(model);
    }
}
