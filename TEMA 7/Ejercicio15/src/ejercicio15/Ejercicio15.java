/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio15 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("INTRODUCE UNA DE LAS SIGUIENTES OPCIONES:");
        System.out.println("1. Rellenar array de 12 posiciones con las ventas de coches mensuales.");
        System.out.println("2. Mostrar array(ventas).");
        System.out.println("3. Mostrar array(ventas) al revés.");
        System.out.println("4. Mostrar suma total de ventas de los meses.");
        System.out.println("5. Mostrar suma total de ventas de los meses pares.");
        System.out.println("6. Mostrar el nombre del mes con más ventas.");
        System.out.println("7. Salir.");
        opcion = entrada.nextInt();
        return opcion;
    }
    
    public static int[] rellenarArray() {
        int[] array = new int[12];
        int i;
        for(i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (100 - 10 + 1) + 10);
        }
        return array;
    }
    
    public static void mostrarArray(int[] array) {
        int i;
        for(i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void mostrarArrayAlReves(int[] array) {
        int i;
        for(i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    
    public static void mostrarSumaArray(int[] array) {
        int suma = 0;
        int i;
        for(i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        System.out.println(suma);
    }
    
    public static void mostrarSumaPar(int[] array) {
        int suma = 0;
        int i;
        for(i = 1; i < array.length; i = i + 2) {
            suma = suma + array[i];
        }
        System.out.println(suma);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int[] array = new int[12];
        do {
        opcion = menu();
        switch(opcion) {
            case 1:
                array = rellenarArray();
                break;
            case 2:
                mostrarArray(array);
                break;
            case 3:
                mostrarArrayAlReves(array);
                break;
            case 4:
                mostrarSumaArray(array);
                break;
            case 5:
                mostrarSumaPar(array);
                break;
            
        }
        } while(opcion != 7);
    }
    
}
