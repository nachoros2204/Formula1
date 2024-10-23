package src.filtros;

import java.util.List;
import java.util.stream.Collectors;

import src.Circuito;
import src.Vuelta;

public class FiltroVuelta {

    // Método para contar las vueltas en un circuito específico
    public long contarVueltasPorCircuito(List<Vuelta> listaVueltas, Circuito circuito) {
        return listaVueltas.stream()
                .filter(vuelta -> vuelta.getCircuito().equals(circuito))
                .count();
    }

    // Método para obtener la lista de vueltas en un circuito específico
    public List<Vuelta> obtenerVueltasPorCircuito(List<Vuelta> listaVueltas, Circuito circuito) {
        return listaVueltas.stream()
                .filter(vuelta -> vuelta.getCircuito().equals(circuito))
                .collect(Collectors.toList());
    }
}
