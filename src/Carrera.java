package src;



import java.util.List;

public class Carrera {
    private String fecha;
    private Circuito circuito; // Relación con Circuito
    private List<Piloto> listaPilotos; // Relación con varios pilotos (participantes)

    public Carrera(String fechaCarrera, Circuito circuito, List<Piloto> listaPilotos) {
        this.fecha = fechaCarrera;
        this.circuito = circuito;
        this.listaPilotos = listaPilotos;
    }

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public List<Piloto> getListaPilotos() {
        return listaPilotos;
    }

    public void setListaPilotos(List<Piloto> listaPilotos) {
        this.listaPilotos = listaPilotos;
    }

    @Override
    public String toString() {
        return "Carrera{" + "fecha=" + fecha + ", circuito=" + circuito + ", listaPilotos=" + listaPilotos + "}";
    }
}
