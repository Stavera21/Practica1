package paquete1;


import java.util.ArrayList;
import java.util.HashMap;

public class Estudiante {

    private ArrayList<Cursos> cursos;
    private HashMap<Cursos, Notas> notas;

    public Estudiante(String nombre, String apellido, String correo, String tipo_usuario) {
        super();
        this.cursos = new ArrayList<>();
        this.notas = new HashMap<>();
    }

    public void inscribir_curso(Cursos curso) {
        cursos.add(curso);
        notas.put(curso, new Notas());
    }

    public void salir_curso(Cursos curso) {
        cursos.remove(curso);
        notas.remove(curso);
    }

    public Notas consultar_notas(Cursos curso) {
        return notas.get(curso);
    }

}
