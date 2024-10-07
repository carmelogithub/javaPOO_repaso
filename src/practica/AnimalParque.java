package practica;

import java.util.Date;

public class AnimalParque extends Animal{
    private Date fecha_nacimiento;

    public AnimalParque(String nombre, String especie, int patas, Date fecha_nacimiento) {
        super(nombre, especie, patas);
        this.fecha_nacimiento = fecha_nacimiento;
    }
//ejemplo de sobrecarga. métodos con el mismo nombre pero diferentes parámetros y tipo de retorno
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getFecha_nacimiento(String mensaje) {
        return "la fecha de nacimiento es "+fecha_nacimiento + mensaje;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    //ejemplo de sobreescritura. la clase Padre ya tiene un método igual pero la clase hija quiere matizar el método
    //cuando llamas al método toString, siempre primero el de la hija.
    @Override
    public String toString() {
        return "AnimalParque{" +
                "fecha_nacimiento=" + fecha_nacimiento +
                '}';
    }
}
