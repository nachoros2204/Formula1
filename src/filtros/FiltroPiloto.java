package src.filtros;

import java.util.List;
import java.util.stream.Collectors;

import src.Piloto;

public class FiltroPiloto {

    // Método para contar los pilotos de una nacionalidad específica
    public long contarPilotosPorNacionalidad(List<Piloto> listaPilotos, String nacionalidad) {
        return listaPilotos.stream()
                .filter(piloto -> piloto.obtenerNacionalidad().equalsIgnoreCase(nacionalidad))
                .count();
    }

    // Método para obtener la lista de pilotos de una nacionalidad específica
    public List<Piloto> obtenerPilotosPorNacionalidad(List<Piloto> listaPilotos, String nacionalidad) {
        return listaPilotos.stream()
                .filter(piloto -> piloto.obtenerNacionalidad().equalsIgnoreCase(nacionalidad))
                .collect(Collectors.toList());
    }
}
