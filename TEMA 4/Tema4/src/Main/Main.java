package Main;

import Utilidades.Utilidades;
import calculadora.Calculadora;
public class Main {
    public static void main(String[] args) {
        // PRUEBAS DE LA CLASE CALCULADORA
        System.out.println("PRUEBAS DE CALCULADORA");
        int a = 8;
        int b = 3;

        System.out.println("Suma: " + Calculadora.suma(a, b));
        System.out.println("Resta: " + Calculadora.resta(a, b));
        System.out.println("Multiplicación: " + Calculadora.multiplicacion(a, b));
        System.out.println("División: " + Calculadora.division(a, b));
        System.out.println("Raíz cuadrada de " + a + ": " + Calculadora.raizCuadrada(a));
        System.out.println("Cuadrado de " + b + ": " + Calculadora.cuadrado(b));
        System.out.println("Cubo de " + b + ": " + Calculadora.cubo(b));
        System.out.println("Redondeo bajo de 3.7: " + Calculadora.redondeoBajo(3.7));
        System.out.println("Redondeo alto de 3.7: " + Calculadora.redondeoAlto(3.7));
        System.out.println("Logaritmo de 10: " + Calculadora.logaritmo(10));
        System.out.println("Valor máximo entre " + a + " y " + b + ": " + Calculadora.valorMaximo(a, b));
        System.out.println("Valor mínimo entre " + a + " y " + b + ": " + Calculadora.valorMinimo(a, b));

        // PRUEBAS DE LA CLASE UTILIDADES
        System.out.println("PRUEBAS DE UTILIDADES");

        // Ejemplo 1: pedir número al usuario
        int numero = Utilidades.pedirNumero();
        System.out.println("Has introducido: " + numero);

        // Ejemplo 2: letra aleatoria entre 'a' y 'z'
        System.out.println("Letra aleatoria (a-z): " + Utilidades.generarLetraAleatoria());

        // Ejemplo 3: letra aleatoria entre 'd' y 'k'
        System.out.println("Letra aleatoria (d-k): " + Utilidades.generarLetraAleatoria('d', 'k'));
    }
}

