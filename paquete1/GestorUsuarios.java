package paquete1;
import java.util.ArrayList;

public class GestorUsuarios {
    public static void Gestor_Usuarios(String [] args) {
        Consola consola  = new Consola();


        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Administrativo> administrativos = new ArrayList<>();


        String nombre = consola.obtener_nombre();
        String apellido = consola.obtener_apellido();
        String correo = consola.obtener_correo();
        String tipo_usuario = consola.obtener_TipoUsuario();



       switch (tipo_usuario) {
           case "Estudiante":

               Estudiante estudiante = new Estudiante(nombre, apellido, correo, tipo_usuario);
                    estudiantes.add(estudiante);

               if (estudiantes.contains(estudiante)) {
                   System.out.println("El Estudiante fue registrado con exito!");
               } else {
                   System.out.println("Error al registrar el Estudiante al sistema");
               }
               break;

           case "Profesor":

               Profesor profesor = new Profesor(nombre, apellido, correo, tipo_usuario);
                    profesores.add(profesor);

               if (profesores.contains(profesor)) {
                   System.out.println("El Profesor fue registrado con exito!");
               } else {
                   System.out.println("Error al registar al Profesor en el sistema");
               }
               break;

           case "Administrativo":

               Administrativo administrativo = new Administrativo(nombre, apellido, correo, tipo_usuario);
                    administrativos.add(administrativo);

               if (administrativos.contains(administrativo)) {
                   System.out.println("El Administrativo fue registrado con exito!");
               } else{
                   System.out.println("Erros al registar el Administrativo");
               }
               break;
           default:
               System.out.println("Tipo de usuario no valio, por favor ingresar uno valido: Estudiante / Profesor / Administrativo");
               break;
       }
    }
}

