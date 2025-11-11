/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author David
 */
public class Pajarito {
    
    private static int numpajaros=0;
    private String color;
    private int edad;
    
    public static void nuevopajaro(){
        numpajaros++;
    }
    
    public void establecerColoryEdad(String col, int ed) {
        color = col;
        edad = ed;
        nuevopajaro();
    }
    
    
    public static int muestraPajaros() {
        return numpajaros;
    }
    
}
