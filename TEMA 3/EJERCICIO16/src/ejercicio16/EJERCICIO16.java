/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class EJERCICIO16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, contador; //Creo la variable i para hacer el bucle de los números impares y la variable contador para contar cuantos números imapres hay 
        contador = 0; //Inicio el contador en 0
        System.out.print("Los números impares existentes entre el número 20 y el 160 son: "); //Muestrro un mensaje por pantalla antes de hacer el bucle
        
        //Bucle para recoger los números impares desde el 20 hasta el 160
        for(i=21;i<=160;i=i+2) {
            System.out.print(""+i+"-"); //Muestro los números impares por pantalla
            contador++; //Sumo el contador por cada número impar
        }
        System.out.println(); //Salto de línea
        System.out.println("La cantidad de números impares han sido: "+contador+""); //Muestro por pantalla la cantidad final de números impares
    }
}
