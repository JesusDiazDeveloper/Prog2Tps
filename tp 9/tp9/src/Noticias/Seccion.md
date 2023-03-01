public class Seccion extends Elemento {

    private String descripcion;
    private String imagen;
    public ArrayList<Elemento> elementos;

    public Seccion(String descripcion, String imagen) {
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.elementos = new ArrayList<>();
    }

    @Override
    public int getCantidadDeNoticias() {
        int cantidad = 0;
        for (Elemento e : elementos)
            cantidad += e.getCantidadDeNoticias();

        return cantidad;
    }

    public void addElemento(Elemento e) {
        // Aca podria controlar repetidos
        this.elementos.add(e);
    }

    private boolean estaVacio() {
        return this.elementos.isEmpty();
    }

    @Override
        public Elemento copiaRestringida(Condicion c){
        Seccion copia = new Seccion (this.getDescripcion(),this.getImagen());
        for (Elemento e : elementos)
        Elemento copiaHijo = e.copiaRestringida(c);
        if(copiaHijo!=null)
        copia.addElemento(copiaHijo)

        if(copia.estaVacio())
        return null;
        else
        return copia
        }

    @Override
        public Buscar(Condicion c);

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public addElemento(Elemento e){
            if(!elementos.contains(e)){
            elementos.add(e);
            }
            }

    @Override
    public ArrayList<Noticia> Buscar(Condicion c) {
        ArrayList<Noticia> resultado = new ArrayList<>();

        for (Elemento e : elementos) {
            resultado.addAll(e.Buscar(C));
        }

        return resultado;

    }

    @Override
    public ArrayList <String> obtenerMapa(){
        return this.getLink()+"\";
        }

    @Override
    public ArrayList <String> obtenerMapa(){
        ArrayList<String> resultado = new ArrayList<>();
        resultado.add(this.getNombre()+\);

        for (Elemento e : elementos)
            resultado.addAll(e.obtenerMapa);

        return resultado;r
    }

}