/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author David López
 */


public class Ejercicio4 {

    public static final int FIL = 4;
    public static final int COL = 3;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = new int[FIL][COL];

        rellenarArray(array);
        mostrarArray(array);
        mostrarParesArray(array);
        
    }
    
    public static void rellenarArray(int[][] array) {
    
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                array[i][j] = (int) (Math.random()*199+100);
            }
        }
        
    }
    
    public static void mostrarArray(int[][] array){
        System.out.println("-- ARRAY --");
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.println("Fila "+i+" "+ "Valor "+array[i][j]);
            }
        }
        
    }
    
    
    
    public static void mostrarParesArray(int[][] array){
        System.out.println("-- NUMEROS PARES --");
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.println(array[i][j]);
                }
                
            }
        }
        
    }
}
