/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    
    public static void billetes(int importe) {
        
        System.out.println(importe+" Euros se descomponen en :");
        
        int billeteCincuenta = importe / 50; // variable que contendrá los billetes de 50
        importe = importe - (billeteCincuenta * 50); // le quitamos al importe los billetes de 50
        int billeteVeinte = importe / 20;
        importe = importe - (billeteVeinte * 20);
        int billeteDiez= importe / 10;
        importe = importe - (billeteDiez * 10);
        int billeteCinco= importe / 5;
        importe = importe - (billeteCinco * 5);
        int monedaDos = importe / 2;
        importe = importe - (monedaDos * 2);
        int monedaUno = importe;
        
        if (billeteCincuenta > 0){
            System.out.println("Billetes de 50: "+billeteCincuenta);
        }
        if (billeteVeinte > 0){
            System.out.println("Billetes de 20: "+billeteVeinte);
        }
        if (billeteDiez > 0){
            System.out.println("Billetes de 10: "+billeteDiez);
        }
        if (billeteCinco > 0){
            System.out.println("Billetes de 5: "+billeteCinco);
        }
        if (monedaDos > 0){
            System.out.println("Monedas de 2: "+monedaDos);
        }
        if (monedaUno > 0){
            System.out.println("Monedas de 1: "+monedaUno);
        }
    }
    
    public static void main(String[] args) {

        int importe;
        int aux;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, indique una cantidad de dinero --> ");
        importe = entrada.nextInt();
        
        Ejercicio8.billetes(importe);

    }
    
}
