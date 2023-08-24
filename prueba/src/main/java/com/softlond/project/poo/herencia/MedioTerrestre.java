package main.java.com.softlond.project.poo.herencia;

public class MedioTerrestre extends MedioTransporte {

    public int cantidadLlantas;

    public MedioTerrestre(float peso, float altura, int cantidadLlantas) {
        super(peso, altura);
        this.cantidadLlantas = cantidadLlantas;
    }

    @Override
    public void encender(){
        System.out.println("El medio de transporte terrestre encendió");
    }


    public void rodar(){
        System.out.println("El medio de transporte terrestre está rodando");
    }
    
}
