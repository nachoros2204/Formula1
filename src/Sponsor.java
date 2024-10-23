package src;

import src.interfaces.INombreParaLED;

public class Sponsor implements INombreParaLED {
    private String nombre;

    public Sponsor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombreParaLED() {
        return "Sponsor:" + nombre;
    }

    
}
