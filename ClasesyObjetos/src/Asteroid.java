public class Asteroid {
    private String name;
    private String composition;
    public int distance_of_earth;
    protected int speed;

    //Constructor
    public Asteroid(String nombre2, String composicion, int distancia, int velocidad){
        this.name=nombre2;
        this.composition=composicion;
        this.distance_of_earth=distancia;
        this.speed=velocidad;
    }
}
