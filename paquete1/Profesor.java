package paquete1;

import java.util.ArrayList;

public class Profesor extends Usuario{
    public Profesor(String nombre, String apellido, String correo, String tipo_usuario){
        super(nombre, apellido, correo, tipo_usuario);
        ArrayList<Cursos> cursos = new ArrayList<Cursos>();
    }
}
