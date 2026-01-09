/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author David
 */
public interface Pagable {
    
    public float pagoTarjeta();
    public float pagoEfectivo();
    public float pagoPaypal();
    public void procesarPago();
    
}
