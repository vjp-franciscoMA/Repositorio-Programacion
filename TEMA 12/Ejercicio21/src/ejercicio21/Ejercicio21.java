/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {
    public static final String FICHERO = "asignaturas.obj";
    
    public static void escribirAsignaturas(String[] nombresAsignaturas) throws InputMismatchException, FileNotFoundException, ClassNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);
        
        try(
                FileOutputStream fos = new FileOutputStream(FICHERO);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            for(int i = 0; i < nombresAsignaturas.length; i++) {
                System.out.print("Por favor, introduzca la nota de "+nombresAsignaturas[i]+": ");
                float nota = entrada.nextFloat();
                entrada.nextLine();
                
                oos.writeObject(new Asignatura(nombresAsignaturas[i], nota));
            }
        }
        
        System.out.println("*** Notas almacenadas en el fichero ***");
    } 
    
    public static void leerAsignaturas() throws FileNotFoundException, ClassNotFoundException, IOException {
        float suma = 0;
        int contador = 0;

        try(
                FileInputStream fis = new FileInputStream(FICHERO);
                ObjectInputStream ois = new ObjectInputStream(fis);
                
        ) {
            Asignatura asignatura;
            
            while(true) {
                asignatura = (Asignatura) ois.readObject();
                
                suma = suma + asignatura.getNota();
                contador++;
            } 
        } catch(EOFException e) {
            System.out.println("...Leyendo el fichero y calculando media...");
        }
        
        float media = suma / contador;
        System.out.println("Su nota media del curso es de: "+media+"");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombresAsignaturas = {"Programación","Lenguajes de Marcas","Bases de Datos","Entornos de Desarrollo","Sistemas Informáticos","Formación y Orientación Laboral"};
        try {

            escribirAsignaturas(nombresAsignaturas);
            leerAsignaturas();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: Clase no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: Error de escritura o lectura.");
        }
    }
    
}
