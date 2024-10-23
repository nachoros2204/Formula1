package src.tests;

import org.junit.Test;
import src.Equipo;
import src.Piloto;
import static org.junit.Assert.*;
import java.util.List;  

public class EquipoTest {

    @Test
    public void testAgregarPilotoAlEquipo() {
        // Crear equipos
        Equipo equipo1 = new Equipo("Red Bull Racing");
        Equipo equipo2 = new Equipo("Williams");  

        // Crear pilotos
        Piloto piloto1 = new Piloto("Franco Colapinto", "Argentina");
        Piloto piloto2 = new Piloto("Max Verstappen", "Holanda");
        Piloto piloto3 = new Piloto("Sergio Pérez", "México");

        // Agregar pilotos al equipo
        equipo2.agregarPilotos(piloto1);
        equipo1.agregarPilotos(piloto2);
        equipo1.agregarPilotos(piloto3);


        // Obtener la lista de pilotos
        List<Piloto> listapilotosEquipo1 = equipo1.getListapilotos();  
        List<Piloto> listapilotosEquipo2 = equipo2.getListapilotos(); 


        // Verificar que las listas contienen los pilotos agregados
        assertEquals(2, listapilotosEquipo1.size());
        assertEquals(1, listapilotosEquipo2.size());

        // Verificar nombres y nacionalidades correctos
        assertEquals("Franco Colapinto", listapilotosEquipo2.get(0).obtenerNombre());
        assertEquals("Argentina", listapilotosEquipo2.get(0).obtenerNacionalidad());


        assertEquals("Max Verstappen", listapilotosEquipo1.get(0).obtenerNombre());
        assertEquals("Holanda", listapilotosEquipo1.get(0).obtenerNacionalidad());
        assertEquals("Sergio Pérez", listapilotosEquipo1.get(1).obtenerNombre());
        assertEquals("México", listapilotosEquipo1.get(1).obtenerNacionalidad());

        // Verificar pilotos que pertenecen al equipo
        assertTrue(listapilotosEquipo2.contains(piloto1));
        assertTrue(listapilotosEquipo1.contains(piloto2));
        assertTrue(listapilotosEquipo1.contains(piloto3));
    }

    
}
    