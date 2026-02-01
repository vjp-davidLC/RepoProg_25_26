/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    private String nombreAlumbo;
    private Asignatura[] notas;
    
    // constructores
    public Alumno() {
        this.nombreAlumbo = nombreAlumbo;
        this.notas = new Asignatura[4]; // por defecto tendrá 4 asignaturas
    }

    public Alumno(String nombreAlumbo, Asignatura[] notas) {
        this.nombreAlumbo = nombreAlumbo;
        this.notas = notas;
    }
    
    // métodos setters

    public void setNombreAlumbo(String nombreAlumbo) {
        this.nombreAlumbo = nombreAlumbo;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }
    
    // métodos getters

    public String getNombreAlumbo() {
        return nombreAlumbo;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    // método mostrar
    public void mostrar(){
        
        System.out.println("Nombre del Alumno: " + this.nombreAlumbo);
        System.out.println("Notas:");
        
         for (int i = 0; i < notas.length; i++) {
            if (notas[i] != null) { // por si aún no se ha creado la asignatura
                System.out.println("  " + notas[i].getNombreAsignatura() + ": " + notas[i].getNota());
            }
        }
        System.out.println(); 
    }
    
    // método que muestra la media de cada alumno
    public float notaMedia(){
    
        float notaMedia;
        float suma = 0 ;
        
        for (int i = 0; i < this.notas.length; i++) {
            
            suma += notas[i].getNota();
            
        }
        
        notaMedia = suma / this.notas.length;
        
        return notaMedia;
    }
    
    // método que cuenta los suspensos
    public int totalSuspensos() {
        int contadorSuspens = 0;
    
        for (int i = 0; i < this.notas.length; i++) {
            
            if (notas[i].getNota() < 5) {
                contadorSuspens++;
            }
            
        }
        
        return contadorSuspens;
    }
    
    
}
