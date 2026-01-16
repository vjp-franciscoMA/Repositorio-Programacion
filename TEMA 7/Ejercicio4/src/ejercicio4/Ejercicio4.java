/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {
    public static int[][] numerosAleatorios() {
        int[][] numeros = new int[4][3];
        int i, j;
        for(i = 0; i < numeros.length; i++) {
            for(j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (int)(Math.random() * (200 - 100 + 1)) + 100;
            }
        }
        return numeros;
    }
    
    public static void mostrarNumerosPares(int[][] numeros) {
        int i, j;
        for(i = 0; i < numeros.length; i++) {
            System.out.println("Fila "+(i+1)+"");
            for(j = 0; j < numeros[0].length; j++) {
                if(numeros[i][j] % 2 == 0) {
                    System.out.println(numeros[i][j]);
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] numeros;
        numeros = numerosAleatorios();
        mostrarNumerosPares(numeros);
    }
}
