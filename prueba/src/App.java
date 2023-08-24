//import main.java.com.softlond.project.Calculadora;
import main.java.com.softlond.project.poo.herencia.MedioTerrestre;



public class App {
    public static void main(String[] args) throws Exception {
        //Calculadora.suma(5, 6);
        //Calculadora.resta(8, 4);

        

        MedioTerrestre terrestre1 = new MedioTerrestre(1.5f, 45, 4);
        
        System.out.println(terrestre1.peso);
        System.out.println(terrestre1.altura);
        System.out.println(terrestre1.cantidadLlantas);

        terrestre1.encender();




    }
}
