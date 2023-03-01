import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Puerto puerto = new Puerto(); 
        Camion c1 = new Camion(LocalDate.of(2022,1,16),"AAA111");
        Camion c2 = new Camion(LocalDate.of(2022,2,16),"BBB333");
        Camion c3= new Camion(LocalDate.of(2022,2,16),"CCC333");

        Barco b1 = new Barco(100," Jack", "Perla Negra");
        Barco b2 = new Barco(200," 2do Capitan", "Perla Roja");
        Barco b3 = new Barco(330," 3er Capitan", "Perla Blanca");

        puerto.addCamion(c1);
        puerto.addCamion(c2);
        puerto.addCamion(c3);
        puerto.addBarco(b1);
        puerto.addBarco(b2);
        puerto.addBarco(b3);
        System.out.println(puerto.getBarcos());
        System.out.println(puerto.getCamiones());
        System.out.println(puerto.cargarBarco());

    }
}
