package src;

import java.util.ArrayList;
import java.util.List;


public class Equipo {
    private String nombre;
    private List<Piloto> listapilotos = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarPilotos(Piloto piloto) {
        listapilotos.add(piloto);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Piloto> getListapilotos() {
        return listapilotos;
    }


}
