/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Carrito implements Descontable, Pagable{
    
    private float total;

    public Carrito() {
        this.total = 0f;
    }

    public Carrito(float total) {
        this.total = total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Total de la compra: "+this.total+" euros.";
    }

    @Override
    public void aplicarDescuento(float descuento) {
        total = total - (total * descuento / 100);  
    }

    @Override
    public float pagoTarjeta() { 
        return this.total + 5; 
    }

    @Override
    public float pagoEfectivo() {
        return this.total;
    }

    @Override
    public float pagoPaypal() {
        return this.total * 1.03f;
    }

    @Override
    public void procesarPago() {
        
        Scanner entrada = new Scanner(System.in);
        
        if (this.total > 50) {
            System.out.println("Se aplica un descuento del 10% por compras superiores a 50 euros");
            aplicarDescuento(10f);
        }
        
        int pagoUsuario;
        
        System.out.println("Seleccione metodo de pago:");
        System.out.println("1. Tarjeta (+5 euros comision)");
        System.out.println("2. Efectivo (sin comision)");
        System.out.println("3. Paypal (+3% comision)");
        System.out.print("Opcion entre 1-3: ");
        
        pagoUsuario = entrada.nextInt();
        
        switch (pagoUsuario) {
            case 1 :
                System.out.println("Has seleccionado el metodo con tarjeta.");
                this.total = pagoTarjeta();
                break;
            case 2 :
                System.out.println("Has seleccionado el metodo con efectivo.");
                this.total = pagoEfectivo();
                break;
            case 3 :
                System.out.println("Has seleccionado el metodo con Paypal.");
                this.total = pagoPaypal();
                break;
            default: 
                System.out.println("Opción no valida, se pagara en efectivo.");
                this.total = pagoEfectivo();
            
        }
        
        System.out.println(toString());
        
    }
    
    
    
    
    
}
