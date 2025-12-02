/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INSTANCIA DE OBJETOS DE CADA CLASE
        Suma suma = new Suma(9,9);
        Multiplicacion multiplicacion = new Multiplicacion(7,7);
        Potencia potencia = new Potencia(2,2);
        
        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();
        
        // POLIMORFISMO
        Calculadora c1 = new Suma(9,9);
        Calculadora c2 = new Multiplicacion(7,7);
        Calculadora c3 = new Potencia(2,2);
        
        c1.realizarOperacion();
        c2.realizarOperacion();
        c3.realizarOperacion();
    }
    
}
