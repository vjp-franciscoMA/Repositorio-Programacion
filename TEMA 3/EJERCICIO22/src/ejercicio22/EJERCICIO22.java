/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class EJERCICIO22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        
        Scanner entrada = new Scanner(System.in);
        try {
        System.out.println("Introduce un número");
        int numero1 = entrada.nextInt();
        System.out.println("Introduce otro número");
        int numero2 = entrada.nextInt();
        
        resultado = numero1 + numero2;
        System.out.println(resultado);
        }
        
        catch (InputMismatchException e) {
            System.out.println("No se pueden introducir letras.");
        }
    }
}