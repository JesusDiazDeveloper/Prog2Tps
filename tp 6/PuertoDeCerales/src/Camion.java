import java.time.LocalDate;


public class Camion implements Comparable <Camion> {
    private LocalDate fechaCarga;
    private String patente;

public Camion(LocalDate fechaCarga, String patente) {
        this.fechaCarga = fechaCarga;
        this.patente = patente;
    }

public int compareTo(Camion otro){
    return this.getFechaCarga().compareTo(otro.getFechaCarga());
}


public LocalDate getFechaCarga() {
    return fechaCarga;
}

public void setFechaCarga(LocalDate fechaCarga) {
    this.fechaCarga = fechaCarga;
}

public String getPatente() {
    return patente;
}

public void setPatente(String patente) {
    this.patente = patente;
}

public String toString(){
    return "Patente: " + this.getPatente() + "Fecha de Carga: " + this.getFechaCarga();
}
}