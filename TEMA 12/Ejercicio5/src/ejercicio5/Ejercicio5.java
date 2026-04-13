/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author fmont
 */
public class Ejercicio5 {
    public static final String FICHERO = "agenda.txt";
    
    public static int menu() throws InputMismatchException{
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Añadir contacto a un fichero de texto.");
        System.out.println("2. Mostrar contenido del fichero.");
        System.out.println("3. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void añadirContacto() throws InputMismatchException, FileNotFoundException, IOException{
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre del contacto:");
        String nombre = entrada.nextLine();
        
        System.out.print("Introduce la edad del contacto:");
        int edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce el número de teléfono del contacto:");
        String numero = entrada.nextLine();
        
        try (
                FileWriter fw = new FileWriter(FICHERO, true);
                PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println(nombre);
            pw.println(edad);
            pw.println(numero);
        }      
    }
    
    public static void mostrarFichero() throws FileNotFoundException, IOException {
        try (
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
            try {
            opcion = menu();
            switch(opcion) {
                case 1:
                    añadirContacto();
                    break;
                case 2:
                    mostrarFichero();
                    break;
                case 3:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción válida entre 1 y 3.");
            }
            } catch(InputMismatchException e) {
                System.out.println("ERROR. Escribe un tipo de dato correcto.");
            }
            catch(FileNotFoundException e) {
                System.out.println("ERROR. No se ha encontrado el fichero.");
            }
            catch(IOException e) {
                System.out.println("ERROR. Ha ocurrido un error en la escritura o lectura del fichero.");
            }
            catch(Exception e) {
                System.out.println("ERROR. Ha ocurrido un error desconocido.");
            }
        } while(opcion != 3);
    }
    
}
