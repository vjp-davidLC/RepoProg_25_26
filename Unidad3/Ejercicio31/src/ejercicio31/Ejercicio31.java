/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;


/**
 *
 * @author David López
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int contadorImpares = 0;
        int totalGenerados = 0;
        
        System.out.println("--- GENERANDO NUMEROS ALEATORIOS ---");
        
        while (contadorImpares < 3) {            
            double aleatorio = ((Math.random()*100)+1);
            int aleatorioEntero = (int) aleatorio;
            
            System.out.println("Numero aleatorio :"+aleatorioEntero);
            totalGenerados++;
            
            if (aleatorioEntero % 2 != 0){
                contadorImpares++;
                System.out.println("IMPAR ENCONTRADO: " + aleatorioEntero+ " --");
                
            }
            
        }
        
        System.out.println("Se han generados un total de "+totalGenerados+ " intentos.");
        
    }
    
}
