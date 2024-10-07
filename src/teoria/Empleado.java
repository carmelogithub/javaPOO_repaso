package teoria;

import java.util.Date;

public class Empleado {

    private String nombre;
    private String telefono;
    private Date fecha_alta;

    //constructor

    public Empleado(String n, String t, Date f) {
        this.nombre = n;
        this.telefono = t;
        this.fecha_alta = f;
    }


    //métodos para acceder a los atributos - getters y setters


    public String getNombre() {
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) { //update
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    //método toString que es resumen


    @Override
    public String toString() { //puedes acceder a los atributos privados porque estás en la misma clase
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fecha_alta=" + fecha_alta +
                '}';
    }
}//cierra class
