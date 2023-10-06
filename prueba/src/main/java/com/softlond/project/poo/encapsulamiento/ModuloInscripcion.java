package main.java.com.softlond.project.poo.encapsulamiento;

import java.util.ArrayList;

public class ModuloInscripcion {
    ArrayList<Estudiante> estudiantes;

    public ModuloInscripcion(){
        this.estudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);

        System.out.println("El estudiante con el id " + estudiante.id + " fue inscrito correctamente");
    }
}
