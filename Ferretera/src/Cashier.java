public class Cashier extends User{
    public Cashier(String nombre, String adress, String phone, String userName, String password) {
        super(nombre, adress, phone, userName, password);
    }
    public void makePayment(){
        System.out.println("Hacer pago");
    }
}
