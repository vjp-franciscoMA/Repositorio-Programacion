/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {
    public static int menu() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1. Introducir bebidas.");
        System.out.println("2. Comprar productos.");
        System.out.println("3. Salir.");
        
        int opcion = entrada.nextInt();
        entrada.nextLine();
        
        return opcion;
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
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 3.");
            }
            } catch(InputMismatchException e) {
                System.out.println("Introduce un tipo de dato correcto.");
            } catch(ClassNotFoundException e) {
                System.out.println("Clase no encontrada.");
            } catch(IOException e) {
                System.out.println("Ha ocurrido un error en la lectura o escritura del fichero.");
            } catch(Exception e) {
                System.out.println("Ha ocurrido un error desconocido.");
            }
        } while(opcion != 3);
    }
    
}
