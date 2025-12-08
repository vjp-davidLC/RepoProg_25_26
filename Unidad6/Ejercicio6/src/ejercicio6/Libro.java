/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author David
 */
public class Libro implements Transformable{
    
    // Atributos
    private String titulo;
    private String autor;
    private String genero;

    // Consturctores
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.genero = "";
    }

    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    // métodos setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //Métodos getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    // método toStirng
    @Override
    public String toString() {
        return "Título: "+this.titulo+"\n"
                + "Autor. "+this.autor+"\n"
                + "Genero: "+this.genero;
    }
    
    // métodos de la interfaz transformable
    @Override
    public String concatenarTodo() {

        String cadenaConcatenada = this.titulo +"#"+this.autor+"#"+this.genero;
        System.out.println(cadenaConcatenada);
        
        return cadenaConcatenada;
    }

    @Override
    public void obtenerCadenaMasLarga() {
        
        int longitudTitulo = this.titulo.length();
        int longitudAutor = this.autor.length();
        int longitudGenero = this.genero.length();
        
        if (longitudTitulo > longitudAutor && longitudTitulo > longitudGenero) {
            System.out.println("La cadena mas larga es: " +this.titulo);
        }
        else if (longitudAutor > longitudTitulo && longitudAutor > longitudGenero) {
            System.out.println("La cadena mas larga es: " +this.autor);
        }
        else if (longitudGenero > longitudTitulo && longitudGenero > longitudAutor){
            System.out.println("La cadena mas larga es: " +this.genero);
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

        char primeraInicial = this.titulo.charAt(0);
        char segundaInicial = this.autor.charAt(0);
        char terceraInicial = this.genero.charAt(0);
        
        System.out.println(""+primeraInicial+segundaInicial+terceraInicial);
        
    }

    @Override
    public boolean buscarCadena(String cadena) {

        boolean acierto = false;
        
        if(cadena.equals(this.titulo) || cadena.equals(this.genero) || cadena.equals(this.autor)){
            acierto = true;
        }
        
        return acierto;
        
    }
    
    
    
    
}
