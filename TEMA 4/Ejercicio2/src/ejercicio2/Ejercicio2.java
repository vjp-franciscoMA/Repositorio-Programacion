/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author fmont
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número:");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número:");
        int num2 = entrada.nextInt();
        if (num1 > 10) {
            resultado = Multiplicar.Multiplicar(num1, num2);
            System.out.println("La operación que se realizó es producto y el resultado es "+resultado+"");
        }
        else {
            resultado = Suma.Suma(num1, num2);
            System.out.println("La operación que se realizó es suma y el resultado es "+resultado+"");
        }
    }
    
}
