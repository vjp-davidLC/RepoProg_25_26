/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author David López
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] primos = new int[80]; // array con 80 posiciones
        int num = 1; // variable que se le asignará un numero y se le comprobará si es primo o no
        int pos = 0; // variable que indicará la posicion del array
        boolean esPrimo; // booleano que nos dirá si es primo o no
        
        // mientras la posicion sea menor que el final del array hace lo siguiente...
        while (pos < 80) {
            esPrimo = true; // supongamos que el numero ya es primo

            if (num < 2) { // si el numero es menor que 2 No es primo
                esPrimo = false;
            } else { // si el numero es mayor que 2 inicializará el siguiente bucle
                // recorrerá desde el 2 hasta el dado numero e irá incrementado la i
                for (int i = 2; i < num; i++) {
                    // si el módulo de dado numero es 0 entonces Es primo
                    if (num % i == 0) {
                        esPrimo = false;
                    }
                }
            }
            // como hemos inicializado el booleano en true este proceso seguirá acto seguido
            if (esPrimo) {
                primos[pos] = num; // guardamos dado numero es la poscion del array
                pos++; // irá incrementando la posicion del array
            }

            num++; // despuues de la condicion anterior se haya cumplido el dado numero se incrementará
                   // e irá a repetirse el bucle
        }
        
        // mostramos las posiciones del array con su valor
        for (int i = 0; i < 80; i++) {
            System.out.print("["+i+"]--> "+ primos[i]+"; ");
        }
    }
    
}
