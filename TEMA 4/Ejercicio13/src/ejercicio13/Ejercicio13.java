/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {
    public static int PedirNumero() { //Método para pedir un número al usuario
        Scanner entrada = new Scanner(System.in); //Scanner para leer el número
        System.out.println("Por favor, introduzca un número:"); //Imprimo un mensaje para que el usuario introduzca un número
        int num = entrada.nextInt(); //Pido el número al usuario
        return num; //Devuelvo el número
    }
    public static void Resultado(int num) {
        int i;
        System.out.println("Los números que hay entre 1 y "+num+" son:");
        for (i = 1; i <= num; i++) {
            System.out.println(i);
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
