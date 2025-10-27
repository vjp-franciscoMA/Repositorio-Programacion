/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author fmont
 */
public class Ejercicio7 {
    public static void Orden(int numero1, int numero2, int numero3, int numero4) { //Creo el método para ordenar los números
        int menor = numero1; //Creo la variable menor y hago la suposición de que el numero 1 es el más pequeño
        if (numero2 < menor) { //Si el segundo número es menor que el actual menor, lo actualizamos
            menor = numero2;
        }
        if (numero3 < menor) { //Si el tercer número es menor que el actual menor, lo actualizamos
            menor = numero3;
        }
        if (numero4 < menor) { //Si el cuarto número es menor que el actual menor, lo actualizamos
            menor = numero4;
        }
        
        int mayor = numero1; //Creo la variable mayor y hago la suposición de que el numero 1 es el más grande
        if (numero2 >  mayor) { //Si el segundo número es mayor que el actual mayor, lo actualizamos
            mayor = numero2;
        }
        if (numero3 > mayor) { //Si el tercer número es mayor que el actual mayor, lo actualizamos
            mayor = numero3;
        }
        if (numero4 > mayor) { //Si el cuarto número es mayor que el actual mayor, lo actualizamos
            mayor = numero4;
        }
        
        //Ahora averiguaré los dos números del medio creando dos variables
        int medio1 = 0, medio2 = 0;
        
        //Asigno el primer número del medio, que no sea ni menor ni mayor
        if (numero1 != menor && numero1 != mayor) {
            medio1 = numero1;
        } 
        else if (numero2 != menor && numero2 != mayor) {
            medio1 = numero2;
        } 
        else if (numero3 != menor && numero3 != mayor) {
            medio1 = numero3;
        } 
        else {
            medio1 = numero4;
        }
        
        //Asigno el segundo número del medio, que no sea ni menor, ni mayor, ni el primer medio
        if (numero1 != menor && numero1 != mayor && numero1 != medio1) {
            medio2 = numero1;
        } 
        else if (numero2 != menor && numero2 != mayor && numero2 != medio1) {
            medio2 = numero2;
        } 
        else if (numero3 != menor && numero3 != mayor && numero3 != medio1) {
            medio2 = numero3;
        } 
        else {
            medio2 = numero4;
        }
        
        //Me aseguro de que medio1 sea menor que medio2 creando una variable temporal
        if (medio1 > medio2) {
            int temp = medio1;
            medio1 = medio2;
            medio2 = temp;
        }
        
        //Resultado
        System.out.println("El orden de los números introducidos es el "+menor+" - "+medio1+" - "+medio2+" - "+mayor+"");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //Creo el objeto Scanner para leer datos desde el teclado
        System.out.println("Por favor, introduzca el primer número:"); //Muestro un mensaje para pedir el primer número
        int numero1 = entrada.nextInt(); //Guardo el primer número que escribe el usuario
        System.out.println("Ahora, introduzca un segundo número:"); //Muestro otro mensaje para pedir el segundo número
        int numero2 = entrada.nextInt(); //Guardo el segundo número que escribe el usuario
        System.out.println("Introduzca el tercer número:"); //Muestro otro mensaje para pedir el tercer número
        int numero3 = entrada.nextInt(); //Guardo el tercer número que escribe el usuario
        System.out.println("Por último, introduzca un cuarto número:"); //Muestro otro mensaje para pedir el cuarto número
        int numero4 = entrada.nextInt(); //Guardo el cuarto número que escribe el usuario
        Orden(numero1, numero2, numero3, numero4); //Llamo al método
    }
    
}
