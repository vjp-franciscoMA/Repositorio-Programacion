/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {
    public static int[] numeros() {
        int[] numeros = new int[10];
        int i;
        for(i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * (8 - 1 + 1) + 1);
        }
        return numeros;
    }

    public static void mostrarNumeros(int[] numeros) {
        int i;
        for(i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }
    }
    
    public static void encontrarNumeroRepetidoYSustituirlo(int[] numeros) {
        int repetido = numeros[0];
        int i;
        for(i = 0; i < numeros.length; i++) {
            if(numeros[i] == repetido) {
                numeros[i] = 0;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = numeros();
        mostrarNumeros(numeros);
        encontrarNumeroRepetidoYSustituirlo(numeros);
        mostrarNumeros(numeros);
    }
    
}
