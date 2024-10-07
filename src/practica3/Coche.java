package practica3;

public class Coche {

    private int id;
    private String modelo;
    private String marca;
    private double precio;

    public Coche(int id, String modelo, String marca, double precio) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}//cierra clase
