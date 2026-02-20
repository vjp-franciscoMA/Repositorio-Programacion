/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un usuario:");
        String usuario = entrada.nextLine();
        
        String contraseña;
        boolean valida;
        
        do {
            System.out.println("Introduce una contraseña:");
            contraseña = entrada.nextLine();
            
            valida = true;
            
            if (contraseña.length() < 6) {
                System.out.println("La contraseña no puede tener menos de seis caracteres.");
                valida = false;
            }
            
            int contadorDigitos = 0;
            int i = 0;
            while (i < contraseña.length()) {
                if (Character.isDigit(contraseña.charAt(i))) {
                    contadorDigitos++;
                }
                i++;
            }
            if (contadorDigitos < 2) {
                System.out.println("La contraseña debe tener al menos 2 dígitos.");
                valida = false;
            }
            
            if (contraseña.equalsIgnoreCase(usuario)) {
                System.out.println("La contraseña no puede ser igual al nombre de usuario.");
                valida = false;
            }
            
        } while (!valida);
        
        System.out.println("Contraseña correcta.");
        
    }
}
