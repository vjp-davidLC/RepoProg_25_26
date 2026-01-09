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

    public void setAlias(String alias) {
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
    
    // métodos de la interfaz transformable
    @Override
    public String concatenarTodo() {

        String cadenaConcatenada = this.alias +"#"+this.apellidos+"#"+this.nombre;
        System.out.println(cadenaConcatenada);
        
        return cadenaConcatenada;
    }

    @Override
    public void obtenerCadenaMasLarga() {
        
        int longitudTitulo = this.alias.length();
        int longitudAutor = this.apellidos.length();
        int longitudGenero = this.nombre.length();
        
        if (longitudTitulo > longitudAutor && longitudTitulo > longitudGenero) {
            System.out.println("La cadena mas larga es: " +this.alias);
        }
        else if (longitudAutor > longitudTitulo && longitudAutor > longitudGenero) {
            System.out.println("La cadena mas larga es: " +this.apellidos);
        }
        else if (longitudGenero > longitudTitulo && longitudGenero > longitudAutor){
            System.out.println("La cadena mas larga es: " +this.nombre);
        }

    }

    @Override
    public void contarVocales() {
        int contador = 0;
        String cadena = concatenarTodo();
        
        
        for (int i = 0; i < cadena.length(); i++) {
            
            
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
                contador ++;
            }
            
        }
        System.out.println("Cantidad de vocales: " + contador);
        
    }

    @Override
    public void obtenerIniciales() {

        char primeraInicial = this.alias.charAt(0);
        char segundaInicial = this.apellidos.charAt(0);
        char terceraInicial = this.nombre.charAt(0);
        
        System.out.println(""+primeraInicial+segundaInicial+terceraInicial);
        
    }

    @Override
    public boolean buscarCadena(String cadena) {

        boolean acierto = false;
        
        if(cadena.equals(this.alias) || cadena.equals(this.apellidos) || cadena.equals(this.nombre)){
            acierto = true;
        }
        
        return acierto;
        
    }
    
}
