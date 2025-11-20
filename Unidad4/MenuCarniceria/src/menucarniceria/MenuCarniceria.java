/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menucarniceria;

import java.util.Scanner;

/**
 *
 * @author David López Castiñeira
 */
public class MenuCarniceria {

    /**
     * @param args the command line arguments
     */
    
    public static final char LETRA_INICIAL = 'A';
    public static final char LETRA_FINAL = 'C';
    public static int NUMEROCOMPRA = 0;
    public static int NUMEROPEDIDO = 0;
    
    public static void mostrarMenu() {
       
       boolean salir = false;
       
       // bucle que muestra el menu de opcion y donde se recogerá lo que el usuario introduzca
       do {
           
          
           
            System.out.println("--- MENU CARNICERIA ---");
            System.out.println("1 - COMPRAR");
            System.out.println("2 - RECOGER PEDIDO");
            System.out.println("3 - SALIR");
            
            int opcionUsuario = pedirOpcion();
           
            switch (opcionUsuario) {
                case 1:
                    incremenatrNumeroCompra();
                    System.out.println("Numero de espera para COMPRAR: " +
                            generarLetraAleatoria() + "-C" + NUMEROCOMPRA);  // genera un numero aleatorio
                    break;
                    
                case 2:
                    incrementarNumeroPedido();
                     System.out.println("Numero de espera para RECOGER PEDIDO: " +
                            generarLetraAleatoria() + "-P" + NUMEROPEDIDO); // genera un numero aleatorio
                    break;
                case 3:
                    System.out.println("Saliendo del programa ...");
                    salir = true; // sale dcel bucle
                    break;
                default:
                    System.out.println("Opcion INVALIDA."); // excepcion de errores
            }
       }
        while (!salir);
        
    }
    //  Genera una letra aleatoria entre A y C
    public static char generarLetraAleatoria() {
        int aleatorio = (int) (Math.random() * (LETRA_FINAL - LETRA_INICIAL + 1)) + LETRA_INICIAL;
        return (char) aleatorio;
    }
    //  Genera un número de espera para RECOGER PEDIDO
    public static void generarNumeroEsperaCompra() {
        
        System.out.println(NUMEROCOMPRA);
        
    }
    
    // Genera un número de espera para COMPRAR
    public static void generarNumeroEsperaPedido() {
        
        
        System.out.println(NUMEROPEDIDO);
    }
    // incrementa el numerod de pedido
    public static void incrementarNumeroPedido() {
        
            NUMEROPEDIDO++;        
    }
    
    // incrementa el numero de pedido
    public static void incremenatrNumeroCompra() {
        
            NUMEROCOMPRA++;        
        
    }
    // pide el la copcion al usuario
    public static int pedirOpcion() {
    
        Scanner entrada = new Scanner(System.in);
        int opcionUsuario;
        
        System.out.println("Inserte la opcion --> ");
        opcionUsuario = entrada.nextInt();
        
        return opcionUsuario;
    }
    
    public static void main(String[] args) {
        
       mostrarMenu();

    }
    
    
}



