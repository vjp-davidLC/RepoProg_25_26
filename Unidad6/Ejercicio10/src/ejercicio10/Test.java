/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author David
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Electrodomestico electrodomestico1 = new Electrodomestico(200, 10, "B");
        
        float consumo = electrodomestico1.calcularConsumo(3);
        float factura = electrodomestico1.calcularFactura(3);

        // También puedes imprimirlos aquí si quieres
        System.out.println("Consumo calculado: " + consumo);
        System.out.println("Factura calculada: " + factura);

    }
    
}
