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
public class Ejercicio1 {
    public static int[] pedirNumeros() {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int i;
        for (i = 0; i < numeros.length; i++) {
            System.out.println("Por favor, introduzca el número "+(i+1)+":");
            numeros[i] = entrada.nextInt();
        }  
        return numeros;
    }
    
    public static void mostrarNumerosPares(int[] numeros){
        int i;
        for(i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros;
        numeros = pedirNumeros();
        mostrarNumerosPares(numeros);
    }
    
}
