/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author David
 */
public class Ejercicio4 { // TEST

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pajarito p1 = new Pajarito();
        Pajarito p2 = new Pajarito();
        
        p1.establecerColoryEdad("rojo", 1);
        p2.establecerColoryEdad("azul", 2);
        
        System.out.println("Cantidad de pajaros : "+Pajarito.muestraPajaros());

    }
    
}
