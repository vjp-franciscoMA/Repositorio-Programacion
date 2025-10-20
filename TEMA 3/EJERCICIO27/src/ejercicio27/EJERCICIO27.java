/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author fmont
 */
public class EJERCICIO27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operacion, resultado; //Declaro las variables que voy a usar
        operacion = 0; //Pongo la variable operacion en 0 para que el while funcione bien
        Scanner entrada = new Scanner(System.in); //Creo el objeto Scanner para leer los datos por teclado
        System.out.println("Escribe un primer número:"); //Pido al usuario un primer número
        int numero1 = entrada.nextInt(); //Leo el número que ha elegido el usuario
        System.out.println("Escribe un segundo número:"); //Pido al usuario un segundo número
        int numero2 = entrada.nextInt(); //Leo el número que ha elegido el usuario
       
        while (operacion != 5) { //Creo un bucle while para que el menú se repita hasta que el usuario elija 5
       
        //Muestro el menú
        System.out.println("Pulse una opción:");
        System.out.println("1.- Sumar los números");
        System.out.println("2.- Restar los números");
        System.out.println("3.- Multiplicar los números");
        System.out.println("4.- Dividir los números");
        System.out.println("5.- Salir del programa");
        operacion = entrada.nextInt(); //Leo la opción que ha elegido el usuario
       
        try { //Uso un try para controlar errores
        switch (operacion) {
            //Si el usuario elige 1, se suman los números e imprimo por pantalla el resultado
            case 1:
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            //Si el usuario elige 2, se restan los números e imprimo por pantalla el resultado
            case 2:
                resultado = numero1 - numero2;
                System.out.println(resultado);
                break;
            //Si el usuario elige 3, se multiplican los números e imprimo por pantalla el resultado
            case 3:
                resultado = numero1 * numero2;
                System.out.println(resultado);
                break;
            //Si el usuario elige 4, se dividen los números e imprimo por pantalla el resultado
            case 4:
                resultado = numero1 / numero2;
                System.out.println(resultado);
                break;
            //Si el usuario elige 5, se sale del programa
            case 5:
                System.out.println("Te has salido del programa.");
                break;
            //Si el usuario mete una opción no válida, le aviso
            default:
                System.out.println("Opción no válida.");      
        }
    }
        //Creo un catch por si da error en el programa debido a que el usuario ha dividido entre 0
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        //Creo otro catch por si da error en el programa debido a que el usuario ha introducido una letra
        catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
  }
}