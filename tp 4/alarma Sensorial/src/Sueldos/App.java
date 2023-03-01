package Sueldos;

public class App {
    public static void main (String []args){
        Empresa empresa = new Empresa();

        Empleado e1 = new Empleado("jess", 1000);
        Empleado e2 = new EmpleadoComision("Flor", 1000, 12000);
        Empleado e3 = new EmpleadoExtras("Dani", 1000, 300);
    
        empresa.addEmpleado(e3);
        empresa.addEmpleado(e2);
        empresa.addEmpleado(e1);

        System.out.println(empresa.showEmpleados());

    }   

}
