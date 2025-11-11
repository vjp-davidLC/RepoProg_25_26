/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author David
 */
public class Ejercicio2 { // TEST

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        
        curso1.establecerNombreyHoras("DAM", 200);
        Curso.sumarCursos();
        curso2.establecerNombreyHoras("ASIR", 300);
        Curso.sumarCursos();
        
        System.out.println("CURSO 1");
        System.out.println("Curso --> "+curso1.obtenerNombre());
        System.out.println("Horas -->"+curso1.obtenerHoras());
        
        System.out.println("-------------");
        
        System.out.println("CURSO 2");
        System.out.println("Curso --> "+curso2.obtenerNombre());
        System.out.println("Horas -->"+curso2.obtenerHoras());
        
        System.out.println("-------------");
        
        System.out.println("Cursos creados --> "+Curso.verNumeroCursos());
    }
    
}
