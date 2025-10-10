/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner; //Importo la clase Scanner para poder leer lo que escriba el usuario
/**
 *
 * @author alumno
 */
public class EJERCICIO26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //Creo el objeto Scanner para leer datos desde el teclado
        System.out.println("Por favor, introduzca un número de 4 cifras:"); //Muestro un mensaje para pedir un número
        int numero = entrada.nextInt(); //Guardo el número que escribe el usuario
        
        int cifra1, cifra2, cifra3, cifra4; //Declaro las variables donde guardaré cada cifra
        cifra1 = numero / 1000; //Hago un cálculo para sacar la primera cifra
        cifra2 = (numero / 100) % 10; //Hago un cálculo para sacar la segunda cifra
        cifra3 = (numero / 10) % 10; //Hago un cálculo para sacar la tercera cifra
        cifra4 = numero % 10; //Hago un cálculo para sacar la cuarta cifra
        
        //Resultado
        System.out.println("La primera cifra es: "+cifra1+""); //Imprimo por pantalla la primera cifta
        System.out.println("La segunda cifra es: "+cifra2+""); //Imprimo por pantalla la segunda cifta
        System.out.println("La tercera cifra es: "+cifra3+""); //Imprimo por pantalla la tercera cifta
        System.out.println("La primera cifra es: "+cifra4+""); //Imprimo por pantalla la cuarta cifta
    }
}
