package teoria;

import java.util.Date;

public class EmpleadoTC extends Empleado {

    private String tipo_contrato;

    public EmpleadoTC(String n, String t, Date f, String tc) {
        super(n, t, f); //enviar atributos a la clase padre
        this.tipo_contrato = tc;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    @Override
    public String toString() {
        return "EmpleadoTC{" +
                "nombre='" + getNombre() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", fecha_alta=" + getFecha_alta() +
                ", tipo_contrato='" + tipo_contrato + '\'' +
                '}';
    }
}//cierra clase
