/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PedirNumeros {
    public static void PedirNumeros() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número:");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo número:");
        int num2 = entrada.nextInt();
        System.out.println("Por último, introduzca el tercer número");
        int num3 = entrada.nextInt();
        ejercicio9.NumeroMenor.NumeroMenor(num1, num2, num3);
    }
}
