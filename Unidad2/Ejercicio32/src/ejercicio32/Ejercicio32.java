/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int importe; // variable que contendrá lo que el usuario inserta
        int cartera;
        
        Scanner entrada = new Scanner (System.in);  // varibale que recogerá lo que le usuairo inerte
        
        System.out.println("Por favor, indique una cantidad de dinero --> ");
        importe = entrada.nextInt(); // se pasa lo que el usuario haya insertado a la variable importe
        
        cartera = importe; 
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
        
        System.out.println(cartera+" Euros se descomponen en "+billeteCincuenta+" billetes de 50, "+billeteVeinte+" billetes de 20, "+billeteDiez+" billetes de 10, "
                + ""+billeteCinco+" billetes de 5, "+monedaDos+" monedas de 2 euros y "+monedaUno+" monedas de 1 euro.");
        
        
        
        
    }
    
}
