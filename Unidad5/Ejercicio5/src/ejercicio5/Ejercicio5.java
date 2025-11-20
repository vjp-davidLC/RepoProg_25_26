/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author David
 */
public class Ejercicio5 { // TEST

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Asignatura PROG = new Asignatura("Programacion");
        Asignatura LMSGI = new Asignatura("Lenguajes de Marcas");
        Asignatura BD = new Asignatura("Base de Datos");
        Asignatura ED = new Asignatura("Entornos de Desarrollo");
        Asignatura SI = new Asignatura("Sistemas Informaticos");
        Asignatura FOL = new Asignatura("Formacion y Orientacion Laboral");
        
        PROG.establecerNota(6.5);
        LMSGI.establecerNota(7.5);
        BD.establecerNota(7.5);
        ED.establecerNota(8);
        SI.establecerNota(6.5);
        FOL.establecerNota(6);
        
        System.out.println("Por favor, introduzca la nota de "+PROG.obtenerNombre()+ " : "+PROG.obtenerNota());
        System.out.println("Introduzca la nota de "+LMSGI.obtenerNombre()+ " : "+LMSGI.obtenerNota());
        System.out.println("Introduzca la nota de "+BD.obtenerNombre()+ " : "+BD.obtenerNota());
        System.out.println("Introduzca la nota de "+ED.obtenerNombre()+ " : "+ED.obtenerNota());
        System.out.println("Introduzca la nota de "+SI.obtenerNombre()+ " : "+SI.obtenerNota());
        System.out.println("Por ultimo , introduzca la nota de "+FOL.obtenerNombre()+ " : "+FOL.obtenerNota());
        
        double media = Asignatura.calcularNotaMedia(PROG.obtenerNota(), LMSGI.obtenerNota(), BD.obtenerNota(), ED.obtenerNota(), SI.obtenerNota(), FOL.obtenerNota());
        
        System.out.println("Su nota media del curso es de : "+media);
        
    }
    
}
