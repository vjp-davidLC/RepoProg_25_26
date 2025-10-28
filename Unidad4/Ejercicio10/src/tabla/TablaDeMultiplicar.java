/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabla;

import peticion.PeticionnNumero;

/**
 *
 * @author David López
 */
public class TablaDeMultiplicar {
    
    public static void tablaDeMultiplicar(){
        
        int num1 = PeticionnNumero.peticionNumero();
        
        for (int i = 0; i <= 10; i++) {
            int producto = num1 * i;
            System.out.println(num1+" x "+i+ " = "+producto);
        }
        
        
    }
    
}
