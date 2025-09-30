/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EJERCICIO26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un número de 4 cifras:");
        int numero = entrada.nextInt();
        
        int cifra1, cifra2, cifra3, cifra4;
        cifra1 = numero / 1000;
        cifra2 = (numero / 100) % 10;
        cifra3 = (numero / 10) % 10;
        cifra4 = numero % 10;
        
        System.out.println("La primera cifra es: "+cifra1+"");
        System.out.println("La segunda cifra es: "+cifra2+"");
        System.out.println("La tercera cifra es: "+cifra3+"");
        System.out.println("La primera cifra es: "+cifra4+"");
    }
}
