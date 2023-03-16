public class Incidencia {
    private static int numIncidencias = 0;
    private int codigo;
    private int puesto;
    private String descripcion;
    private String solucion;
    private boolean resuelta;

    public Incidencia() {
    }

    public Incidencia(int puesto, String descripcion) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.codigo = ++numIncidencias;
        this.resuelta = false;
        this.solucion = "";
    }

    public static int getNumIncidencias() {
        return numIncidencias;
    }

    public static void setNumIncidencias(int numIncidencias) {
        Incidencia.numIncidencias = numIncidencias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public boolean isResuelta() {
        return resuelta;
    }

    public void setResuelta(boolean resuelta) {
        this.resuelta = resuelta;
    }

    //Metodo para incidencias pendientes
    public static int getPendientes() {
        return numIncidencias;
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

