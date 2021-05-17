public class Principal {
    public static void main(String[] args) {
        Usuario usuario1=new Usuario("yo", "tal", "uwu", "0223");
        boolean respuesta= usuario1.iniciarSesion("admin", "adassad");
       // System.out.println("Login: " +respuesta);
        Cliente c1= new Cliente("Cliente", "Xd", "c1", "111", 100);
        c1.cargarSaldo(100);
        System.out.println("Saldo: "+ c1.getSaldo());
        boolean res2= c1.iniciarSesion("c1", "0223");
        System.out.println(res2);
        c1.decirHola();

    }
}
