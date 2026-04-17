/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio9 {
    public static final String FICHERO = "frase.txt";
    public static final String FICHERO2 = "fraseinvertida.txt";
    
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Leer frase.txt.");
        System.out.println("2. Escribir texto invertido de frase.txt en fraseinvertida.txt.");
        System.out.println("3. Leer fraseinvertida.txt.");
        System.out.println("4. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void leerFicheroFrase() throws FileNotFoundException, IOException {
        try(
                FileReader fw = new FileReader(FICHERO);
                BufferedReader br = new BufferedReader(fw);
        ) {
            String linea = br.readLine();
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
    
    public static void escribirFicheroFraseInvertida() throws FileNotFoundException, IOException {
        try(
                FileReader fr = new FileReader(FICHERO); 
                BufferedReader br = new BufferedReader(fr); 
                FileWriter fw = new FileWriter(FICHERO2); 
                PrintWriter pw = new PrintWriter(fw);
        ) {
            String linea = br.readLine();

            while (linea != null) {
                String invertida = "";

                for (int i = linea.length() - 1; i >= 0; i--) {
                    invertida = invertida + linea.charAt(i);
                }

                pw.println(invertida);
                
                linea = br.readLine();
            }
        }
    }
    
    public static void leerFicheroFraseInvertida() throws FileNotFoundException, IOException {
        try(
                FileReader fw = new FileReader(FICHERO2);
                BufferedReader br = new BufferedReader(fw);
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
                    leerFicheroFrase();
                    break;
                case 2:
                    escribirFicheroFraseInvertida();
                    break;
                case 3:
                    leerFicheroFraseInvertida();
                    break;
                case 4:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 4.");
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
        } while(opcion != 4);
    }
    
}
