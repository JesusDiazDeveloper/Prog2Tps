package Sueldos;

public class Empleado {
//     Una empresa de informática posee tres tipos de empleados. 
// Los empleados contratados reciben un salario fijo semanal, sin importar 
// la cantidad de horas trabajadas. 

    protected String nombre;
    protected  int salario; 

    public Empleado ( String nombre , int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals (Object o1) {
        try{
            Empleado e1 = ((Empleado )o1);
            return this.getNombre().equals(e1.getNombre());
        }
        catch (Exception e){
            return false;
        }
    }

    public String toString (){
        return this.getNombre() + " , Salario: "+ this.getSalario();
    }
}