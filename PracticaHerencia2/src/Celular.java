public class Celular extends Dispositivo {
    public String enviarSms;
    public int saldo;


    public Celular(String nombre, int ram, String procesador, String enviarSms, int saldo) {
        super(nombre, ram, procesador);
        this.enviarSms=enviarSms;
        this.saldo=saldo;
    }

    public void setEnviarSms(String enviarSms) {
        this.enviarSms = enviarSms;
    }

    public String getEnviarSms() {
        return enviarSms;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
}
