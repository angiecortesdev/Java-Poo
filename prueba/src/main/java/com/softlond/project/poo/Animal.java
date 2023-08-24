package main.java.com.softlond.project.poo;

public class Animal {
    
    //Atributos
    String nombre;
    int edad;
    String color;
    float peso;

    //Constructor
    public Animal(String nombre, int edad, String color, float peso){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.peso = peso;

    }


    //Funciones
    public void correr(){
        System.out.println("Soy " + nombre + " y estoy corriendo");
    }

    public void dormir(){
        System.out.println("Soy " + nombre + " y estoy durmiendo");
    }
    
}
