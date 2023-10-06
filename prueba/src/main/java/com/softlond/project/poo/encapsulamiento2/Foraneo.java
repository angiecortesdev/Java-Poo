package main.java.com.softlond.project.poo.encapsulamiento2;

import main.java.com.softlond.project.poo.encapsulamiento.Estudiante;

public class Foraneo extends Estudiante{

    public Foraneo(String nombre, String numeroCedula, int edad){
        super(nombre, numeroCedula, edad);
    }

    public void testAccesoProtected(){
        System.out.println(this.id);
    }

    public void testAccesoDefault(){
        System.out.println(this.codigo);
    }
}
