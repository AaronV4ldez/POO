public class Admin extends User{
    public Admin(String nombre, String adress, String phone, String userName, String password) {
        super(nombre, adress, phone, userName, password);
    }
    public void changePassword(String nuevo){
        super.setPassword(nuevo);
    }
}
