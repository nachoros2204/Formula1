package src;
public class Persona {
    String nombre;
    String nacionalidad;

    public Persona(String nacionalidad, String nombre) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    


}
