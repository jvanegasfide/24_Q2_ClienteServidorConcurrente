package model;


public class ProfesorModel {

    public int getIdprofesor() {
        return idprofesor;
    }

    @Override
    public String toString() {
        return "ProfesorModel{" + "idprofesor=" + idprofesor + ", nombre=" + nombre + ", mail=" + mail + '}';
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    private int idprofesor;
    private String nombre;
    private String mail;
    
    public ProfesorModel(int idprofesor, String nombre, String mail){
        this.idprofesor = idprofesor;
        this.nombre = nombre;
        this.mail = mail;
    }
    
    
}
