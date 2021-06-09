public class Paciente extends Humano{
private String curp;
private String fecha_cita;
    public Paciente(String nombre, String apellido, String direccion, int edad, String curp, String fecha_cita) {
        super(nombre, apellido, direccion, edad);
        this.curp=curp;
        this.fecha_cita=fecha_cita;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }
}
