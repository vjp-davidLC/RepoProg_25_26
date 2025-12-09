/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;


/**
 *
 * @author David
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        
        boolean salirPrograma = false;
        int suscripcionUsuario;
        
        Suscripcion suscripcion1 = new SuscripcionTv(32f);
        Suscripcion suscripcion2 = new SuscripcionPeriodico(10f);
        
        System.out.println("---  MENU DE PRECIOS  ---");
        System.out.println("- Precio de la suscripcion TV -");
        System.out.println(suscripcion1.toString());
        System.out.println();
        System.out.println("- Precio de la suscripcion del Periodico -");
        System.out.println(suscripcion2.toString());
        
        System.out.println();
        System.out.println("Seleccione una de las opciones 1-2.");
        suscripcionUsuario = entrada.nextInt();
        
        Suscripcion aux; // variable de tipo Suscripcion
        
        switch (suscripcionUsuario) {
            case 1:
                aux = suscripcion1;
                break;
            case 2:
                aux = suscripcion2;
                break;
            default:
                System.out.println("Opción inválida. Se seleccionará Periódico por defecto.");
                aux = suscripcion2;
                break;
        }
        
        Carrito carrito = new Carrito(aux.calcularPrecio());
        carrito.procesarPago();
    }
        
        
}
    
