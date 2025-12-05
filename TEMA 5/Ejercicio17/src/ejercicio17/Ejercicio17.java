/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;
/**
 *
 * @author fmont
 */
public class Ejercicio17 {
    public static void mostrarPregunta1(Enunciado enunciado1, Scanner entrada) {
        double nota;
        System.out.println("PREGUNTA1:");
        enunciado1.setPregunta("¿Cuál es la capital de España?");
        System.out.println(enunciado1.getPregunta());
        enunciado1.setRespuesta(entrada.nextLine());
        if (enunciado1.getRespuesta().equals("Madrid")) {
            System.out.println("CORRECTO. Has acertado la pregunta.");
        }
        else {
            System.out.println("INCORRECTO. Has fallado la pregunta. La respuesta correcta era Madrid.");
        }
    }
    public static void mostrarPregunta2(Enunciado enunciado2, Scanner entrada) {
        double nota;
        System.out.println("PREGUNTA2:");
        enunciado2.setPregunta("¿Cuál es la capital de España??");
        System.out.println(enunciado2.getPregunta());
        enunciado2.setRespuesta(entrada.nextLine());
        if (enunciado2.getRespuesta().equals("Madrid")) {
            System.out.println("CORRECTO. Has acertado la pregunta.");
        }
        else {
            System.out.println("INCORRECTO. Has fallado la pregunta. La respuesta correcta era Madrid.");
        }
    }
    public static void resultadoFinal(Enunciado enunciado1, Enunciado enunciado2) {
        double nota;
        if (enunciado1.getRespuesta().equals("Madrid") && enunciado2.getRespuesta().equals("Madrid")) {
            nota = 5;
            System.out.println(nota);
        }
        else if (enunciado1.getRespuesta().equals("Madrid") && !enunciado2.getRespuesta().equals("Madrid")) {
            nota = 2.5;
            System.out.println(nota);
        }
        else if (!enunciado1.getRespuesta().equals("Madrid") && enunciado2.getRespuesta().equals("Madrid")) {
            nota = 2.5;
            System.out.println(nota);
        }
        else {
            nota = 0;
            System.out.println(nota);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Enunciado enunciado1 = new Enunciado();
        mostrarPregunta1(enunciado1, entrada);
        
        Enunciado enunciado2 = new Enunciado();
        mostrarPregunta2(enunciado2, entrada);
        
        resultadoFinal(enunciado1, enunciado2);
    }
}