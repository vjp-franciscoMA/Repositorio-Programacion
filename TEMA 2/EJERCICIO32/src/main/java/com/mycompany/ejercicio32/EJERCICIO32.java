/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EJERCICIO32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, indique una cantidad de dinero");
        int dinero = entrada.nextInt();
        
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        billetes50 = dinero / 50;
        billetes20 = (dinero % 50) / 20;
        billetes10 = (dinero % 20) / 10;
        billetes5 = (dinero % 10) / 5;
        monedas2 = (dinero % 5) / 2;
        monedas1 = dinero % 2;
        
        System.out.println(""+dinero+" Euros se descomponen en "+billetes50+" billetes de 50, "+billetes20+" billetes de 20, "+billetes10+" billetes de 10, "+billetes5+" billetes de 5, "+monedas2+" monedas de 2 euros y "+monedas1+" monedas de 1 euro");
    }
}
