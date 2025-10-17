/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EJERCICIO15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número para calcular su tabla de multiplicar:");
        int numero = entrada.nextInt();
        for (i=0;i<=10;i++) {
            System.out.println(""+numero+" x "+i+" = "+numero*i+"");
        }
    }
    
}
