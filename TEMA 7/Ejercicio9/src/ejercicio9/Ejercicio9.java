/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio9 {
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número de 5 cifras:");
        int numero = entrada.nextInt();
        return numero;
    }
    
    public static int calcularCifrasNumero(int numero) {
        int cifras;
        cifras = String.valueOf(numero).length();
        return cifras;
    }
    
    public static int[] dividirCifras(int numero, int cifras) {
        int[] array = new int[cifras];
        int i;
        for(i = 0; i < array.length; i++) {
            array[i] = numero % 10;
            numero = numero / 10;
        }
        return array;
    }
    
    public static void mostrarArray(int[] array) {
        int i;
        for(i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        int calculo = calcularCifrasNumero(numero);
        int[] dividir = dividirCifras(numero, calculo);
        mostrarArray(dividir);
    }
    
}
