package practica;

public abstract class Animal { //indicar que es una clase abstracta porque NO puede ser instanciada
    private String nombre;
    private String especie;
    private int patas;

    public Animal(String nombre, String especie, int patas) {
        this.nombre = nombre;
        this.especie = especie;
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", patas=" + patas +
                '}';
    }
}//cierra clase
