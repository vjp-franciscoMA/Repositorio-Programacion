/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author fmont
 */
public class Ejercicio6 {
    public static String FICHERO = null;
    
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Volcado de un array  con los 100 primeros números pares a un fichero de texto elegido por el usuario.");
        System.out.println("2. Mostrar el contenido del fichero.");
        System.out.println("3. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void volcadoArray() throws InputMismatchException, IOException, FileNotFoundException{
        Scanner entrada = new Scanner(System.in);
        if(FICHERO == null) {
            System.out.print("Introduce el nombre del fichero:");
            FICHERO = entrada.nextLine();
        }
        
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
        
        try (
                FileWriter fw = new FileWriter(FICHERO, true);
                PrintWriter pw = new PrintWriter(fw);
        ) {
            for(int i = 0; i < array.length; i++) {
                pw.print("{"+array[i]+"}");
            }
        }
    }
    
    public static void mostrarFichero() throws FileNotFoundException, IOException {
        try(
                FileReader fr = new FileReader(FICHERO);
                BufferedReader br = new BufferedReader(fr);
        ) {
            String linea = br.readLine();
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        do {
            try{
            opcion = menu();
            switch(opcion) {
                case 1:
                    volcadoArray();
                    break;
                case 2:
                    mostrarFichero();
                    break;
                case 3:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 3.");
            }
            } catch(InputMismatchException e) {
                System.out.println("Introduce un tipo de dato válido.");
            }
            catch(FileNotFoundException e) {
                System.out.println("No se ha encontrado el fichero.");
            }
            catch(IOException e) {
                System.out.println("Ha ocurrido un error con la escritura o lectura del fichero.");
            }
            catch(Exception e) {
                System.out.println("Ha ocurrido un error desconocido.");
            }
        } while(opcion != 3);
    }
    
}
