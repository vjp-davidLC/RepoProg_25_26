/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author David
 */
public class ProductoRefigerado extends Producto{ // SUBCLASE de la superclase de Producto
    
    // atributos de la clase
    private int codigoOrganismo;
    
    // constructor de la clase implementando los atributos de la SUPERCLASE Producto
    ProductoRefigerado(int mesCaducidad, int anhoCaducidad, int numeroLote) {
        super(mesCaducidad, anhoCaducidad, numeroLote);
    }
    
    // metodo get
    public void establecerCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }
    // metodos set
    public int obtenerCodigoOrganismo() {
        return codigoOrganismo;
    }
    
    // metodo que muestra la informacion de Producto Refigerado MAS la informacion de la SUPERCLASE Producto
    public void mostrarInformacionProductoRefigerado() {
    
        System.out.println("-- Producto Refigerado --");
        super.mostrarInformacionProducto();
        System.out.println("Codigo del organismo de supervision alimentaria -> "+codigoOrganismo);
        System.out.println("");
        
    }

}
