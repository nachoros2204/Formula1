package src;


public class Mecanico extends Persona {

    public Mecanico(String nacionalidad, String nombre) {
        super(nacionalidad, nombre);
    }
    
    @Override
    public String toString() {
        return obtenerNombre() + " (" + obtenerNacionalidad() + ")";
    }

    @Override
    public String getNombreParaLED() {
        return super.getNombreParaLED();
    }

}
