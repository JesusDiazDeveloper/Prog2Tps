public abstrac class Elemento{

    public abstract int getCantidadDeNoticias();
    
    public abstract Elemento copiaRestringida(Condicion c);

    public abstract  ArrayList <Noticia> Buscar(Condicion c);

    public abstract ArrayList <String> obtenerMapa();
} 