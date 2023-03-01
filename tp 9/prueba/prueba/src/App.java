import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList <String> prueba = new ArrayList <String> ();

        prueba.add("Hola");


        ArrayList <String> prueba2 = new ArrayList <String>(prueba);

        prueba.remove(0);

        System.out.println(prueba);
        System.out.println("/////////////////////////////////////////");
        System.out.println(prueba2);




    }
}
