/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author David
 */
public class Test{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // PARTE 1
        System.out.println("---- PARTE 1 ----");
        // Objeto TELEVISOR
        Televisor tv1 = new Televisor();
        
        tv1.encender();
        tv1.mostrarTelevisor();
        
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.mostrarTelevisor();
        
        tv1.cambiarCanal(9);
        tv1.bajarVolumen();
        tv1.apagar();
        tv1.mostrarTelevisor();
        
        // PARTE 2
        System.out.println("\n---- PARTE 2 ----");
        // Objeto RADIO
        Radio radio1 = new Radio();
        
        radio1.encender();
        radio1.mostrarTelevisor();
        
        radio1.subirVolumen();
        radio1.subirVolumen();
        radio1.subirVolumen();
        radio1.mostrarTelevisor();

        
        radio1.cambiarCanal(101.2f);
        radio1.bajarVolumen();
        radio1.apagar();
        radio1.mostrarTelevisor();
        
    }
    
}
