package src;


public class Persona {
    private String nombre;
    private String nacionalidad;
    
    //metodo constructor
    public Persona(String nombre, String nacionalidad) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
    }

    //doble encapsulamiento de los getter y setter
    private String getNombre() {
        return nombre;
    }

    private String getNacionalidad() {
        return nacionalidad;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    //metodos publicos de los getter y setters encapsulados
    public String obtenerNombre() {
        return getNombre();
    }

    public void cambiarNombre(String nombre) {
        setNombre(nombre);
    }
    
    public String obtenerNacionalidad() {
        return getNacionalidad();
    }
    
    public void cambiarNacionalidad(String nacionalidad) {
        setNacionalidad(nacionalidad);
    }
    

    

}
