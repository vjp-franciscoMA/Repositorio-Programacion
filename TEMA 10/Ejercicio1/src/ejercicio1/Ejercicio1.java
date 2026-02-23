/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1 {
    public static ArrayList<String> rellenarLista() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Introduce el número de personas que quieres almacenar:");
        int personas = entrada.nextInt();
        entrada.nextLine();
        
        for(int i = 0; i < personas; i++) {
            System.out.println("Introduce el nombre de la persona "+(i+1)+"");
            lista.add(entrada.nextLine());
        }
        
        return lista;
    }
    
    public static void mostrarLista(ArrayList<String> lista) {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println("Persona "+(i+1)+"");
            System.out.println(lista.get(i));
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = rellenarLista();
        mostrarLista(lista);
    }
    
}
