/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner; //Importo la clase Scanner para poder leer lo que escriba el usuario
/**
 *
 * @author alumno
 */
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //Creo el objeto Scanner para leer datos desde el teclado
        System.out.println("Por favor, indique una cantidad de dinero:"); //Muestro un mensaje para pedir una cantidad de dinero
        int dinero = entrada.nextInt(); //Guardo la cantidad de dinero que escribe el usuario
        
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1; //Declaro las variables donde guardaré cuántos billetes y monedas hay de cada tipo
        billetes50 = dinero / 50; //Hago un cálculo para sacar los billetes de 50 euros
        billetes20 = (dinero % 50) / 20; //Hago un cálculo para sacar los billetes de 20 euros
        billetes10 = (dinero % 50 % 20) / 10; //Hago un cálculo para sacar los billetes de 10 euros
        billetes5 = (dinero % 50 % 20 % 10) / 5; //Hago un cálculo para sacar los billetes de 5 euros
        monedas2 = (dinero % 50 % 20 % 10 % 5) / 2; //Hago un cálculo para sacar las monedas de 2 euros
        monedas1 = (dinero % 50 % 20 % 10 % 5 % 2) / 1; //Hago un cálculo para sacar las monedas de 1 euro
        
        
        System.out.println(""+dinero+" Euros se descomponen en:"); //Imprimo un mensaje para desglosar la cantidad de billetes y monedas que hay
        
        if (billetes50 > 0) {//Si hay más de 0 billetes de 50 euros, se imprime la cantidad de éstos
            System.out.println("Billetes de 50: "+billetes50+"");
        }
        
        if (billetes20 > 0) {//Si hay más de 0 billetes de 20 euros, se imprime la cantidad de éstos
            System.out.println("Billetes de 20: "+billetes20+"");
        }
        
        if (billetes10 > 0){//Si hay más de 0 billetes de 10 euros, se imprime la cantidad de éstos
            System.out.println("Billetes de 10: "+billetes10+"");
        }
        
        if (billetes5 > 0){//Si hay más de 0 billetes de 5 euros, se imprime la cantidad de éstos
            System.out.println("Billetes de 5: "+billetes5+"");
        }
        
        if (monedas2 > 0){//Si hay más de 0 monedas de 2 euros, se imprime la cantidad de éstos
            System.out.println("Monedas de 2: "+monedas2+"");
        }
        
        if (monedas1 > 0){//Si hay más de 0 monedas de 1 euro, se imprime la cantidad de éstos
            System.out.println("Monedas de 1: "+monedas1+"");
        }
    }
    
}
