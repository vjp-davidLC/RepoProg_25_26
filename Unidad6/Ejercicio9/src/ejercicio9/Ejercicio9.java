/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author David
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Gravable persona1 = new Persona(1234, 23111);
       
        persona1.calcularImpuesto();
        
        Gravable vehiculo1 = new Vehiculo(2222, 89898, 1756);
        
        vehiculo1.calcularImpuesto();
    }
    
}
