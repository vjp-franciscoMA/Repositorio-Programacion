/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author fmont
 */
public class Libro implements Transformable{
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private String genero;
    
    // CONSTRUCTORES
    // Por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.genero = "";
    }
    // Parametrizado
    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    // GETTERS Y SETTERS
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    // MÉTODOS
    @Override
    public String concatenarTodo() {
        return titulo + "#" + autor + "#" + genero;
    }

    @Override
    public String obtenerIniciales() {
        return "" + titulo.charAt(0) + autor.charAt(0) + genero.charAt(0);
    }

    @Override
    public void contarVocales() {
        
    }
    
    @Override
    public String obtenerCadenaMasLarga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean buscarCadena() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + '}';
    }
    
    
    
    
}
