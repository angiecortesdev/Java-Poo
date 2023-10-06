//import main.java.com.softlond.project.Calculadora;
//import main.java.com.softlond.project.poo.encapsulamiento.Contaduria;
//import main.java.com.softlond.project.poo.encapsulamiento.Estudiante;
//import main.java.com.softlond.project.poo.encapsulamiento.Persona;
//import main.java.com.softlond.project.poo.herencia.MedioTerrestre;
//import main.java.com.softlond.project.poo.encapsulamiento.ModuloInscripcion;
//import main.java.com.softlond.project.poo.encapsulamiento2.Foraneo;
//import main.java.com.softlond.project.poo.clasesabstractas.Circulo;
//import main.java.com.softlond.project.poo.clasesabstractas.Rectangulo;

//import java.util.Scanner;

import main.java.com.softlond.project.poo.interfaces.implementaciones.animales.Animal;
import main.java.com.softlond.project.poo.interfaces.implementaciones.transporte.Automovil;

public class App {
    public static void main(String[] args) throws Exception {
        //Calculadora.suma(5, 6);
        //Calculadora.resta(8, 4);


        //MedioTerrestre terrestre1 = new MedioTerrestre(1.5f, 45, 4);

        //System.out.println(terrestre1.peso);
        //System.out.println(terrestre1.altura);
        //System.out.println(terrestre1.cantidadLlantas);

        //terrestre1.encender();

        //Persona persona1 = new Persona("Angie", "1033761953", 29);

        //System.out.println(persona1.nombre);
        //System.out.println(persona1.numeroCedula);
        //System.out.println(persona1.edad);


        // Estudiante estudiante1 = new Estudiante("Angie", "10234613", 23);
        //Estudiante estudiante2 = new Estudiante("Kathleen", "389836", 8);
        //Estudiante estudiante3 = new Estudiante("Kamilo", "9735767", 32);

        //System.out.println(estudiante1.getNombre());
        //System.out.println(estudiante1.getNumeroCedula());
        //System.out.println(estudiante1.getEdad());

        //System.out.println(estudiante2.getNombre());
        //System.out.println(estudiante2.getNumeroCedula());
        //System.out.println(estudiante2.getEdad());

        //ModuloInscripcion sistemaInscripcion = new ModuloInscripcion();
        //sistemaInscripcion.inscribirEstudiante(estudiante1);
        //sistemaInscripcion.inscribirEstudiante(estudiante2);
        //sistemaInscripcion.inscribirEstudiante(estudiante3);

        //Foraneo foraneo1 = new Foraneo("Ander", "541638543", 23);

        //foraneo1.testAccesoProtected();



        // System.out.println(estudiante1.toString());
        // estudiante1.setPromedio(4.5f);

        // Contaduria contaduria = new Contaduria();

        // float costoMatricula = contaduria.obtenerCostoMatricula(1000000, estudiante1, 2);
        // System.out.println(costoMatricula);

        //-------------Clases abstractas----------
//Circulo circulo1 = new Circulo(10);
        //System.out.println(circulo1.calcularArea());


         //Rectangulo rectangulo1 = new Rectangulo(5, 8);
        // System.out.println(rectangulo1.calcularArea());

        // circulo1.mostrarInfo();
        // rectangulo1.mostrarInfo();


       Automovil auto1 = new Automovil();

       auto1.desplazarse();
       auto1.frenar();
       System.out.println(auto1.direccionarDesplazamiento("izquierda"));


       Animal snake = new Animal();
       snake.desplazarse();
       snake.EmitirSonido();
       snake.frenar();
       System.out.println(snake.direccionarDesplazamiento("Derecha"));


    }

}
