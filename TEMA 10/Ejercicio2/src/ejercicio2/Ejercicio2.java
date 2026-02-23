/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio2 {
    public static ArrayList<Integer> rellenarValores() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        int numero;

        do {
            System.out.println("Introduce números positivos (negativo para terminar):");
            numero = entrada.nextInt();
            entrada.nextLine();

            if (numero >= 0) {      
                valores.add(numero);
            }

        } while (numero >= 0);

        return valores;
    }
    
    public static void mostrarValores(ArrayList<Integer> valores) {
        for (int i = 0; i < valores.size(); i++) {
            System.out.println("Numero "+(i+1)+"");
            System.out.println(valores.get(i));
        }
    }
    
    public static void mostrarValorMayor(ArrayList<Integer> valores) {
        int mayor = valores.get(0);
        for(int i = 0; i < valores.size(); i++) {
            if(valores.get(i) > mayor) {
                mayor = valores.get(i);
            }
        }
        System.out.println("El número mayor es: "+mayor+"");
    }
    
    public static void mostrarValorMenor(ArrayList<Integer> valores) {
        int menor = valores.get(0);
        for(int i = 0; i < valores.size(); i++) {
            if(valores.get(i) < menor) {
                menor = valores.get(i);
            }
        }
        System.out.println("El número menor es: "+menor+"");
    }
    
    public static void mostrarSumaValores(ArrayList<Integer> valores) {
        int suma = 0;
        for(int i = 0; i < valores.size(); i++) {
            suma = suma + valores.get(i);
        }
        System.out.println("La suma de todos los número es de: "+suma+"");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> valores = rellenarValores();
        mostrarValores(valores);
        mostrarValorMayor(valores);
        mostrarValorMenor(valores);
        mostrarSumaValores(valores);
    }
    
}
