/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio25;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EJERCICIO25 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca el primer número:");
        int primerNumero = entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo número:");
        int segundoNumero = entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer número:");
        int tercerNumero = entrada.nextInt();
        
        int sumaNumeros = primerNumero + segundoNumero + tercerNumero;
        int productoNumeros = primerNumero * segundoNumero * tercerNumero;
        System.out.println("La suma de los números introducidos es: "+sumaNumeros+"");
        System.out.println("El producto de los números introducidos es: "+productoNumeros+"");
    }
}
