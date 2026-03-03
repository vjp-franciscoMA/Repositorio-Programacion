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
        int mayor = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                mayor = lista.get(i);
                break;
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0 && lista.get(i) > mayor) {
                mayor = lista.get(i);
            }
        }

        System.out.println("Número mayor par: "+mayor+"");
        return mayor;
    }
    
    public static int menorImpar(ArrayList<Integer> lista) {
        int menor = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 != 0) {
                menor = lista.get(i);
                break; 
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 != 0 && lista.get(i) < menor) {
                menor = lista.get(i);
            }
        }

        System.out.println("Número menor impar: "+menor+"");
        return menor;
    }
    
    public static void intercambiar(ArrayList<Integer> lista, int mayor, int menor) {
        int posMayor = lista.indexOf(mayor);
        int posMenor = lista.indexOf(menor);

        if (posMayor != -1 && posMenor != -1) {
            int temp = lista.get(posMayor);
            lista.set(posMayor, lista.get(posMenor));
            lista.set(posMenor, temp);
        }

        System.out.println("Lista después del intercambio:");
        mostrarLista(lista);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista = lista();
        mostrarLista(lista);
        int mayor = mayorPar(lista);
        int menor = menorImpar(lista);
        intercambiar(lista, mayor, menor);
    }
    
}
