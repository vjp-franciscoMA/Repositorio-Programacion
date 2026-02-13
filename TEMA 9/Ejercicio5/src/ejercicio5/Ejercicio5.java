/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nombre de un día de la semana:");
        String dia = entrada.nextLine();
        
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        int i = 0;
        boolean encontrado = false;
        
        while(i < diasSemana.length && !encontrado) {
            if(diasSemana[i].equalsIgnoreCase(dia)) {
                encontrado = true;
            }
            else {
                i++;
            }
        }
        
        String[] posiciones = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "séptimo"};
        if(encontrado == true) {
            System.out.println("Es el "+posiciones[i]+" día de la semana.");
        }
        else {
            System.out.println("No se ha encontrado el día de la semana.");
        }
}
}
