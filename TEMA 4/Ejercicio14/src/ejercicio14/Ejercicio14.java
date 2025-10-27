/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author fmont
 */
public class Ejercicio14 {
    public static int PedirNumero() { //Método para pedir un número al usuario
        Scanner entrada = new Scanner(System.in); //Scanner para leer el número
        System.out.println("Por favor, introduzca un número:"); //Imprimo un mensaje para que el usuario introduzca un número
        int num = entrada.nextInt(); //Pido el número al usuario
        return num; //Devuelvo el número
    }
    public static int NumeroCorrecto(int num) { //Método para validar que el número sea mayor que 0
        Scanner entrada = new Scanner(System.in); //Scanner para leer el número
        while (num <= 0) { //Mientras el numero sea menor o igual a 0
            System.out.println("El número tiene que ser mayor a 0"); //Imprimo un mensaje avisando al usuario de que el número tiene que ser mayor que 0
            num = entrada.nextInt(); //Vuelvo a pedir el número al usuario
        }
        return num; //Devuelvo el número
    }
    public static void Multiplos(int num) { //Método para calcular y mostrar los múltiplos de 3
        int contador = 0; //Inicio el contador en 0
        int i; //Creo la variable para el bucle
        System.out.println("Los múltiplos de 3 entre 1 y "+num+" son:"); //Imprimo un mensaje
        for (i = 1; i <= num; i++) { //Bucle desde 1 hasta el número introducido
            if (i % 3 == 0) { //Si es divisible entre 3
                System.out.println(i); //Muestro los múltiplos por pantalla
                contador++; //Sumo el contador
            }
        }
        System.out.println("El número total que hay de múltiplos de 3 es: "+contador+""); //Muestro el número total de múltiplos
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; //Variable para guardar el número del usuario
        num = PedirNumero(); //Llamo al método para pedir un número al usuario
        num = NumeroCorrecto(num); //Llamo al método para que el número introducido sea válido
        Multiplos(num); //Llamo al método para calcular y mostrar los múltiplos de 3
    }
    
}
