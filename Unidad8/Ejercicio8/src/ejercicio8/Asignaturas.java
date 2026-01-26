/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author David López 
 */
public class Asignaturas {
    
    private String nombre;
    private float nota;
    
    // constructores

    public Asignaturas() {
        this.nombre = "";
        this.nota = 0;
    }

    public Asignaturas(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    // consturtcor para solo introducir el nombre de la asignatura
    public Asignaturas(String nombre) {
        this.nombre = nombre;
    }
    
    // consturtcor para solo introducir la nota de la asignatura
    public Asignaturas(float nota) {
        this.nota = nota;
    }
    
    // métodos setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
    // métodos getters

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    // método mostrar
    @Override
    public String toString() {
        return "Asignatura: "+this.nombre+"\n"
                + "Nota: "+this.nota; 
    }
    
    
    
    
}
