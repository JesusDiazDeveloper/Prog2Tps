package Streaming;

import java.util.ArrayList;

import Streaming.Condiciones.Condicion;

public class Plataforma {
    private ArrayList<Pelicula> peliculas;
    private Condicion condRentable;

    public Plataforma(){
        this.peliculas = new ArrayList<>();
        this.condRentable = null;
    }

    public void addPelicula(Pelicula p){
        if(!peliculas.contains(p))
            peliculas.add(p);
    }   

    public ArrayList<Pelicula> Buscar(Condicion cond){
        ArrayList <Pelicula> resultado = new ArrayList<>();
        for(Pelicula p: peliculas){
            if(cond.seCumple(p)){
                resultado.add(p);
            }
        }
        return resultado;
    }

    public boolean condRentable(Pelicula p){
        if(condRentable != null){
            if(condRentable.seCumple(p))
                return true;
        }
        return false;
    }
    public void setCondRentable ( Condicion c ){
        this.condRentable = c;
    }
}
