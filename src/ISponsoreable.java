package src;

import java.util.List;
import java.util.Date;

public interface ISponsoreable {
    List <SponsorContrato> getSponsors();
    void agregar(SponsorContrato contrato);
    void agregar(Sponsor sponsor, String ubicacion, Date fechaDesde);
    void remover(Sponsor sponsor);
    void remover(String sponsorNombre);
    void remover(Sponsor sponsor, String ubicacion);
    boolean sponsorsHabilitados();
}
