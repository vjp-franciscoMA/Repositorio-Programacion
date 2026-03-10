/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio16 {
    public static int menuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. MENÚ DE ADMINISTRACIÓN.");
        System.out.println("2. MENÚ DE COMPRA.");
        System.out.println("3. Salir.");
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static int menuAdministracion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Introducir productos en la lista.");
        System.out.println("2. Visualizar la lista de productos.");
        System.out.println("3. Eliminar productos de la lista.");
        System.out.println("4. Volver al menú principal.");
        int opcion2 = entrada.nextInt();
        entrada.nextLine();
        return opcion2;
    }
    
    public static int menuCompra() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Comprar productos.");
        System.out.println("2. Volver al menú principal.");
        int opcion3 = entrada.nextInt();
        entrada.nextLine();
        return opcion3;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        do {
            try {
            opcion = menuPrincipal();
            switch(opcion) {
                case 1: 
                    int opcion2 = 0;
                    do {
                        try {
                        opcion2 = menuAdministracion();
                        switch(opcion2) {
                            case 1:
                                
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                
                                break;
                            case 4:
                                opcion = menuPrincipal();
                                break;
                            default:
                                System.out.println("Introduce una opción entre 1 y 4.");
                        }
                        } catch(InputMismatchException e) {
                            System.out.println("Introduce un número entero entre 1 y 4.");
                        }
                    } while(opcion2 != 4);
                    break;
                case 2:
                    int opcion3 = 0;
                    do {
                        try {
                            opcion3 = menuCompra();
                            switch (opcion3) {
                                case 1:

                                    break;
                                case 2:
                                    opcion = menuPrincipal();
                                    break;
                                default:
                                    System.out.println("Introduce una opción entre 1 y 2.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Introduce un número entero entre 1 y 2.");
                        }
                    } while (opcion3 != 2);
                    break;
                case 3:
                    System.out.println("Te has salido del menú.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 3.");
            }
            } catch(InputMismatchException e) {
                System.out.println("Introduce un número entero entre 1 y 3.");
            }
        } while(opcion != 3);
    }
    
}
