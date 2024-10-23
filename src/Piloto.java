package src;


public class Piloto extends Persona {

    public Piloto(String nombre, String nacionalidad) {
        super(nombre, nacionalidad);
    }

    @Override
    public String toString() {
        return obtenerNombre() + " (" + obtenerNacionalidad() + ")";
    }

}
