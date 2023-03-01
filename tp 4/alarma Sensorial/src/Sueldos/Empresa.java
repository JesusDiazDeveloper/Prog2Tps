package Sueldos;

import java.util.ArrayList;

public class Empresa {
    ArrayList <Empleado> empleados;

    public Empresa (){
        this.empleados = new ArrayList <>();
    }

    public void addEmpleado(Empleado empleado){
        if(!this.empleados.contains(empleado))
        this.empleados.add(empleado);
    }
    public ArrayList <Empleado> showEmpleados(){
        return new ArrayList <>(empleados);
    }
}
