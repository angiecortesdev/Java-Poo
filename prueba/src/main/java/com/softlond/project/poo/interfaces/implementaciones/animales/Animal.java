package main.java.com.softlond.project.poo.interfaces.implementaciones.animales;

import main.java.com.softlond.project.poo.interfaces.contrato.Desplazable;
import main.java.com.softlond.project.poo.interfaces.contrato.EmisorSonido;

public class Animal implements Desplazable, EmisorSonido{


    @Override

    public void desplazarse() {
        System.out.println("El animal se mueve");
    }

    @Override
    public void EmitirSonido() {
       System.out.println("Yo emito sonido");
    }

    @Override
    public void frenar() {
        System.out.println("Soy un animal y estoy frenando");
    }

    @Override
    public String direccionarDesplazamiento(String direccion) {
        return "Soy un animal y me desplazo a la " + direccion;

    }


}
