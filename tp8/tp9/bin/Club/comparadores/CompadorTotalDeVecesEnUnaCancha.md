public CompadorTotalDeVecesEnUnaCancha{

    private int ID;

    public CompadorTotalDeVecesEnUnaCancha(int ID){
        this.ID = ID;
    }

    @Override
    public int compare(Socio s1, Socio s2){
        return s1.cantidadDeVecesEnUnaCancha(ID) - s2.cantidadDeVecesEnUnaCancha(ID);
    }
}