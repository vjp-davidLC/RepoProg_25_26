/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author David López
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int suma = 0;
        
        for (int num111 = 111; num111 <= 222; num111++) {
            
            if (num111 % 2 != 0){
                suma += num111;
            }
        }
        
        System.out.println("La suma de los numeros impares entre 111 y 222 es: " + suma);
        
    }
    
}
