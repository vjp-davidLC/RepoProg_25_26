/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        int numeroUsuario;
        
        System.out.println("Introdiuzca un numero entero: ");
        numeroUsuario = entrada.nextInt();
        
        return numeroUsuario;
    }
    
    public static int contarCifras(int numeroUsuario){
        int contador = 0;
        
         
        for (int i = numeroUsuario; i > 0; i /= 10) {
            contador++;
        }
        
        return contador;
    }
    
    public static void main(String[] args) {
        int numeroUsuario = pedirNumero();
        System.out.println(contarCifras(numeroUsuario));
        

    }
    
}
