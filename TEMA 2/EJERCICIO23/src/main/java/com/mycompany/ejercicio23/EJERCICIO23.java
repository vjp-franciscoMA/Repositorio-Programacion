/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EJERCICIO23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("¿Por favor, introduzca el precio del modelo de ordenador que desea comprar.");
        int precio = entrada.nextInt();
        System.out.println("¿Cuántas unidades quieres llevarse?");
        int unidades = entrada.nextInt();
        
        int precioTotal = precio * unidades;
        System.out.println("El precio total de su compra es de: "+precioTotal+" euros.");
        
    }
}
