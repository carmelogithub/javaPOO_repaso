package practica;

import java.util.Date;

public class Principal {
    public static void main(String[] args){
        //instanciar la clase Animal
        //Animal animal1 = new Animal("Firulais", "Perro", 4);
        //System.out.println("El nombre del animal es "+animal1.getNombre());
        AnimalParque aguila1= new AnimalParque("Aguila", "Aguila Real", 2, new Date());
        System.out.println("El nombre del animal es "+aguila1.getNombre());
        System.out.println(aguila1.toString());//mostrar el método de la clase hija - uso de sobreescritura
        System.out.println(aguila1.getFecha_nacimiento("mensaje personalizado"));//uso de sobrecarga
    }//cierra main
}
