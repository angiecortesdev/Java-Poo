package main.java.com.softlond.project.poo.herencia;

public class MedioTransporte {

    public float peso;
    public float altura;

    public MedioTransporte(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }


    public void encender(){
        System.out.println("El medio de transporte encendió");
    }

    public void apagar(){
        System.out.println("El medio de transporte se apagó");
    }    
}
