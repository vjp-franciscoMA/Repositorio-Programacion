/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Añadir campaña.");
        System.out.println("2. Añadir donación.");
        System.out.println("3. Mostrar campañas con donaciones.");
        System.out.println("4. Mostrar campaña por nombre.");
        System.out.println("5. Mostrar total dinero recaudado.");
        System.out.println("6. Mostrar mayor donación.");
        System.out.println("7. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void añadirCampaña(ArrayList<Campania> campañas) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Campania> campañas = new ArrayList<>();
        int opcion;

        do {
            opcion = menu();
            switch (opcion) {
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
        } while (opcion != 7);
    }
    
}
