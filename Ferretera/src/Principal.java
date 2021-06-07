public class Principal {
    public static void main(String[] args) {
        Admin admin1=new Admin("Admin", "tu casa u3u", "636111111", "adminhokage", "contrasena");
Cashier cashier1=new Cashier("Cajero", "tu corazon", "123321", "c1", "sharinganHokage");
cashier1.makePayment();
        User cashier2=new Cashier("Cajero", "tu corazon", "123321", "c1", "sharinganHokage");

        Client client1=new Client("mariano", "su casita", "123321", 1000, 3000);
        Order order1=new Order(client1,cashier1);
        System.out.println(order1.getTotal());
    }
}
