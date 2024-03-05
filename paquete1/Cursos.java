package paquete1;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cursos {
    private String nombre;
    private String codigo;
    private ArrayList<Estudiante> estudiantes;

    public Cursos(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = new ArrayList<>();
    }

    public void agregar_estudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void eliminar_estudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}
