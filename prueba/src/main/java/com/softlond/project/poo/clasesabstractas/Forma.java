package main.java.com.softlond.project.poo.clasesabstractas;

abstract public class Forma {

    private String nombre;

    public Forma(String nombre){
        this.nombre = nombre;
    }

    public abstract double calcularArea(); //sin cuerpo

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Área: " + this.calcularArea());
    }

    public void SetNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }
}
