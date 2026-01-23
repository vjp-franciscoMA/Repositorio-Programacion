/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {
    public static int[] numerosAleatorios() {
        int[] numeros = new int[100];
        int i;
        for(i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * (80 - 10 + 1) + 10);
        }
        return numeros;
    }
    public static void mostrarNumeroMayor(int[] numeros) {
        int mayor = numeros[0];
        int i;
        for(i = 0; i < numeros.length; i++) {
            if(numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: "+mayor+"");
    }
    public static void mostrarNumeroMenor(int[] numeros) {
        int menor = numeros[0];
        int i;
        for(i = 0; i < numeros.length; i++) {
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El número menor es: "+menor+"");
    }
    public static void mostrarValorMasRepetido(int[] numeros) {
        int valorMasRepetido = numeros[0];
        int maxRepeticiones = 0;

        for (int i = 0; i < numeros.length; i++) {
        int contador = 0;
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[i] == numeros[j]) {
                contador++;
            }
        }
        if (contador > maxRepeticiones) {
            maxRepeticiones = contador;
            valorMasRepetido = numeros[i];
        }
    }
    System.out.println("Valor más repetido: "+valorMasRepetido+"");
    }
    public static void mostrarMedia(int[] numeros) {
        int suma = 0;
        int media;
        int i;
        for(i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        media = suma / numeros.length;
        System.out.println("La media es: "+media+"");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = numerosAleatorios();
        mostrarNumeroMayor(numeros);
        mostrarNumeroMenor(numeros);
        mostrarValorMasRepetido(numeros);
        mostrarMedia(numeros);
    }
    
}
