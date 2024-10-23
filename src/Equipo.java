package src;

import java.util.ArrayList;
import java.util.List;


public class Equipo {
    private String nombre;
    private List<Piloto> listapilotos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listapilotos = new ArrayList<>();
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
