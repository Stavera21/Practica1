package paquete1;

import java.util.Scanner;

public class Consola {
    private final Scanner scanner;

    public Consola() {
        this.scanner = new Scanner(System.in);
    }


    public String obtener_nombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    public String obtener_apellido() {
        System.out.print("Ingrese su apellido: ");
        return scanner.nextLine();
    }

    public String obtener_correo() {
        System.out.print("Ingrese su correo: ");
        return scanner.nextLine();
    }

    public String obtener_TipoUsuario() {
        System.out.print("Ingrese que tipo de usuario es: Estudiante/Profesor/Administrativo");
        return scanner.nextLine();
    }
}


    /*
    public String obtener_NombreCurso() {
        System.out.print("Ingrese el nombre del curso");
        return scanner.nextLine();
    }

    public int obtener_horario() {
        System.out.print("Ingrese la hora del curso: ");
        return scanner.nextInt();
    }

    public String obtener_codigoCurso() {
        System.out.println("ingrese el codigo del curso: ");
        return scanner.nextLine();
    }
}

  */
