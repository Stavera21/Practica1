package paquete1;

import java.util.HashMap;

public class Notas {

    private HashMap<Estudiante, Double> notas;

    public Notas() {
        this.notas = new HashMap<>();
    }

    public void agregar_nota(Estudiante estudiante, double nota) {
        notas.put(estudiante, nota);
    }

    public Double consultar_nota(Estudiante estudiante) {
        return notas.get(estudiante);
    }
}
