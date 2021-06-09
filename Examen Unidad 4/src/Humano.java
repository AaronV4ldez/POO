public abstract class Humano {
private String nombre;
private String apellido;
private String direccion;
private int edad;
public Humano(String nombre, String apellido, String direccion, int edad){
this.nombre=nombre;
this.apellido=apellido;
this.direccion=direccion;
this.edad=edad;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
