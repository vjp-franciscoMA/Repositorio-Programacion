/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioo3;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author fmont
 */
public class Ejercicioo3 {
    public  static int[] numerosAleatorios(int longitud){
        int[] numeros = new int[longitud];
        int i;
        for(i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 6) + 1;
        }
        return numeros;
    }
    
    public static void mostrarNumeros(int[] numeros) {
        int i;
        for(i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
    public static int elegirLongitud(){
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        do {
        System.out.println("Introduce la longitud entre 0 y 10 para el array:");
        try {
        longitud = entrada.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println(e);
            System.out.println("La longirud debe de ser un número entero.");
            entrada.next();
        }
        } while(longitud < 1 || longitud > 10);
        return longitud;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud;
        longitud = elegirLongitud();
        
        int[] numeros;
        numeros = numerosAleatorios(longitud);
        mostrarNumeros(numeros);
    }
    
}
