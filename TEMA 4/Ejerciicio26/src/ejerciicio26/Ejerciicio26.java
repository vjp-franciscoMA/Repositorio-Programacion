/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciicio26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejerciicio26 {
    //Creo un método para comprobar si el número introducido por el usuario es primo o no
    public static boolean esPrimo(){
        //Creo las variables
        boolean primo;
        int numero, i, contador;
        contador = 0;
        i=0;//
      
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número:"); //Le pido al usuario un número
        numero = entrada.nextInt(); //Leo el número
      
        while(i < numero && contador!= 3){ //Creo un bucle
            i++; //Actualizo i
            if(numero % i == 0) { //Si el número entre i da de resto 0, actualizo el contador
            contador ++;
            }
        }
        if (contador == 2) { //Si contador es igual a dos (tiene dos divisores)
            primo = true; //Es primo
        }
        else {
            primo = false; //Sino, no es primo
        }
        return primo; //Devuelvo el valor
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean resultado; //Creo la variable resultado
        resultado = esPrimo(); //La igualo al método
      
        if (resultado == true) { //Si resultado es cierto, el número es primo
            System.out.println("El número introducido es primo.");
        }
        else { //Sino, no es primo
            System.out.println("El número introducido no es primo.");
        }
   }
}
