package examen1p2_emilianourtecho;


public class Texto extends Libros{
    private String curso;
    private String facultad;

    public Texto() {
    }

    public Texto(String curso, String facultad, String titulo, String autor, double precio, int edicion) {
        super(titulo, autor, precio, edicion);
        this.curso = curso;
        this.facultad = facultad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
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
