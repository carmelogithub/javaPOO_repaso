package practica3;

public class Practica {
    public static void main(String[] args){
        Coche coche1= new Coche(1, "Astra", "Opel", 15000);
        Coche coche2 = new Coche(2, "Clio", "Renault", 12000);
        Coche coche3 = new Coche(3, "Ibiza", "Seat", 14000);

        Coche[] coches = {coche1, coche2, coche3};
        System.out.println("Listado de coches");
        for (Coche coche : coches) {
            System.out.println(coche.toString());
            System.out.println("------------------------------");
        }

    }
}
