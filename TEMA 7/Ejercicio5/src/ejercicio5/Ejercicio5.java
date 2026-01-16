/*+
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio5 {
    public static int[][] numeros() {
        Scanner entrada = new Scanner(System.in);
        int[][] numeros = new int[4][2];
        int i, j;
        for(i = 0; i < numeros.length; i++) {
            System.out.println("Introduce los valores de la fila "+(i+1)+"");
            for(j = 0; j < numeros[0].length; j++) {
                System.out.println("Numero "+(j+1)+"");
                numeros[i][j] = entrada.nextInt();
            }
        }
        return numeros;
    }
    
    public static void mostrarNumeros(int[][] numeros) {
        int i, j;
        for(i = 0; i < numeros.length; i++) {
            for(j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j] + "");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarNumeroMayor(int[][] numeros) {
        int mayor = numeros[0][0];
        int i, j;
        for(i = 0; i < numeros.length; i++) {
            for(j = 0; j < numeros[0].length; j++) {
                if (numeros[i][j] > mayor) {
                    mayor = numeros[i][j];
                }
            }
        }
        System.out.println("El número mayor es: "+mayor+"");
    }
    
    public static void mostrarNumeroMenor(int[][] numeros) {
        int menor = numeros[0][0];
        int i, j;
        for(i = 0; i < numeros.length; i++) {
            for(j = 0; j < numeros[0].length; j++) {
                if (numeros[i][j] < menor) {
                    menor = numeros[i][j];
                }
            }
        }
        System.out.println("El número menor es: "+menor+"");
    }
    
    public static void mostrarSuma(int[][] numeros){
        int suma = 0;
        int i, j;
        for(i = 0; i < numeros.length; i++) {
            for(j = 0; j < numeros[0].length; j++) {
                suma = suma + numeros[i][j];
            }
        }
        System.out.println("La suma de todos los valores es de: "+suma+"");
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] numeros;
        numeros = numeros();
        mostrarNumeros(numeros);
        mostrarNumeroMayor(numeros);
        mostrarNumeroMenor(numeros);
        mostrarSuma(numeros);
    }
    
}
