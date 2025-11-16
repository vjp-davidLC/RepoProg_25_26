/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio16;

/**
 *
 * @author David López
 */
public class Alumno { // clase que recogerá los datos del alumno
    
    // Atributos de la clase
    private String nombre;
    private int nota;
    
    // constuctor que recogerá el nombre del alumnno por parametro
    Alumno(String nom) {
        nombre = nom;
    }
    
    // metodos set
    public void establecerNota(int nt) {
        nota = nt;
    }
    
    public void establecerNombre(String nom) {
        nombre = nom;
    }
    
    // metodos get
    public int obtenerNota() {
        return nota;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    // metodo que muestra la calificacion de la nota
    public void obtenerCalificacion(int nota) {
    
        if (nota < 0 || nota > 10) {
            System.out.println("Error: nota invalida.");
        }
        else if (nota <= 4){
            System.out.println("Suspenso");
        }
        else if (nota <= 6) {
            System.out.println("Bien");
        }
        else if (nota <= 8) {
            System.out.println("Notable");
        }
        else {
            System.out.println("Sobresaliente");
        }
    }
    
    
}
