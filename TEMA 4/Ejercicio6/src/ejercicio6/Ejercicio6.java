/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author fmont
 */
public class Ejercicio6 {
    public static void nota(int nota) {
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                    System.out.println("Suspenso.");  
                    break;
            case 5:
            case 6:
                    System.out.println("Bien.");  
                    break;
            case 7:
            case 8:
                   System.out.println("Notable.");  
                   break;
            case 9:
            case 10:
                   System.out.println("Sobresaliente.");  
                   break;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota de un alumno:");
        int nota = entrada.nextInt();
        nota(nota);
        
    }
    
}
