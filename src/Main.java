import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Incidencia> listaIncidencias = new ArrayList<>();

        // Agregar incidencias a la lista
        listaIncidencias.add(new Incidencia(105, "No tiene acceso a internet"));
        listaIncidencias.add(new Incidencia(14, "No arranca"));
        listaIncidencias.add(new Incidencia(5, "La pantalla se ve rosa"));
        listaIncidencias.add(new Incidencia(237, "Hace un ruido extraño"));
        listaIncidencias.add(new Incidencia(111, "Se cuelga al abrir 3 ventanas"));


        listaIncidencias.get(1).resuelve("El equipo no estaba enchufado");
        listaIncidencias.get(2).resuelve("Cambio del cable VGA");


        int numIncidencia = 1;
        for (Incidencia incidencia : listaIncidencias) {
            System.out.println("Incidencia " + numIncidencia + " - " + incidencia);
            numIncidencia++;
        }

        System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
    }
    }
