/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {
    public static int[] numeros() {
        int[] numeros = new int[10];
        int i;
        for(i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * (9 - 0 + 1) + 0);
        }
        return numeros;
    }
    
    public static void visualizarNumeros(int[] numeros) {
        int i;
        for(i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }
    }
    
    public static void ordenarNumeros(int[] numeros) {
        int aux;
        int i, j;
        for(i = 0; i < numeros.length; i++) {
            for(j = 0; j < numeros.length - 1; j++) {
                if(numeros[j] > numeros[j + 1]) {
                aux = numeros[j];
                numeros[j] = numeros[j + 1];
                numeros[j + 1] = aux;
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = numeros();
        visualizarNumeros(numeros);
        ordenarNumeros(numeros);
        System.out.println("");
        visualizarNumeros(numeros);
    }
    
}
