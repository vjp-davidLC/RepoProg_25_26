/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Dia[] mes = new Dia[30]; // array bidimensional 4x7
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        boolean salir = false; //  // booleano que controlará la salida del programa
        int opcion; // variable que recogerá la opcion dsel usuario
        
        do {            
            mostrarMenu();
            System.out.println("Inserte una opcion: ");
            opcion = entrada.nextInt(); // recogemos la opcion del usuario
            
             // swicth que seleccionará el método según lo que ek usuario haya elegido
            switch (opcion) {
                case 1:
                    rellenarArray(mes, diasSemana); // llamada al método
                    break; 
                case 2:
                    mostrarArray(mes, diasSemana); // llamada al método
                    break;
                case 3:
                    System.out.println("\nLa temperatura media del mes es de -- "+mediaTempMes(mes)+" grados --");
                    break;
                case 4:
                    diaMasCaluroso(mes); // llamada al método
                    break;       
                case 5:
                    System.out.println("Saliendo del programa...\n");
                    salir = true; // sale del programa
                    break;
                // si el usuario no inserta un numero del 1-5 sldrá el siguiente mensaje    
                default:
                    System.out.println("Tiene que insertar una opcion del 1-5.\n");
            }
            
        } while (!salir);

    }
    
    public static void mostrarMenu() {
    
        System.out.println("\n--- Temperatura de Abril ---");
        System.out.println("1. Rellenar las temperaturas de forma aleatoria.");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar las temperaturas media del mes.");
        System.out.println("4. Dia o dias mas calurosos del mes.");
        System.out.println("5. Salir del programa.\n");
        
    }
    
    // método que rellena el array creando y asignando los valores a los atributos de la clase dia
    public static void rellenarArray(Dia[] mes, String[] diasSemana) {
        int temperatura; // variable que recogerá un valor aleatorio para asiganrlo como temperatura al atributo
        int indiceDiaSemana = (int)(Math.random() * 7);  // variable que recogerá un valor aleatorio para saber una posicion aleatoria m
        String diaSemana; // variable que recogerá el nombre de la semana
        
        // recorremos todos los indices del array y le asignamos en cada posicion un valor aleatorio
        for (int i = 0; i < mes.length; i++) {
            
            temperatura = (int) (Math.random()*41); // asignamos un valor aleatorio entre el 0-40
            diaSemana = diasSemana[indiceDiaSemana]; // recogemos el nombre del dia de la semana que será por donde empezará el orden de la semana
            
            mes[i] = new Dia(diaSemana, temperatura); // creaamos tantos objetos para el array
            
            indiceDiaSemana++; // incrementamos el indice de la semana
            
            if (indiceDiaSemana > 6) { // si el indice es mayor que 6 se reiniciará el array de dias de la semana a 0
                indiceDiaSemana = 0;
            } 


        }
        
        System.out.println("\n Temperaturas aleatorias puestas en cada dia del mes!!!");
    
    }
    
    // método que muestra el contenido del array
    public static void mostrarArray(Dia[] mes, String[] diasSemana) {
    
        for (int i = 0; i < mes.length; i++) {
            //System.out.println(mes[i].getNombre()+" dia "+(i+1)+": "+mes[i].getTemperatura()+" grados.");
            System.out.println("Dia: "+(i+1)+"\n"+mes[i].toString());
        }
    
    }
    
    // método que calcula cual es la media de temperatura del mes
    public static float mediaTempMes(Dia[] mes) {
    
        float mediaTem; // variable que nos devolverá la media total
        float sumTemp = 0; // variable que recogerá suma total de las temperaturas del mes
        
        for (int i = 0; i < mes.length; i++) {
                
                sumTemp += (float) mes[i].getTemperatura(); // guardamos la suma total de los grados en una variable
        }
    
        mediaTem = sumTemp / 28; // dividimos la suma total entre los dias del mes
        
        return mediaTem; // devuelve la media
        
    }
    
    // método que muestra el/los dia/dias con la temperatura mas alta
    public static  void diaMasCaluroso(Dia[] mes) {
    
        int tempMax = 0; // variable que  recogerá la temperatura más alta del array
        
        System.out.println("\nEl dia o dias mas calurosos fueron: \n");
        
        // recorremos todo el array
        for (int i = 0; i < mes.length; i++) {
            
            if (mes[i].getTemperatura() > tempMax) { // si la temperatura es más alta que la guardada
                tempMax = mes[i].getTemperatura(); // actualizamos si encontramos un valor mayor
                
            }
  
        }
        
        // volvemos a recorrer el array para mostrar el dia y su temperatura
        for (int i = 0; i < mes.length; i++) {
            
            if (tempMax == mes[i].getTemperatura() ) { // si la temperatura maxima gurada en el bucle anterior es la misma que algunas que haya en el array
                System.out.println("El "+mes[i].getNombre()+" dia "+(i+1)+" con "+tempMax+" grados."); // mostramos con dicho indice [i] el nombre del dia y la temMax
                
            }
  
        }
        
        
    }
    
}
