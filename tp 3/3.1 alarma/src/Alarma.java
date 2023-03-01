public class Alarma {
    protected boolean vidrioRoto;
    protected boolean accesoAbierto;
    protected boolean movimiento;
    protected Timbre timbre;


    public Alarma () {
        vidrioRoto = false;
        accesoAbierto = false;
        movimiento = false;
        timbre = new Timbre();
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
            timbre.sonar();
        }
    }

}