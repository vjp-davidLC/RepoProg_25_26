/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author alumno
 */
class Asignatura {
    
    private String nombreAsignatura;
    private float nota;
    
    // constructores

    public Asignatura() {
        this.nombreAsignatura = "";
        this.nota = 0;
    }

    public Asignatura(String nombreAsignatura, float nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }
    
    // métodos setters
    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    // métodos getters
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public float getNota() {
        return nota;
    }
    
    // método mostrar
    @Override
    public String toString() {
        return "\nAsignatura: "+this.nombreAsignatura
                + "\nNota: "+this.nota;
    }
    
    
    
}
