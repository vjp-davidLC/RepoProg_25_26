/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Test {

    /**
     */
    public static void mostrarMenu() {
    
        System.out.println("\n-- Cajero Automatico --");
        System.out.println("1.- Crear cuenta vacia.");
        System.out.println("2.- Crear cuenta con saldo inicial.");
        System.out.println("3.- Ingresar dinero");
        System.out.println("4.- Sacar dinero.");
        System.out.println("5.- Ver saldo.");
        System.out.println("6.- Salir.");
    }
    
    // metodo que crear uan cuenta sin saldo
    public static Cuenta crearCuentaVacia() {
        
        Cuenta cuentaVacia = new Cuenta();
        return cuentaVacia;
    }
    
    // metodo que crea una cuenta con saldo
    public static Cuenta crearCuentaConSaldo(int cantidadDeseadaUsuario) {
        
        Cuenta cuentaConSaldo = new Cuenta(cantidadDeseadaUsuario);
        return cuentaConSaldo;
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcionUsuario;
        boolean salir = false;
        Cuenta cuentaActual = null; // variable que guradrá la cuenta creada por el usuario y asi manejarlo
        
        do {            
            
            mostrarMenu();
            opcionUsuario = entrada.nextInt();
            
            switch (opcionUsuario) {
                case 1:
                    cuentaActual = crearCuentaVacia();
                    System.out.println("Cuenta creada con exito.");
                    System.out.println("Recuerda que su saldo es 0");
                    
                    break;
                    
                case 2:
                    System.out.println("Inserte una cantidad deseado para su cuenta --> ");
                    int cantidadDeseadaUsuario = entrada.nextInt(); // pedimos al usuario la cantidad
                    // se crea una cuenta con la cantidad que haya insertado el usuario
                    cuentaActual = crearCuentaConSaldo(cantidadDeseadaUsuario);
                    System.out.println("Cuenta creada con exito.");
                    
                    break;
                    
                case 3:
                    System.out.println("Inserte una cantidad deseado para ingresas a su cuenta --> ");
                    cantidadDeseadaUsuario = entrada.nextInt(); // pedimos al usuario la cantidad
                    // agremos con el metodo la cantidad del usuario
                    cuentaActual.ingresarSaldo(cantidadDeseadaUsuario); 
                    System.out.println("Operacion realizada con exito.");
                    
                    break;
                    
                case 4:
                    System.out.println("Inserte una cantidad para sacar de tu cuenta -->");
                    cantidadDeseadaUsuario = entrada.nextInt();
                   // restamos con el metodo la cantidad del usuario
                    cuentaActual.extraerSaldo(cantidadDeseadaUsuario);
                    System.out.println("Operacion realizada con exito.");
                    
                    break;
                case 5:
                    // mostramos el dato con el metodo to string
                    System.out.println("Su "+cuentaActual.toString()+" dineros.");
                    break;
                    
                case 6:
                    // salimos del programa
                    System.out.println("\nSaliendo del programa...");
                    salir = true; // sale del programa
                    break;
                    
                default:
                    // si el usuario no inserta una de las opciones disponibles salta este mensaje
                    System.out.println("ERROR. Tiene que insertar un numero entre 1-6");;
            }
            
            
        } while (!salir); // mientras "salir" sea false se va repitiendo el bucle

    }
    
}
