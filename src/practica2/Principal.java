package practica2;

public class Principal {
    public static void main(String[] args) {
        Cliente c = new Cliente("Juan", "Madrid", "juan@gmail.com","nuevo cliente");
        System.out.println("Datos del cliente: "+c.toString(c));
        System.out.println("Datos del cliente: "+c.toString());//funciona porque los atributos Persona son protected
        Empleado emp1= new Empleado("marta","Sevilla","marga@gmail.com",4500.95,"parcial");
        String ficha_empleado=emp1.toString();
        System.out.println("Datos del empleado: "+ficha_empleado);
    }//cierra main
}
