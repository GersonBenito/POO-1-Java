package Logica;

public class Alumno {
    int id;
    String nombre;
    String apellido;
    double calificacion;

    // constructor vacio
    public Alumno(){

    }

    // constructor con parametros
    public Alumno(int id, String nombre, String apellido, double calificacion){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
    }

    // metodo saludar
    public void saludar(){
        System.out.println("Hola mi nombre es: " + this.nombre);
    }

    /**
     * Metodo para saber si el alumno esta aprobado o reprobado
     * @param calificacion debe de ser tipo double
     */
    public String isApproved(double calificacion){
        return (calificacion >= 7) ? "APROBADO" : "REPROBADO";
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public double getCalificacion(){
        return this.calificacion;
    }

    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
}
