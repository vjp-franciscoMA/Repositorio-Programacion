/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;
import java.util.Scanner;
/**
 *
 * @author fmont
 */
public class Ejercicio18 {
    public static void numero1(Menu menu1, Scanner entrada) {
        System.out.println("Introduce el primer número:");
        menu1.setNumero1(entrada.nextInt());
    }
    public static void numero2(Menu menu2, Scanner entrada) {
        System.out.println("Introduce el segundo número:");
        menu2.setNumero2(entrada.nextInt());
    }
    public static void mostrarMenu(Menu menu1, Menu menu2, Scanner entrada) {
        int opcion;
        do {
        System.out.println("ELIGE QUE HACER CON LOS NÚMEROS");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        opcion = entrada.nextInt();
        try {
        switch (opcion) {
            case 1:
                System.out.println(menu1.getNumero1() + menu2.getNumero2());
                break;
            case 2:
                System.out.println(menu1.getNumero1() - menu2.getNumero2());
                break;
            case 3:
                System.out.println(menu1.getNumero1() * menu2.getNumero2());
                break;
            case 4:
                System.out.println(menu1.getNumero1() / menu2.getNumero2());
                break;
            case 5:
                System.out.println("Te has salido del menú");
                break;
            default:
                System.out.println("Introduce un número válido.");
        }
        }
        catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0.");
        }
        } while(opcion!=5);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Menu menu1 = new Menu();
        Menu menu2 = new Menu();
        numero1(menu1, entrada);
        numero2(menu2, entrada);
        mostrarMenu(menu1, menu2, entrada);
    }
    
}
