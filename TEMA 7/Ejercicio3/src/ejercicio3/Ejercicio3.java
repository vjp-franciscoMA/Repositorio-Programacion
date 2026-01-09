/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {
    public static int[] numerosAleatorios() {
        int[] numeros = new int[6];
        int i;
        for(i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*6); 
        }
        return numeros;
    }
    
    public static void mostrarNumeros(int[] numeros) {
        int i;
        for(i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros;
        numeros = numerosAleatorios();
        mostrarNumeros(numeros);
    }
    
}
