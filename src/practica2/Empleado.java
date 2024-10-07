package practica2;

public class Empleado extends Persona{
    private double salario;
    private String tipo_jornada;

    public Empleado(String nombre, String ciudad, String correo, double salario, String tipo_jornada) {
        super(nombre, ciudad, correo);
        this.salario = salario;
        this.tipo_jornada = tipo_jornada;
    }

    public double getSalario() {
        if(this.tipo_jornada=="parcial")
            return Math.round(salario*0.60);
        else
            return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipo_jornada() {
        return tipo_jornada;
    }

    public void setTipo_jornada(String tipo_jornada) {
        this.tipo_jornada = tipo_jornada;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                ", tipo_jornada='" + tipo_jornada + '\'' +
                ", salario en base a la jordada='" + getSalario() + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
