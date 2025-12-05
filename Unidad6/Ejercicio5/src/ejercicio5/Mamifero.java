/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author David
 */
public class Mamifero {
    
    // Atributos
    private String nombre;
    private String sexo;
    private String color;
    private int edad;
    
    // Constructores
    public Mamifero() {
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
    }

    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
    
    // métodos setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // métodos getters
    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+"\n"
                + "Sexo: "+this.sexo+"\n"
                + "Color: "+this.color+"\n"
                + "Edad: "+this.edad;
    }
    
    
    
}
