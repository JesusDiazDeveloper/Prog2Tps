package HistoriadorPack;
import java.util.ArrayList;

public class Documento{
    private String titulo;
    private ArrayList <String> autores;
    private String contenidoTextual;
    private ArrayList <String> palabrasClave;

    public Documento (String titulo, String autor, String contenido, String palabraClave){
        this.titulo = titulo;
        setAutores(autor);
        this.palabrasClave = new ArrayList<>();
        this.contenidoTextual = contenido;
   }
    
    public void setAutores(String autor){
        if(!this.autores.contains(autor)){
            autores.add(autor);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList <>(this.autores);
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public void setContenidoTextual(String contenidoTextual) {
        this.contenidoTextual = contenidoTextual;
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    public void setPalabrasClave(ArrayList<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public boolean equals (Object o1){
        try {
            Documento d1 = (Documento)o1;
            return this.getTitulo().equals(d1.getTitulo())&&this.getAutores().equals(d1.getAutores());
        } catch (Exception e) {
            return false;
        }
    }
}
