/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author David
 */
public class Curso {
    
    private String nombre;
    private int numeroHoras;
    private static int numeroDeCursos = 0;
    
    public void establecerNombreyHoras(String n, int h) {
        nombre = n;
        numeroHoras = h;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerHoras(){
        return numeroHoras;
    }
    
    public static void sumarCursos(){
        numeroDeCursos++;
    }
    
    public static int verNumeroCursos(){
        return numeroDeCursos;
    }
    
    
    
}
