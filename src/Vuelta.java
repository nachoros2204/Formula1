package src;

public class Vuelta {
    private Piloto piloto;
    private Equipo equipo;
    private Circuito circuito;
    private double tiempo; 

    public Vuelta(Piloto piloto, Equipo equipo, Circuito circuito, double tiempo) {
        this.piloto = piloto;
        this.equipo = equipo;
        this.circuito = circuito;
        this.tiempo = tiempo;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public double getTiempo() {
        return tiempo;
    }
}
