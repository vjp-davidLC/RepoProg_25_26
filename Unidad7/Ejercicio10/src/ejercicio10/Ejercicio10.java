/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = new int[10];
        
        rellenarArray(numeros);
        mostrarArray(numeros);
        sustituirValRepe(numeros);
        mostrarArray(numeros);
        
    }
    
    public static void rellenarArray(int array[]) {
    
        for (int i = 0; i < array.length; i++) {
            
            array[i] = (int) (Math.random()*8+1);
            
        }
    
    }
    
    public static void mostrarArray(int array[]) {
        
        System.out.print("Se han generado los siguiente numeros: ");
        for (int i = 0; i < array.length; i++) {
            
            System.out.print(array[i]+"");
            
        }
        System.out.println("");
    }
    
    public static void sustituirValRepe(int array[]) {
    
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i+1]) {
                array[i] = 0;
            }
        }
    
    }
    
    public static boolean esRepe(){
    
    }
    
}
