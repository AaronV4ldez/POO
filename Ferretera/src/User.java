public class User extends Person{
private String userName;
private String password;

    public User(String nombre, String adress, String phone, String userName, String password) {
        super(nombre, adress, phone);
        this.userName=userName;
        this.password=password;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
