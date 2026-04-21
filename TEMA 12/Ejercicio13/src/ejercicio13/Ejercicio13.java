/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
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
public class Ejercicio13 {
    public static String FICHERO = "DatosBeca.txt";
    
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1. Escribir fichero.");
        System.out.println("2. Leer fichero.");
        System.out.println("3. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void escribirFichero() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el nombre y apellido del becario: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Introduce el sexo del becario (H-M): ");
        String sexo = entrada.nextLine();
        
        System.out.print("Introduce la edad del becario (20-60): ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce el número de suspensos del curso anterior del becario (0-4): ");
        int suspensos = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce la residencia familiar del becario (SI-NO): ");
        String residencia = entrada.nextLine();
        
        System.out.print("Introduce los ingresos anuales de la familia del becario: ");
        double ingresos = entrada.nextDouble();
        entrada.nextLine();
        
        try(
                FileWriter fw = new FileWriter(FICHERO, true);
                PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println(""+nombre+";"+sexo+";"+edad+";"+suspensos+";"+residencia+";"+ingresos+"");
        }
    }
    
    public static void leerFichero() throws FileNotFoundException, IOException {
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
            try {
                opcion = menu();
                switch (opcion) {
                    case 1:
                        escribirFichero();
                        break;
                    case 2:
                        leerFichero();
                        break;
                    case 3:
                        System.out.println("Te has salido del programa.");
                        break;
                    default:
                        System.out.println("Introduce una opción entre 1 y 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un tipo de dato correcto.");
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el fichero.");
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error con la escritura o lectura del fichero.");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error desconocido.");
            }
        } while (opcion != 3);
    }
    
}
