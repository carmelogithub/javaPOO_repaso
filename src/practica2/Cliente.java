package practica2;

public class Cliente extends Persona{

    private String tipo;

    public Cliente(String nombre, String ciudad, String correo, String tipo) {
        super(nombre, ciudad, correo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String pagar(){
        return "Pagando...";
    }
    public String pagar(String tipo){ //ejemplo de sobrecarga
        return "Pagando...por "+tipo;
    }


    public String toString(Persona p) {//Persona puede ser un Cliente. Lo es porque son padre-hija
        return "Cliente{" +
                "nombre='" +  p.getNombre()+ '\'' +
                ", ciudad='" + p.getCiudad() + '\'' +
                ", correo='" + p.getCorreo() + '\'' +
                "tipo='" + tipo + '\'' +
                '}';
    }

    //es un método sobreescrito del padre pero también sobrecargdo porque en Cliente ya hay un método toString
    public String toString() {//Persona puede ser un Cliente. Lo es porque son padre-hija
        return "Cliente{" +
                "nombre='" +  nombre+ '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", correo='" + correo + '\'' +
                "tipo='" + tipo + '\'' +
                '}';
    }

}
