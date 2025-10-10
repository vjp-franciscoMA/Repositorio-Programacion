/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner; //Importo la clase Scanner para poder leer lo que escriba el usuario
/**
 *
 * @author alumno
 */
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //Creo el objeto Scanner para leer datos desde el teclado
        System.out.println("Introduzca la nota de un alumno (número entre 0 y 10):"); //Muestro un mensaje para pedir la nota de un alumno
        int nota = entrada.nextInt(); //Guardo la nota introducida por el usuario
        
        //Compruebo si tiene un suspenso, un bien, un notable o un sobresaliente
        if (nota >= 0 && nota <= 4) { //Si la nota está entre 0 y 4, es suspenso
            System.out.println("Suspenso."); 
        }
        
        else if (nota >= 5 && nota <= 6){ //Si la nota es 5 o 6, es un bien
            System.out.println("Bien.");
        }
        
        else if (nota >= 7 && nota <= 8) { //Si la nota es 7 u 8, es un notable
            System.out.println("Notable.");
        }
        
        else if (nota >= 9 && nota <= 10) { //Si la nota es 9 o 10, es un sobresaliente
            System.out.println("Sobresaliente.");
        }
        
        else { //Si no está entre 0 y 10, entonces es una nota no válida
            System.out.println("La nota introducida no es válida.");
    }
  }
}
