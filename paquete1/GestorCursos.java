package paquete1;
import paquete1.Consola;
import java.util.ArrayList;

public class GestorCursos {
    private final ArrayList<Cursos> cursos;


    public GestorCursos() {
        this.cursos = new ArrayList<>();
    }

   public void agregar_curso(Cursos curso, Usuario usuario ) {

        if (usuario instanceof Administrativo) {
            cursos.add(curso);
            System.out.println("El curso ha sido creado con exito!");
        } else {
            System.out.println("Solo los Administrativos pueden agregar cursos.");
        }
   }
}




