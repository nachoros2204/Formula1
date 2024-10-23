package src;


import java.sql.Date;
import java.util.List;

public class Carrera {
    private Date fecha;
    private Circuito circuito; // Relación con Circuito
    private List<Piloto> listaPilotos; // Relación con varios pilotos (participantes)

    public Carrera(Date fecha, Circuito circuito, List<Piloto> listaPilotos) {
        this.fecha = fecha;
        this.circuito = circuito;
        this.listaPilotos = listaPilotos;
    }

    // Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
