/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author David
 */
public abstract class Animal { // clase RAIZ
    
    //Atributos de la clase
    private String nombre;
    private int edad;
    private int peso;
    
    // Constructores
    // constructor por defecto
    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;    }
    
    // Constructor parametrizado
    public Animal(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    // metodos abstractos que implementaremos en las subclases
    public abstract void mostrarSonido();
    
    public abstract void mostrarAlimentacion();
    
    public abstract void mostrarHabitat();
    
    public abstract void mostrarNombreCientifico();

    // metodo toString(mostrar)
    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\n" 
             + "Peso: " + peso + " kg\n" 
             + "Edad: " + edad + " anhos";
    }

    
    
}
