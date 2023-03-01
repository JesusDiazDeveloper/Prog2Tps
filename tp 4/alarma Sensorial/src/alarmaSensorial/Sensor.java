package alarmaSensorial;
public class Sensor {
    
    private String zona;
    protected boolean vidrioRoto;
    protected boolean accesoAbierto;
    protected boolean movimiento;




    public Sensor(String zona) {
        this.zona = zona;
        this.vidrioRoto = false;
        this.accesoAbierto = false;
        this.movimiento = false;
    }

    public boolean comprobar(){
        if (vidrioRoto || accesoAbierto || movimiento) {
            return true;
        }
        else 
            return false;
    }

    public String getZona(){
        return this.zona;
    }

    public boolean equals (Object o1 ){
        try {
        Sensor s1 = ((Sensor) o1);
            return s1.getZona().equals(this.getZona());
        } catch (Exception e) {
            return false;
        }
    }











    public void setVidrioRoto(boolean estaRoto) {
        this.vidrioRoto = estaRoto;
    }

    public void setAccesoAbierto(boolean accesoAbierto) {
        this.accesoAbierto = accesoAbierto;
    }

    public void setMovimiento(boolean hayMovimiento) {
        this.movimiento = hayMovimiento;
    }

}
