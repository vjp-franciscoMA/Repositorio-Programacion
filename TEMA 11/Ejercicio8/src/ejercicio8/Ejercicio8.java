/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio8 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Añadir ciudad.");
        System.out.println("2. Mostrar todas las ciudades junto con sus sedes.");
        System.out.println("3. Mostrar nombre de las sedes cuyos ingresos anuales son superiores a la media.");
        System.out.println("4. Buscar por nombre de sede.");
        System.out.println("5. Añadir sede");
        System.out.println("6. Mostrar sedes ordenadas de mayor a menor número de ingresos anuales.");
        System.out.println("7. Salir del programa.");
        
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
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 7.");
            }
            } catch(InputMismatchException e) {
                System.out.println("Introduce un número entero entre 1 y 7.");
            }
        } while(opcion != 7);
    }
    
}
