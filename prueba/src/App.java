//import main.java.com.softlond.project.Calculadora;
import main.java.com.softlond.project.poo.encapsulamiento.Estudiante;
//import main.java.com.softlond.project.poo.encapsulamiento.Persona;
//import main.java.com.softlond.project.poo.herencia.MedioTerrestre;
import main.java.com.softlond.project.poo.encapsulamiento.ModuloInscripcion;
import main.java.com.softlond.project.poo.encapsulamiento.encapsulamiento2.Foraneo;



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


        Estudiante estudiante1 = new Estudiante("Angie", "10234613", 23);
        Estudiante estudiante2 = new Estudiante("Kathleen", "389836", 8);
        Estudiante estudiante3 = new Estudiante("Kamilo", "9735767", 32);

        System.out.println(estudiante1.nombre);
        System.out.println(estudiante1.numeroCedula);
        System.out.println(estudiante1.edad);

        ModuloInscripcion sistemaInscripcion = new ModuloInscripcion();
        sistemaInscripcion.inscribirEstudiante(estudiante1);
        sistemaInscripcion.inscribirEstudiante(estudiante2);
        sistemaInscripcion.inscribirEstudiante(estudiante3);

        Foraneo foraneo1 = new Foraneo("Ander", "541638543", 23);
        
        foraneo1.testAccesoProtected();



    }
}
