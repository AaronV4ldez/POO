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

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
    public String getComposition(){
        return this.composition;
    }

    public void setDistance_of_earth(int distance_of_earth) {
        this.distance_of_earth = distance_of_earth;
    }

    public int getDistance_of_earth() {
        return this.distance_of_earth;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}
