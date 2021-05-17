public class Usuario {
    private String nombre;
    private String ap;
    private String password;
    private String usuario;
public Usuario (String nombre, String ap, String usuario, String password){
    this.nombre=nombre;
    this.ap=ap;
    this.password=password;
    this.usuario=usuario;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAp() {
        return ap;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
    public boolean iniciarSesion(String usuario, String password){
    if (usuario.equals(this.usuario)&& password.equals(this.password)){
        return  true;
    }else{
        return false;
    }
    }
    public void decirHola(){
        System.out.println("Decir hola desde la clase usuario");
    }
    private int cobrarCheque(){
    return 500*15;
    }
    public void salir(){
        System.out.println("Bye uwu");
    }
}
