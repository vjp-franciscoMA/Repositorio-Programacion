/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio6 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Añadir donación.");
        System.out.println("2. Mostrar donaciones.");
        System.out.println("3. Mostrar donaciones por nombre de donante.");
        System.out.println("4. Mostrar número de donaciones.");
        System.out.println("5. Mostrar total dinero recaudado.");
        System.out.println("6. Ordenar donaciones.");
        System.out.println("7. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void añadirDonaciones(Donacion[] donaciones) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce cuántas donaciones quieres hacer:");
        int donacion = entrada.nextInt();
        entrada.nextLine();
        
        for(int i = 0; i < donacion; i++) {
            System.out.println("DONACIÓN "+(i+1)+"");
            System.out.print("Introduce tu nombre:");
            String nombre = entrada.nextLine();
            System.out.print("Introduce la cantidad que quieres donar:");
            int cantidad = entrada.nextInt();
            entrada.nextLine();
            donaciones[i] = new Donacion(nombre, cantidad);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Donacion[] donaciones = null;
        int opcion;
        
        do{
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
                    System.out.println("Introduce un número válido entre 1 y 7.");
            }
        } while(opcion != 7);
    }
    
}
