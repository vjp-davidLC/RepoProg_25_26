/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author David López
 */
public class test { // clase que comprobaremos el uso de los objetos

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creamos los objetos insertando por parametro los datos de la clase PRODUCTO
        ProductoCongelado producto1 = new ProductoCongelado(10, 2027, 1332);
        ProductoFresco producto2 = new ProductoFresco(12, 2025, 77732);
        ProductoRefigerado producto3 = new ProductoRefigerado(1, 2026, 9653);
        
        // establecemos los datos por parametros en los metodos set de cada clase con su respectivo objeto
        producto1.establecerTemperaturaCongelacion(-26);
        
        producto2.establecerMesEnvasado(11);
        producto2.establecerAnhoEnvasado(2026);
        producto2.establecerPaisOrigen("Francia");
        
        producto3.establecerCodigoOrganismo(10001);
        
        // ejecutamos los metodos para mostrar la informacion 
        producto1.mostrarInformacionProductoCongelado();
        
        producto2.mostrarInformacionProductoFresco();
        
        producto3.mostrarInformacionProductoRefigerado();
        
    }
    
}
