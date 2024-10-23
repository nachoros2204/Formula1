package src;

import java.util.Date;

public class SponsorContrato {
    private Sponsor sponsor;
    private String ubicacion;
    private Date fechaDesde;
    private Date fechaHasta;
    


    public SponsorContrato(Sponsor sponsor, String ubicacion, Date fechaDesde) {
        this.sponsor = sponsor;
        this.ubicacion = ubicacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = null;
        
    }


    public String getUbicacion() {
        return ubicacion;
    }


    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    public Date getFechaDesde() {
        return fechaDesde;
    }


    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }


    public Date getFechaHasta() {
        return fechaHasta;
    }


    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }


    public Sponsor getSponsor() {
        return sponsor;
    }


    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    

    
}
