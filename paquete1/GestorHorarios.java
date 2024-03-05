package paquete1;

import java.util.ArrayList;

public class GestorHorarios {

    private final ArrayList<Horario> horarios;

    public GestorHorarios () {
        this.horarios = new ArrayList<>();
    }

    public void agregar_horario(Horario horario) {
        horarios.add(horario);
    }

    public Horario buscar_horario(String hora_inicio, String hora_final) {
        for (Horario horario : horarios) {
            if(horario.getHora_inicio().equals(hora_inicio) && horario.getHora_final().equals(hora_final)) {
                return horario;
            }
        }
        return null;
    }

}
