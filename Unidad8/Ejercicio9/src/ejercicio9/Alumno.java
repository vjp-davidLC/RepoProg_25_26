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
        this.notas = new Asignatura[4];
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
    @Override
    public String toString() {
        return "\nNombre del Alumno: "+this.nombreAlumbo
                +"\n Notas: "+this.notas;
    }
    
    
    
}
