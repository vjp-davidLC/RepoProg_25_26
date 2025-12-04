/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author David
 */
public abstract class Canidos extends Animal{
    
    // Constructores
    // constructor por defecto
    public Canidos() {
        super("", 0, 0);
    }
    // Constructor parametrizado
    public Canidos(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    // no implementamos los metodos del padre abstractos ya que en esta clase no se utilizaran
    
    // metodo toString(mostrar)
    @Override
    public String toString() {
        return "- Canido -"+super.toString();
    }
    
}
