package examen1p2_emilianourtecho;

import java.util.ArrayList;

public class Administrador {
    private String usuario = "lib123";
    private String password = "321lib" ;
    private ArrayList<Libros> libro = new ArrayList();
    
    public void PublicarLibros(Libros libros){
        libro.add(libros);
    }
    public void ListarLibros(){
        
    }
    
}
