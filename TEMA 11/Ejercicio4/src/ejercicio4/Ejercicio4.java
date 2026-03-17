/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        Set<String> hashSetMeses = new HashSet<>();
        Set <String> linkedHashSetMeses = new LinkedHashSet<>();
        
        for (String mes : meses) {
            hashSetMeses.add(mes);
        }
        
        for (String mes : meses) {
            linkedHashSetMeses.add(mes);
        }
        
        System.out.println("HashSet:");
        for (String mes : hashSetMeses) {
            System.out.println(mes);
        }
        
        System.out.println();
        
        System.out.println("LinkedHashSet:");
        for (String mes : linkedHashSetMeses) {
            System.out.println(mes);
        }
    }
    
}
