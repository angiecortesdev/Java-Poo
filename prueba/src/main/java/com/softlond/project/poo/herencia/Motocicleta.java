package main.java.com.softlond.project.poo.herencia;

public class Motocicleta extends MedioTerrestre {

    public String marcaCadena;

    public Motocicleta(float peso,float altura,int cantidadLlantas, String marcaCadena){
        super(peso, altura, cantidadLlantas);
        this.marcaCadena = marcaCadena;
    }

}
