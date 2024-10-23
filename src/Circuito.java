package src;


public class Circuito {
    private String nombre;
    private double longitud;
    private int vueltasCantidad;

    //constructor
    public Circuito(String nombre, double longitud, int vueltasCantidad) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.vueltasCantidad = vueltasCantidad;
    }

    //getters y setters encapsulados
    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private double getLongitud() {
        return longitud;
    }

    private void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    private int getVueltasCantidad() {
        return vueltasCantidad;
    }

    private void setVueltasCantidad(int vueltasCantidad) {
        this.vueltasCantidad = vueltasCantidad;
    }
    
    //metodos para los getters y setters encapsulados
    public String obtenerNombreCircuito() {
        return getNombre();
    }

    public void cambiarNombreCircuito(String nombre) {
        setNombre(nombre);
    }

    public double obtenerLongitud() {
        return getLongitud();
    }

    public void cambiarLongitud(double longitud) {
        setLongitud(longitud);
    }

    public int obtenerVueltasCantidad() {
        return getVueltasCantidad();
    }

    public void cambiarVueltasCantidad(int vueltasCantidad) {
        setVueltasCantidad(vueltasCantidad);
    }

    @Override
    public String toString() {
        return "Circuito{" + "nombre=" + nombre + ", longitud=" + longitud + ", vueltasCantidad=" + vueltasCantidad + "}";
    }

    
}
