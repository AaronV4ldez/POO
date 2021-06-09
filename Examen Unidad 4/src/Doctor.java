public class Doctor extends Humano{
    private String rfc;
    private String especialiad;
    public Doctor(String nombre, String apellido, String direccion, int edad, String rfc, String especialiad) {
        super(nombre, apellido, direccion, edad);
        this.rfc=rfc;
        this.especialiad=especialiad;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setEspecialiad(String especialiad) {
        this.especialiad = especialiad;
    }

    public String getEspecialiad() {
        return especialiad;
    }
}
