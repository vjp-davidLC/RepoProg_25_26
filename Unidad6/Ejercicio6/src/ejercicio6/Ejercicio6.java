/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import javax.accessibility.AccessibleState;

/**
 *
 * @author David
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //  PARTE 1
        Libro libro1 = new Libro("Harry Potter","JKR","Fantasia");
        Persona person1 = new Persona("David", "Lopez", "Deiviz");
        
        libro1.contarVocales();
        libro1.obtenerIniciales();
        libro1.obtenerCadenaMasLarga();
        libro1.buscarCadena(Potter);
        
        
        // PARTE 2
        Transformable libro2 = new Libro("Catedral de Mar", "Idelfonso", "Historia");
        Transformable person2 = new Persona("Lionel", "Andres", "La pulga");
        
        
        
        
    }
    
}
