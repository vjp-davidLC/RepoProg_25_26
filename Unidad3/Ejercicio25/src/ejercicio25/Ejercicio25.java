/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author David López
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int suma = 0;
        
        for (int num17 = 17; num17 <= 139; num17++) {
            
            if (num17 % 2 == 0){
                suma += num17;
            }
        }
        
        System.out.println("La suma de los numeros pares entre 17 y 139 es: " + suma);
        
    }
    
}
