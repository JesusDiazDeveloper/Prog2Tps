package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondicionGenero extends Condicion{
    private String genero;

    public CondicionGenero(String genero){
        this.genero = genero;
    }
    
    @Override
    public boolean seCumple(Pelicula p ){
        return p.getAutores().contains(this.genero);
    }
}
