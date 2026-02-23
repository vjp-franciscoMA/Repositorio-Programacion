/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio3 {
    public static ArrayList<Integer> rellenarNumeros() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String respuesta;
        do {
            System.out.println("Introduce un número entero");  
            int num = entrada.nextInt();
            entrada.nextLine();
            numeros.add(num);
            System.out.println("¿Quieres introducir otro número? (Si/No)");
            respuesta = entrada.nextLine();
        } while(respuesta.equalsIgnoreCase("Si"));
        
        return numeros;
    }
    
    public static void mostrarNumeros(ArrayList<Integer> numeros) {
        for(int i = 0; i < numeros.size(); i++) {
            System.out.println("Numero "+(i+1)+"");
            System.out.println(numeros.get(i));
        }
    }
    
    public static void intercambiarNumeros(ArrayList<Integer> numeros) {
        if(numeros.size() >= 4) {
            int temp = numeros.get(1);
            numeros.set(1, numeros.get(3));
            numeros.set(3, temp);
        } else {
            System.out.println("No hay suficientes números para intercmbiar las posiciones.");
        }
        for(int i = 0; i < numeros.size(); i++) {
            System.out.println("Numero "+(i+1)+"");
            System.out.println(numeros.get(i));
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = rellenarNumeros();
        mostrarNumeros(numeros);
        intercambiarNumeros(numeros);
    }
    
}
