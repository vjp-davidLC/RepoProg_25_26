/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author David
 */
public class Test {

    /**
     * @param animal
     * @param perro1
     * @param lobo1
     * @param leon1
     * @param gato1
     * @param args the command line arguments
     */
    
    // meotodo en el que implementamos elpolimorfismo ya que le pasamos por parametro una clase de tipo Animal
    public static void MostrarInformacion(Animal animal){ 
        System.out.println("-------------------");
        System.out.println("Informacion del animal: ");
        System.out.println("-------------------");
        animal.mostrarSonido();
        animal.mostrarAlimentacion();
        animal.mostrarHabitat();
        animal.mostrarNombreCientifico();
        
    }
    
    public static void main(String[] args) {

        //PARTE 1
        System.out.println("----- PARTE 1 -----");
        // objetos de tipo diferentes de subclases
        Perro perro1 = new Perro("Nina", 7, 13);
        Lobo lobo1 = new Lobo("Bolt", 5, 12);
        Leones leon1 = new Leones("Alex", 19, 190);
        Gato gato1 = new Gato("Garfield", 10, 12);
        
        //mostramos su informacion
        System.out.println(perro1.toString());
        MostrarInformacion(perro1);
        System.out.println("-------------------\n");
        
        //mostramos su informacion
        System.out.println(lobo1.toString());
        MostrarInformacion(lobo1);
        System.out.println("-------------------\n");
        
        //mostramos su informacion
        System.out.println(leon1.toString());
        MostrarInformacion(leon1);
        System.out.println("-------------------\n");
        
        //mostramos su informacion
        System.out.println(gato1.toString());
        MostrarInformacion(gato1);
        System.out.println("-------------------\n");
        
        
        //PARTE 2
        // Creamos los objetos a partir de la clase PRINCIPAL 
        Animal perro2 = new Perro("Nina", 7, 13);
        Animal lobo2 = new Lobo("Bolt", 5, 12);
        Animal leon2 = new Leones("Alex", 19, 190);
        Animal gato2 = new Gato("Garfield", 10, 12);

        System.out.println("----- PARTE 2 -----");
        // probamos en uno de los metodos de las clases para que los objetos creados anteriormente funcionen
        System.out.println("Perro: ");
        perro2.mostrarSonido();
        System.out.println("Lobo: ");
        lobo2.mostrarHabitat();
        System.out.println("Leon: ");
        leon2.mostrarAlimentacion();
        System.out.println("Gato: ");
        gato2.mostrarNombreCientifico();
    }
    
}
