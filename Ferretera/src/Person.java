public abstract class Person {
    private String nombre;
    private  String adress;
    private String phone;
    public Person (String nombre, String adress, String phone){
        this.adress=adress;
        this.nombre=nombre;
        this.phone=phone;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
