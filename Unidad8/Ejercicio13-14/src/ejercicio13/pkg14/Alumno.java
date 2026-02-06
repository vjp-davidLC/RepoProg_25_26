/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13.pkg14;

/**
 *
 * @author David López
 */
public class Alumno {
    // atributos
    private String nombre;
    private int edad;
    private float notaMedia;
    
    // constructores

    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0f;
    }

    public Alumno(String nombre, int edad, float notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    // métodos setters

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    // métodos getters

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    // método mostrar
    public void mostrar() {
    
        System.out.println("Nombre: "+this.nombre+"\n"
                + "Edad: "+this.edad+"\n"
                + "Nota media: "+this.notaMedia+"\n");
    
    }
    
    
    
}
