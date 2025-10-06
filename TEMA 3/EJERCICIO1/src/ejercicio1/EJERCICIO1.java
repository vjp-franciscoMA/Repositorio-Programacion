/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un número:");
        int numero = entrada.nextInt();
        
        if (numero >= 0) {
            System.out.println("El número introducido es positivo.");
        }
        
        else {
            System.out.println("El número introducido es negativo.");
        }
    }   
    
    
}
