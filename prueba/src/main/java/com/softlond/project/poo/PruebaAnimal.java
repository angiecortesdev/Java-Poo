package main.java.com.softlond.project.poo;


public class PruebaAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Monchi", 8, "amarillo", 18.6f);
        System.out.println("Mi nombre es: " + animal1.nombre + " tengo " + animal1.edad + " años, " + " soy de color " + animal1.color + " y peso " + animal1.peso + " KG");
        animal1.correr();

        Animal animal2 = new Animal("Firulais", 3, "negro", 12.6f);
        System.out.println("Mi nombre es: " + animal2.nombre + " tengo " + animal2.edad + " años, " + " soy de color " + animal2.color + " y peso " + animal2.peso + " KG");
        animal2.dormir();


    }
    
}

