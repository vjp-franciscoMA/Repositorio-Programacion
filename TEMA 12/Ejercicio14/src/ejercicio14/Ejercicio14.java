/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {
    public static final String FICHERO = "DatosBeca.txt";

    public static int menu() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Calcular becas.");
        System.out.println("2. Salir.");

        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void calcularBecas() throws FileNotFoundException, IOException {
        try (
            FileReader fr = new FileReader(FICHERO);
            BufferedReader br = new BufferedReader(fr);
        ) {
            String linea = br.readLine();
            while (linea != null) {
                String[] datos = linea.split(";");

                String nombre = datos[0];
                int edad = Integer.parseInt(datos[2]);
                int suspensos = Integer.parseInt(datos[3]);
                String residencia = datos[4];
                double ingresos = Double.parseDouble(datos[5]);

                if (suspensos < 2) {

                    double beca = 1500;

                    if (ingresos <= 12000) {
                        beca += 500;
                    }

                    if (edad < 23) {
                        beca += 200;
                    }

                    if (suspensos == 0) {
                        beca += 500;
                    } else if (suspensos == 1) {
                        beca += 200;
                    }

                    if (residencia.equalsIgnoreCase("NO")) {
                        beca += 1000;
                    }

                    System.out.println(""+nombre+", Beca: "+beca+" €");
                }
                linea = br.readLine();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        do {
            try {
                opcion = menu();
                switch (opcion) {
                    case 1:
                        calcularBecas();
                        break;
                    case 2:
                        System.out.println("Te has salido del programa.");
                        break;
                    default:
                        System.out.println("Introduce una opción entre 1 y 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un tipo de dato correcto.");
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el fichero.");
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error con la escritura o lectura del fichero.");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error desconocido.");
            }
            } while (opcion != 2);
    }

}