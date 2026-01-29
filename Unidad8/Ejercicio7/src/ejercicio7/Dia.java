/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author David López
 */
public class Dia {
    
    // atributos
    private String nombre;
    private int temperatura;
    
    // constructores
    public Dia() {
        this.nombre = "";
        this.temperatura = 0;
    }

    public Dia(String nombre, int temperatura) {
        this.nombre = nombre;
        this.temperatura = temperatura;
    }

    // métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    // métodos getters
    public String getNombre() {
        return nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    // método mostrar
    @Override
    public String toString() {
        return "Dia: "+this.nombre+
                "Temperatura: "+this.temperatura;
    }
    
    
}
