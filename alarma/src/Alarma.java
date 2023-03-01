public class Alarma {
    protected boolean vidrioRoto;
    protected boolean accesoAbierto;
    protected boolean movimiento;

    public Alarma () {
        vidrioRoto = false;
        accesoAbierto = false;
        movimiento = false;
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

    public void comprobar() {
        if (vidrioRoto || accesoAbierto || movimiento) {
            //Timbre.hacerSonar();
        }
    }

    public void agregarSensor(Sensor s1) {
    }

}