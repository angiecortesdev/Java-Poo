package main.java.com.softlond.project.poo.interfaces.implementaciones.transporte;

import main.java.com.softlond.project.poo.interfaces.contrato.Desplazable;

public class Automovil implements Desplazable{


    @Override
    public void desplazarse(){
        System.out.println("Soy un automóvil y puedo desplazarme por carretera");
    }

    @Override
    public void frenar(){
        System.out.println("Soy un automóvil y puedo frenar en carretera");
    }

    @Override
    public String direccionarDesplazamiento(String direccion) {
        return "Soy un automovil y me desplazo a la " + direccion;
    }
}
