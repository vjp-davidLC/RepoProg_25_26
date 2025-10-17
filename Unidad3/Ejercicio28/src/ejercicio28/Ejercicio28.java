/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

/**
 *
 * @author David López
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double aleatorio = ((Math.random()*100));
        int aleatorioEntero = (int) aleatorio;
        
        System.out.println("Numero aleatroio: "+aleatorioEntero);
        
        if (aleatorioEntero % 2 == 0){
            System.out.println("Este numero es PAR.");
        }
        else {
            System.out.println("Este numero es IMPAR.");
        }
        
    }
    
}
