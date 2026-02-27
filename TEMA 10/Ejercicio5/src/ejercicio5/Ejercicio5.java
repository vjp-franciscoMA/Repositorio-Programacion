/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author alumno
 */
public class Ejercicio5 {
    public static ArrayList<Integer> lista() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
        System.out.println("Introduce la cantidad de numeros que quieres tener en la lista:");
        int numero = entrada.nextInt();
        entrada.nextLine();
        
        for(int i = 0; i < numero; i++) {
            System.out.println("Introduce el número "+(i+1)+"");
            int num = entrada.nextInt();
            entrada.nextLine();
            
            lista.add(num);
        }
        
        return lista;
    }
    
    public static void mostrarLista(ArrayList<Integer> lista) {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    
    public static int mayorPar(ArrayList<Integer> lista) {
        int mayor = lista.get(0);
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i) > mayor && lista.get(i) % 2 == 0) {
                mayor = lista.get(i);
            }
        }
        System.out.println("Número mayor: "+mayor+"");
        return mayor;
    }
    
    public static int menorImpar(ArrayList<Integer> lista) {
        int menor = lista.get(0);
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i) < menor && lista.get(i) % 2 != 0) {
                menor = lista.get(i);
            }
        }
        System.out.println("Número menor: "+menor+"");
        return menor;
    }
    
    public static void intercambiar(ArrayList<Integer> lista, int mayor, int menor) {
        int temp = lista.get(mayor);
        lista.set(mayor, lista.get(menor));
        lista.set(menor, temp);
        
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        
    }
    
}
