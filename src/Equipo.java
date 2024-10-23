package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Equipo implements ISponsoreable {
    private String nombre;
    private List<Piloto> listapilotos;
    private List<SponsorContrato> sponsors;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listapilotos = new ArrayList<>();
        this.sponsors = new ArrayList<>();
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

    @Override
    public List<SponsorContrato> getSponsors() {
        return sponsors;
    }

    @Override
    public void agregar(SponsorContrato contrato) {
        sponsors.add(contrato);
    }

    @Override
    public void agregar(Sponsor sponsor, String ubicacion, Date fechaDesde) {
        SponsorContrato contrato = new SponsorContrato(sponsor, ubicacion, fechaDesde);
        sponsors.add(contrato);
    }

    @Override
    public void remover(Sponsor sponsor) {
        sponsors.removeIf(contrato -> contrato.getSponsor().equals(sponsor));
    }

    @Override
    public void remover(String sponsorNombre) {
        sponsors.removeIf(contrato -> contrato.getSponsor().getNombre().equals(sponsorNombre));
    }

    @Override
    public void remover(Sponsor sponsor, String ubicacion) {
        sponsors.removeIf(contrato -> contrato.getSponsor().equals(sponsor) && contrato.getUbicacion().equals(ubicacion));
    }

    @Override
    public boolean sponsorsHabilitados() {
        return !sponsors.isEmpty();
    }
}
}
