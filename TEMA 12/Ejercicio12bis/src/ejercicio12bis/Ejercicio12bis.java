/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio12bis {
    public static final String FICHERO = "masnumeros.txt";
    
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Leer suma de masnumeros.txt.");
        System.out.println("2. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void sumarNumerosFichero() throws FileNotFoundException, IOException {
        try (
            FileReader fr = new FileReader(FICHERO);
            BufferedReader br = new BufferedReader(fr);
        ) {
            String linea = br.readLine();
            int suma = 0;

            while (linea != null) {

                String[] numeros = linea.split(";");

                for (int i = 0; i < numeros.length; i++) {
                    suma = suma + Integer.parseInt(numeros[i]); // paso de texto a número para poder sumar
                }

                linea = br.readLine();
            }

            System.out.println("La suma total es de "+suma+".");
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
                    sumarNumerosFichero();
                    break;
                case 2:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 2.");
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
        } while(opcion != 2);
    }
    
}
