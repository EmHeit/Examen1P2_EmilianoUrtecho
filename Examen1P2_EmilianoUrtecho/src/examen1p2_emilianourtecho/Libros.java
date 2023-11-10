
package examen1p2_emilianourtecho;

import java.util.ArrayList;

public class Libros {
    private String titulo;
    private String autor;
    private double precio;
    private int edicion;
    
    public Libros() {
    }

    public Libros(String titulo, String autor, double precio, int edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n\n"
              +"Autor: " + autor + "\n\n"
              +"Edicion: " + edicion + "\n\n"
              +"Precio: " + precio;
    }
    
    
}
