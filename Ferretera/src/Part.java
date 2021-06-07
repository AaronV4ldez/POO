public class Part {
    private String nombre;
    private  double precio;
    private String brand;
    public Part (String nombre, double precio, String brand){
        this.nombre=nombre;
        this.precio=precio;
        this.brand=brand;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getBrand() {
        return brand;
    }
}
