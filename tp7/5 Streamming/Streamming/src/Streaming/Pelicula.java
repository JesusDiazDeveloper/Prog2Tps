package Streaming;

import java.util.ArrayList;
import Streaming.Condiciones.*;;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String>generos;
    private String director;
    private ArrayList<String>autores;
    private int anioDeEstreno;
    private int duracion;
    private int edadMinima;
    

    public Pelicula(String titulo, String sinopsis, String director,int anioDeEstreno, int duracion, int edadMinima, Condicion condEsRentable) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.generos = new ArrayList<String>();
        this.director = director;
        this.autores = new ArrayList<String>();;
        this.anioDeEstreno = anioDeEstreno;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public ArrayList<String> getGeneros() {
        return new ArrayList<>(generos);
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores);
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public int getAnioDeEstreno() {
        return anioDeEstreno;
    }

    public void setAnioDeEstreno(int anioDeEstreno) {
        this.anioDeEstreno = anioDeEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }




    
    
}
