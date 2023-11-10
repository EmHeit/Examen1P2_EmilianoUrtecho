
package examen1p2_emilianourtecho;

public class Referencias extends Libros{
    protected String tipo;

    public Referencias() {
    }

    public Referencias(String tipo, String titulo, String autor, double precio, int edicion) {
        super(titulo, autor, precio, edicion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Tipo: " + tipo;
    }
    
    
}
