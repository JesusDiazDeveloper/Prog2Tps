public class Noticia extends Elemento{

    private String titulo;
    private String introduccion;
    private ArrayList<String> palabrasClave;
    private String texto;

    public Noticia (String titulo, String introduccion, String PalabraClave, String
    texto){
        this.titulo=titulo;
        this.introduccion=introduccion;
        this.palabrasClave = new ArrayList <>();
        palabrasClave.add(PalabraClave);
        this.texto = texto;
    }
    public Noticia (String titulo, String introduccion, ArrayList <String>palabrasClave, String
    texto){
        this.titulo=titulo;
        this.introduccion=introduccion;
        this.palabrasClave = new ArrayList <>();
        palabrasClave.addAll(palabrasClave);
        this.texto = texto;
    }
    

    public getPalabrasClave (){
        return new ArrayList<String>(palabrasClave);
    }

    public int getCantidadDeNoticias(){
        return 1;
    }
    public copiaRestringida(Condicion c){
        if(c.seCumple(this))
            return new Noticia(this.getTitulo(), this.getIntroduccion, this.getPalabrasClave,this.getTexto)
        else 
            return null;
    }

    @Override
    public  ArrayList <Noticia> Buscar(Condicion c){
        ArrayList <Noticia> resultado = new ArrayList <>();
        if (c.seCumple(this))
            resultado.add(this);

        return resultado
    } 

    @Override
    public ArrayList <String> obtenerMapa(){
        return this.getLink()+"\";
    }

    