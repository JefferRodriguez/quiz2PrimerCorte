public class Incidencia {
    private static int numIncidencias = 0;
    private int codigo;
    private int puesto;
    private String descripcion;
    private String solucion;
    private boolean resuelta;

    // Constructor
    public Incidencia(int puesto, String descripcion) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.codigo = ++numIncidencias;
        this.resuelta = false;
        this.solucion = "";
    }

    public static String getPendientes() {
    }

    // Método para resolver una incidencia
    public void resuelve(String solucion) {
        this.solucion = solucion;
        this.resuelta = true;
    }

    // Método para obtener el estado de la incidencia
    public String getEstado() {
        if (resuelta) {
            return "Resuelta - " + solucion;
        } else {
            return "Pendiente";
        }
    }


    public static Object getIncidencia(int codigo) {
        // Verifica que el código sea válido
        if (codigo <= 0 || codigo > numIncidencias) {

        }
        return codigo;
    }


    public String toString() {
        return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + descripcion + " - " + getEstado();
    }
}

