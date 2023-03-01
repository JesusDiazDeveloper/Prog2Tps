package Streaming.Condiciones;

import Streaming.Pelicula;

public class CondicionDuracionMenor extends Condicion {
    private int duracionMaxima;

    public CondicionDuracionMenor(int duracion){
        this.duracionMaxima = duracion;
    }

    @Override
    public boolean seCumple(Pelicula p){
        return p.getDuracion()<this.duracionMaxima;
    }
}
