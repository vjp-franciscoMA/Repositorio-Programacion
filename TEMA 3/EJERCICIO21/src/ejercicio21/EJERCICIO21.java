/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EJERCICIO21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número (dividendo)");
        int numero1 = entrada.nextInt();
        System.out.println("Introduce otro número (divisor)");
        int numero2 = entrada.nextInt();
        
        try {
            resultado = numero1 / numero2;
            System.out.println(resultado);
        }
        
        catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }
        
    }
    
}
