/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        Map<Integer, String> treeMapMeses = new TreeMap<>();
        Map<Integer, String> linkedHashMapMeses = new LinkedHashMap<>();
        
        for(int i = meses.length - 1; i >= 0; i--) {
            int numero = i + 1;
            treeMapMeses.put(numero, meses[i]);
        }
        
        for(int i = meses.length - 1; i >= 0; i--) {
            int numero = i + 1;
            linkedHashMapMeses.put(numero, meses[i]);
        }
        
        System.out.println("TreeMap:");
        for (Map.Entry<Integer, String> mapa : treeMapMeses.entrySet()) {
            System.out.println(mapa.getKey() + " - " + mapa.getValue());
        }
        
        System.out.println();
        
        for (Map.Entry<Integer, String> mapa : linkedHashMapMeses.entrySet()) {
            System.out.println(mapa.getKey() + " - " + mapa.getValue());
        }
    }
    
}
