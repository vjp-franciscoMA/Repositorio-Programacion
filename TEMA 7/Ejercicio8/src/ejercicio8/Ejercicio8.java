/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio8 {
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un número entero de 5 cifras:");
        numero = entrada.nextInt();
        while (numero < 10000 || numero > 99999) {
            System.out.println("ERROR. El número tiene que ser de 5 cifras. Vuelve a intentarlo:");
            numero = entrada.nextInt();
        }
        return numero;
    }
    
    public static int[] dividirNumero(int numero) {
        int[] division = new int[5];
        int i;
        for(i = 0; i<division.length; i++) {
            division[i] = numero % 10;
            numero = numero / 10;
        }
        return division;
    }
    
    public static void mostrarNumero(int[] division) {
        int i;
        for(i = 0; i < division.length; i++) {
            System.out.println(division[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = pedirNumero();
        
        int[] division;
        division = dividirNumero(numero);
        mostrarNumero(division);
    }
    
}
