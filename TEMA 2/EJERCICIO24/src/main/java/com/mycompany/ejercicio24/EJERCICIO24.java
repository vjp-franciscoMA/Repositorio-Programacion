/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio24;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EJERCICIO24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca la nota de Programación:");
        int notaProgramacion = entrada.nextInt();
        System.out.println("Por favor, introduzca la nota de Lenguajes de Marcas:");
        int notaLenguajesDeMarcas = entrada.nextInt();
        System.out.println("Por favor, introduzca la nota de Bases de Datos:");
        int notaBasesDeDatos = entrada.nextInt();
        System.out.println("Por favor, introduzca la nota de Entornos de Desarrollo:");
        int notaEntornosDeDesarrollo = entrada.nextInt();
        System.out.println("Por favor, introduzca la nota de Sistemas Informáticos:");
        int notaSistemasInformaticos = entrada.nextInt();
        System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral:");
        int notaFormacionYOrientacionLaboral = entrada.nextInt();
        
        int notaMedia = (notaProgramacion + notaLenguajesDeMarcas + notaBasesDeDatos + notaEntornosDeDesarrollo + notaSistemasInformaticos + notaFormacionYOrientacionLaboral) / 6;
        System.out.println("Su nota media del curso es de: "+notaMedia+"");




    }
}
