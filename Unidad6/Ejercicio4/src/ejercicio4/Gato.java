/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author David
 */
public class Gato extends Felinos{
    
    // Constructores
    // constructor por defecto
    public Gato() {
        super("", 0, 0);
    }
    
    // Constructor parametrizado
    public Gato(String nombre, int edad, int peso){
        super(nombre, edad, peso);
    }

    //Aqui implementamos los metodos de la clase PADRE y le añadimos el codigo que quiera ejecutar
    //Mostrar Sonido
    @Override
    public void mostrarSonido() {
        System.out.println("Sonido --> MAULLIDO");
    }

    //Mostrar Alimentacion
    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentacion --> RATONES");
    }
    
    //Mostrar Habitat
    @Override
    public void mostrarHabitat() {
        System.out.println("Habitat --> DOMESTICO");
    }
    
    // Mostrar Nombre cntfc
    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre Cientifico --> Felis silvestris catus");
    }
    
    // metodo toString(mostrar)
    @Override
    public String toString() {
        return " -- Gato -- \n"+super.toString();
    }
}
