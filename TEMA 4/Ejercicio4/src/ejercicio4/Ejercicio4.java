/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author fmont
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número:");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número:");
        int num2 = entrada.nextInt();
        System.out.println("Por último, introduzca un tercer número:");
        int num3 = entrada.nextInt();
        Menor.Menor(num1, num2, num3);
    }
    
}
