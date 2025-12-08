/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author David
 */
public class Persona implements Transformable{
    
    // Atributos
    private String nombre;
    private String apellidos;
    private String alias;

    // Consturctores
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.alias = "";
    }

    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }
    
    // métodos setters

    public void setTitulo(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAlias(String genero) {
        this.alias = alias;
    }
    
    //Métodos getters

    public String getnombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getAlias() {
        return alias;
    }

    // método toStirng
    @Override
    public String toString() {
        return "Nombre: "+this.nombre+"\n"
                + "Apellidos: "+this.apellidos+"\n"
                + "Alias: "+this.alias;
    }
    
}
