public class Cliente  extends Usuario{
private double saldo;
    public Cliente(String nombre, String ap, String usuario, String password, double saldo) {
        super(nombre, ap, usuario, password);
        this.saldo=saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void cargarSaldo (double saldo){
        this.saldo=this.saldo + saldo;
    }

    @Override
    public boolean iniciarSesion(String usuario, String password) {
        System.out.println("A C C E S O    D E N E G A D O " + super.getNombre());
        return false;
    }

    @Override
    public void decirHola() {
        System.out.println("decir hola desde la sub clase");
        super.decirHola();
    }

}
