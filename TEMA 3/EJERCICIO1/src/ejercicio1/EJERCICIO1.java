/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner; //Importo la clase Scanner para poder leer lo que escriba el usuario
/**
 *
 * @author alumno
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //Creo el objeto Scanner para leer datos desde el teclado
        System.out.println("Por favor, introduzca un número:"); //Muestro un mensaje para pedir un número
        int numero = entrada.nextInt(); //Guardo el número que escribe el usuario
        
        //Compruebo si el número es positivo o negativo
        if (numero >= 0) { //Si el número es mayor o igual a 0, es positivo
            System.out.println("El número introducido es positivo.");
        }
        
        else { // Si el número es menor que 0, es negativo
            System.out.println("El número introducido es negativo.");
        }
    }      
}
