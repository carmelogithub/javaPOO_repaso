package practica2;

public abstract class Persona { //no puede ser instanciada

protected String nombre;//los puedes usar en tu clase en tus hijas
protected String ciudad;
protected String correo;

    public Persona(String nombre, String ciudad, String correo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
