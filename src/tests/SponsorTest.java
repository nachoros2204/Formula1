package src.tests;

import org.junit.Test;
import src.Equipo;
import src.Sponsor;
import src.SponsorContrato;

import java.util.Date;

import static org.junit.Assert.*;

public class SponsorTest {

    @Test
    public void testAgregarSponsor() {
        // Crear equipo y sponsor
        Equipo equipo = new Equipo("Ferrari");
        Sponsor sponsor = new Sponsor("Shell");

        // Crear contrato y agregarlo al equipo
        SponsorContrato contrato = new SponsorContrato(sponsor, "Coche", new Date());
        equipo.agregar(contrato);

        // Verificar que el sponsor ha sido agregado
        assertEquals(1, equipo.getSponsors().size());
        assertEquals("Shell", equipo.getSponsors().get(0).getSponsor().getNombre());
    }

    @Test
    public void testRemoverSponsor() {
        // Crear equipo y sponsor
        Equipo equipo = new Equipo("Ferrari");
        Sponsor sponsor = new Sponsor("Shell");

        // Crear contrato y agregarlo al equipo
        equipo.agregar(sponsor, "Coche", new Date());

        // Remover sponsor por nombre
        equipo.remover("Shell");

        // Verificar que el sponsor ha sido removido
        assertTrue(equipo.getSponsors().isEmpty());
    }
}
