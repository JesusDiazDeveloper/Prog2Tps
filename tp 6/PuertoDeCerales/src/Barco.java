public class Barco implements Comparable<Barco> {
    private int capacidad;
    private String Capitan;
    private String nombre;

    public Barco(int capacidad, String capitan, String nombre) {
        this.capacidad = capacidad;
        Capitan = capitan;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Barco otro) {
        return this.getCapacidad() - otro.getCapacidad();
    }

    public void ejecutar() {
        System.out.println("El barco " + this.getNombre() + "se lleno");
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCapitan() {
        return Capitan;
    }

    public void setCapitan(String capitan) {
        Capitan = capitan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Barco [capacidad=" + capacidad + ", Capitan=" + Capitan + ", nombre=" + nombre + "]";
    }
}
