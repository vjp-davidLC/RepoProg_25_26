/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author David
 */
public class ProductoFresco extends Producto { // SUBCLASE de la superclase de Producto
    
    // atributos de la clase
    private int mesEnvasado;
    private int anhoEnvasado;
    private String paisOrigen;

    // constructor de la clase implementando los atributos de la SUPERCLASE Producto
    ProductoFresco(int mesCaducidad, int anhoCaducidad, int numeroLote) {
        super(mesCaducidad, anhoCaducidad, numeroLote);
    }
    
    // metodos get
    public void establecerMesEnvasado(int mesEnvasado) {
        this.mesEnvasado = mesEnvasado;
    }
    
    public void establecerAnhoEnvasado(int anhoEnvasado) {
        this.anhoEnvasado = anhoEnvasado;
    }
    
    public void establecerPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    // metodos set
    public int obtenerMesEnvasado() {
        return mesEnvasado;
    }
    
    public int obtenerAnhoEnvasado() {
        return anhoEnvasado;
    }
    
    public String obtenerPaisOrigen() {
        return paisOrigen;
    }
    
    // metodo que muestra la informacion de ProductoFresco MAS la informacion de la SUPERCLASE Producto
    public void mostrarInformacionProductoFresco() {
        
        System.out.println("-- Producto Fresco --");
        super.mostrarInformacionProducto();
        System.out.println("Fecha envasado -> MES "+mesEnvasado+" ANHO "+anhoEnvasado);
        System.out.println("Pais de origen -> "+paisOrigen);
        System.out.println("");
        
    }
    
    
    
}
