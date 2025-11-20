/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprimeraunidadesdavidlopez;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class ExamenPrimeraUnidadesDavidLopez {

    /**
     * @param args the command line arguments
     */
    // método que pide al usuario un numero entero para la frecuencia y lo devuelve
    public static int pedirFrecuencia() {
    
        Scanner entrada = new Scanner(System.in);
        
        int frecuenciaUsuario;
        
        System.out.println("Inserte el numero de frecuencia de la senhal --> ");
        frecuenciaUsuario = entrada.nextInt();
        return frecuenciaUsuario;
        
    }
    
    /* metodo (que no esta bien) que encuentra un primer patron de la frecuencia (estaba intentando hacer la forumla de numeros primos, 
    es un fallo de conocimientos matematicos).
    */
    public static void encontrarPatron() {
        
        int frecuenciaUsuario = pedirFrecuencia();
        
        if (frecuenciaUsuario <= 1) { // la frecuencia del usuario tiene que ser si o si mayor que 1
            System.out.println("No es adecuedado esta frecuencia");
        }
        
        else { // aqui es donde estaba intendo hacer la formula
            for (int i = 2; i < Math.sqrt(frecuenciaUsuario); i++) { // recorro todos los numeros hasta la frecuncia
            
                if (i % frecuenciaUsuario == 0) // esto es lo que me falla
                    System.out.println("Primer patron detectable :"+i);
            }
        }
        
        System.out.println("---------------------");
        
    }
    
    // metodo que pide al usuario el numero de la potencia y lo devuelve
    public static int pedirPotencia() {
    
        Scanner entrada = new Scanner(System.in);
        
        int potenciaUsuario;
        
        potenciaUsuario = entrada.nextInt();
        return potenciaUsuario;
        
    }
    
    // método qeu calcula el volumen con la formula dada en el examen
    public static void calcularVolumenPlaneta(double radio) { //por parametros le pasamos un numero
        
        double volumenPlaneta = 4/3 * Math.PI * Math.pow(radio, 3); // formula del examen
        
        System.out.println("El volumen del planeta es "+volumenPlaneta);
        System.out.println("---------------------");
        
    }
    
    // método (burbuja) que pone de menor a mayor los numeros que estan por parametros
    public static void menorMayorPotencia(int potencia1, int potencia2, int potencia3) {
        
        int aux; // variable auxiliar
        
        // bucle que ejecuta lo que hay n veces
        for (int i = 0; i < 3; i++) {
            
            // si el numero es mayor que el otro pues se cambian posiciones
            if (potencia1 > potencia2) {
                aux = potencia1;
                potencia1 = potencia2;
                potencia2 = aux;
            }
            if (potencia2 > potencia3) {
                aux = potencia2;
                potencia2 = potencia3;
                potencia3 = aux;
            }
            
        }
        
        System.out.println("La potencia de menor a mayor seria: "+potencia1+" > "+potencia2+" > "+potencia3);
        
    }
    
    // en este método se pide al usuario las tres potencias y se pone el orden de menor a mayor llamando al metodo
    public static void ajusatrPotencias() {
    
        System.out.println("Inserte la primera potencia de motor -->");
        int potencia1 = pedirPotencia();
        
        System.out.println("Inserte la segunda potencia de motor -->");
        int potencia2 = pedirPotencia();
        
        System.out.println("Inserte la tercera potencia de motor -->");
        int potencia3 = pedirPotencia();
        
        // llamamos al métodos y le pasamos por parametros los 3 numeros introducidos por el usuario
        menorMayorPotencia(potencia1, potencia2, potencia3);
        
        System.out.println("---------------------");

        
    }
    
    // metodo principal donde se situa el menu
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean salir = false; // vairbale que deteminara si salimos del bucle o no
        
        try { // control de excepciones 
            
            // bucle que nos muestra al menos una vez el menu
            do {

                System.out.println("--- NAVE ESPACIAL ---");
                System.out.println("-- Opciones de la nave --");
                System.out.println("1- Analizar senhal recibida.");
                System.out.println("2- Ajustar las potencias de sus motores. ");
                System.out.println("3- Calcular el volumen de un planeta. ");
                System.out.println("4- Salir del programa espacial. ");
                System.out.println("Inserte una de las opciones --> ");


                    int opcionUusario = entrada.nextInt(); // pedimos al usuario la opcion
                    
                    // menu que controla lo que inserte el usuario como opcion y se ejecutará los metodos correspondientes
                    switch (opcionUusario) {
                        case 1:
                            encontrarPatron(); // llama al metodo 
                            break;
                        case 2:
                            ajusatrPotencias(); // llama al metodo
                            break;
                        case 3:
                            System.out.println("Inserte el radio del planeta --> ");
                            double radioUsuario = entrada.nextDouble();
                            calcularVolumenPlaneta(radioUsuario); // llama al metodo pero pasandole por parámetros el radio insertado por el usuario
                            break;
                        case 4:
                            System.out.println("Saliendo del programa ...");
                            salir = true; // sale del programa al cambiar el valor
                            break;
                        default: // si el usuario no inserta 1 ni 2 ni 3 ni 4
                            System.out.println("ERROR. Solo se permite una opciones del 1-4.");
                    }


            } while (!salir); // mientras el booleano salir sea false no saldrá del bucle
        }
        catch (Exception InputMismatchExceptio) { // salta este error si el usuario inserta una letra en vez de una numero
                System.out.println("ERROR. Solo se puede insertar numeros."); 
        }
        
    }
    
}
