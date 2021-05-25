public class Dispositivo {
    private String nombre;
    private int ram;
    public String procesador;
    public Dispositivo(String nombre, int  ram, String procesador ){
        this.nombre=nombre;
        this.ram=ram;
        this.procesador=procesador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}
