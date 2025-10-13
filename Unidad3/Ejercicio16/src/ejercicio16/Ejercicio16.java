/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author David Lopez
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        int cantidad = 0;
        
        System.out.println("Los numeros impares existentes entre el numero 20 y el 160 son:");
        
        for (num = 20;num <= 160;num++) { // recorre todos los números entre 20 y 160
            
            if (num % 2 != 0){  // comprobamos si el número es impar
                
                System.out.println(num);
                cantidad++; // aumentamos el contador
            }
        }
        
        System.out.println("La cantidad de numeros impares impresos han sido: "+cantidad);
    }
    
}
