package main.java.com.softlond.project.poo.encapsulamiento;

public class Contaduria {
    public Contaduria(){};

    public float obtenerCostoMatricula(float costoMatriculaEstandar, Estudiante estudiante, int semestre){
        float descuento = this.calcularPorcentajeDeCobro(semestre, estudiante);
        return costoMatriculaEstandar * descuento;
    }

    private float calcularPorcentajeDeCobro(int semestre, Estudiante estudiante){
        if(semestre < 2 || estudiante.getPromedio() < 4){
            return 1;
        }
        return 0.75f;
    }
}
