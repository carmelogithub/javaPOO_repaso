package teoria;

import java.util.Date;

public class Principal {
    public static void main(String[] args){

        //instanciar - crear un objeto- en memoria basado en una plantilla que es la class Empleado
        //crear una instancia de la clase
        Empleado emp1 = new Empleado("Juan", "123456789", new Date());
        System.out.println("El nombre del empleado 1 es "+emp1.getNombre());
        System.out.println("Detalle de empleado "+emp1.toString());

        EmpleadoTC emp2 = new EmpleadoTC("Pedro", "987654321", new Date(), "Indefinido");
        System.out.println(emp2.toString());

    }//cierra ejecutable main - arranca Thread en Java
}
