package alarmaSensorial;

public class App {
    public static void main(String[] args) {
        

        Alarma alarma = new Alarma();

        Sensor s1 = new Sensor ("cocina");
        Sensor s2 = new Sensor ("pieza");
        
        alarma.agregarSensor(s1);
        alarma.agregarSensor(s2);

        alarma.comprobar();
        s2.setAccesoAbierto(true);
        s1.setMovimiento(true);
        alarma.comprobar();
        
    }
}
