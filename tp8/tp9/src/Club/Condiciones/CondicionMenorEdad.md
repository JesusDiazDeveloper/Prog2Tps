
public CondicionMayorEdad(){
    private int edadMinima;

    public CondicionMenorEdad(int edad){
        this.edadMinima = edad;
    }

    @Override
    public boolean seCumple(Socio s)
        return this.edadMinima<=s.getEdad();
}