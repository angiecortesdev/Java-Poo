package main.java.com.softlond.project.poo.encapsulamiento;

public class Persona {
    private String nombre;
    private String numeroCedula;
    private int edad;

    public Persona(String nombre, String numeroCedula, int edad){
        this.nombre = nombre;
        this.numeroCedula = numeroCedula;
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNumeroCedula(String numeroCedula){
        this.numeroCedula = numeroCedula;
    }

    public String getNumeroCedula(){
        return numeroCedula;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }
}
