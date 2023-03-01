public class CondicionTitulo Extends Condicion{

    private String titulo;

    public CondicionTitulo(String titulo){
        this.titulo = titulo;
    } 

    @Override
    public boolean seCumple(Noticia n){
        return this.titulo().equals(n.getTitulo());
    }
}