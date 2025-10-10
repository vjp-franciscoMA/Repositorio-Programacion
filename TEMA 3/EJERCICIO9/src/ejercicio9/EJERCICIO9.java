/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner; //Importo la clase Scanner para poder leer lo que escriba el usuario
/**
 *
 * @author alumno
 */
public class EJERCICIO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //Creo el objeto Scanner para leer datos desde el teclado
        System.out.println("Por favor, introduzca el primer número:"); //Muestro un mensaje para pedir el primer número
        int numero1 = entrada.nextInt(); //Guardo el primer número que escribe el usuario
        System.out.println("Ahora, introduzca un segundo número:"); //Muestro otro mensaje para pedir el segundo número
        int numero2 = entrada.nextInt(); //Guardo el segundo número que escribe el usuario
        System.out.println("Introduzca el tercer número:"); //Muestro otro mensaje para pedir el tercer número
        int numero3 = entrada.nextInt(); //Guardo el tercer número que escribe el usuario
        System.out.println("Por último, introduzca un cuarto número:"); //Muestro otro mensaje para pedir el cuarto número
        int numero4 = entrada.nextInt(); //Guardo el cuarto número que escribe el usuario
        
        //Creo las siguientes variables para almacenar los números ordenados
        int menor, segundo, tercero, mayor;
       
         //Determino el menor número
        if(numero1 <= numero2 && numero1 <= numero3 && numero1 <= numero4){
            menor = numero1;
            //Ordeno los demás
            if(numero2 <= numero3 && numero2 <= numero4){
                segundo = numero2;
                if(numero3 <= numero4){
                    tercero = numero3;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero3;
                }
            } else if(numero3 <= numero2 && numero3 <= numero4){
                segundo = numero3;
                if(numero2 <= numero4){
                    tercero = numero2;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero2;
                }
            } else { //numero4 es el segundo más pequeño
                segundo = numero4;
                if(numero2 <= numero3){
                    tercero = numero2;
                    mayor = numero3;
                } else {
                    tercero = numero3;
                    mayor = numero2;
                }
            }
        } else if(numero2 <= numero1 && numero2 <= numero3 && numero2 <= numero4){
            menor = numero2;
            if(numero1 <= numero3 && numero1 <= numero4){
                segundo = numero1;
                if(numero3 <= numero4){
                    tercero = numero3;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero3;
                }
            } else if(numero3 <= numero1 && numero3 <= numero4){
                segundo = numero3;
                if(numero1 <= numero4){
                    tercero = numero1;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero1;
                }
            } else {
                segundo = numero4;
                if(numero1 <= numero3){
                    tercero = numero1;
                    mayor = numero3;
                } else {
                    tercero = numero3;
                    mayor = numero1;
                }
            }
        } else if(numero3 <= numero1 && numero3 <= numero2 && numero3 <= numero4){
            menor = numero3;
            if(numero1 <= numero2 && numero1 <= numero4){
                segundo = numero1;
                if(numero2 <= numero4){
                    tercero = numero2;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero2;
                }
            } else if(numero2 <= numero1 && numero2 <= numero4){
                segundo = numero2;
                if(numero1 <= numero4){
                    tercero = numero1;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero1;
                }
            } else {
                segundo = numero4;
                if(numero1 <= numero2){
                    tercero = numero1;
                    mayor = numero2;
                } else {
                    tercero = numero2;
                    mayor = numero1;
                }
            }
        } else { //numero4 es el menor
            menor = numero4;
            if(numero1 <= numero2 && numero1 <= numero3){
                segundo = numero1;
                if(numero2 <= numero3){
                    tercero = numero2;
                    mayor = numero3;
                } else {
                    tercero = numero3;
                    mayor = numero2;
                }
            } else if(numero2 <= numero1 && numero2 <= numero3){
                segundo = numero2;
                if(numero1 <= numero3){
                    tercero = numero1;
                    mayor = numero3;
                } else {
                    tercero = numero3;
                    mayor = numero1;
                }
            } else {
                segundo = numero3;
                if(numero1 <= numero2){
                    tercero = numero1;
                    mayor = numero2;
                } else {
                    tercero = numero2;
                    mayor = numero1;
                }
            }
        }
       
        //Mostramos los números en orden creciente
        System.out.println("El orden de los números introducidos es: " + menor + "-" + segundo + "-" + tercero + "-" + mayor);
    } 
} 
    