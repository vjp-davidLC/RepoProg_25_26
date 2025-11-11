/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author David
 */
public class Asignatura {
    
    private String nombre;
    private double nota;

    public Asignatura(String nom) {
        nombre = nom;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public void establecerNota(double not) {
        nota = not;
    }
    
    public double obtenerNota(){
        return nota;
    }
    
    public static double calcularNotaMedia(double not1,double not2,double not3,double not4,double not5,double not6) {
        
        double notaMedia = (not1 + not2 + not3 +not4 +not5 + not6) / 6;
        
        return notaMedia;
    }
    
}
