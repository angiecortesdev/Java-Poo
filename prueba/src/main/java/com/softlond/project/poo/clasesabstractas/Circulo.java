package main.java.com.softlond.project.poo.clasesabstractas;

public class Circulo extends Forma{

    private double radio;

    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;

    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }


}
