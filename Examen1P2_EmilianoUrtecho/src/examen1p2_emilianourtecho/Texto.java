package examen1p2_emilianourtecho;


public class Texto extends Libros{
    private int curso;
    private String facultad;

    public Texto() {
    }

    public Texto(int curso, String facultad, String titulo, String autor, double precio, int edicion) {
        super(titulo, autor, precio, edicion);
        this.curso = curso;
        this.facultad = facultad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Curso: " + curso + "\n\n"
              +"Facultad: " + facultad;
    }
    
    
}
