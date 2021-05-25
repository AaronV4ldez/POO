public class Servidor extends Dispositivo{
    public String atrribute1;
    String zonaHoraria;
    public Servidor(String nombre, int ram, String procesador, String atrribute1, String zonaHoraria) {
        super(nombre, ram, procesador);
        this.atrribute1=atrribute1;
        this.zonaHoraria=zonaHoraria;
    }

    public void setAtrribute1(String atrribute1) {
        this.atrribute1 = atrribute1;
    }

    public String getAtrribute1() {
        return atrribute1;
    }

    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }
}
