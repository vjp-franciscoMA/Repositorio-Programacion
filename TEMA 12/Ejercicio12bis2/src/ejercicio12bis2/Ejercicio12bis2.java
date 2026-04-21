/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis2;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author alumno
 */
public class Ejercicio12bis2 {
    public static String FICHERO = null;
    
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1. Escribir cadenas en fichero.");
        System.out.println("2. Leer fichero.");
        System.out.println("3. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void escribirCadenasEnArchivo(String FICHERO, String[] caracteres) throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Introduce el caracter número " + (i + 1) + " :");
            String caracter = entrada.nextLine();
            caracteres[i] = caracter;
        }
        
        try(
                FileWriter fw = new FileWriter(FICHERO, true);
                PrintWriter pw = new PrintWriter(fw);
        ) {
            for(int i = 0; i < caracteres.length; i++) {
                pw.print(""+caracteres[i]+"*");
            }
        }
    }
    
    public static void leerFichero(String FICHERO) throws FileNotFoundException, IOException {
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
        Scanner entrada = new Scanner(System.in);
        
        String[] caracteres = new String[4];
        int opcion = 0;
        
        if(FICHERO == null) {
            System.out.print("Introduce el nombre del fichero: ");
            FICHERO = entrada.nextLine();
        }
        
        do {
            try {
            opcion = menu();
            switch(opcion) {
                case 1:
                    escribirCadenasEnArchivo(FICHERO, caracteres);
                    break;
                case 2:
                    leerFichero(FICHERO);
                    break;
                case 3:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 3.");
            }
            } catch(InputMismatchException e) {
                System.out.println("Introduce un tipo de dato correcto.");
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
