package src.filtros;

import java.util.List;
import java.util.stream.Collectors;

import src.Equipo;
import src.Piloto;

public class FiltroCarrera {

    // Método para contar los pilotos de un equipo específico
    public long contarPilotosPorEquipo(List<Piloto> listaPilotos, Equipo equipo) {
        return listaPilotos.stream()
                .filter(piloto -> piloto.getEquipo().equals(equipo))
                .count();
    }

    // Método para obtener la lista de pilotos de un equipo específico
    public List<Piloto> obtenerPilotosPorEquipo(List<Piloto> listaPilotos, Equipo equipo) {
        return listaPilotos.stream()
                .filter(piloto -> piloto.getEquipo().equals(equipo))
                .collect(Collectors.toList());
    }
}
