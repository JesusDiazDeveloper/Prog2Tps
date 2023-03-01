package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondicionTitulo extends Condicion {
    private String titulo;

    public CondicionTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public boolean seCumple(Pelicula p){
        return this.titulo.equals(p.getTitulo());
    }
}
