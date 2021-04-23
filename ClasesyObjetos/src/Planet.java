public class Planet {
    private String name;
    private double sun_distance;
    private String composition;
    private int orbit_days;
    public double mass;

    //CONSTRUCTOR
    public Planet(String nombre, double d, String c, int od, double ma ){
        this.name=nombre;
this.sun_distance=d;
this.composition=c;
this.orbit_days=od;
this.mass=ma;
    }
    // SET => Poner Asignar
    // GET => Obtener o Traer
    public void setName (String nuevonombre){
        this.name=nuevonombre;
    }
    public String getName(){
        return this.name;
    }
    public void setSun_distance(double sun_distance){
        this.sun_distance=sun_distance;
    }
    public double getSun_distance(){
        return this.sun_distance;
    }
    public void setComposition (String composition){
        this.composition=composition;
    }
    public String getComposition(){
        return this.composition;
    }
    public void setOrbit_days(int orbit_days){
        this.orbit_days=orbit_days;
    }
    public int getOrbit_days(){
        return this.orbit_days;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return this.mass;
    }
}
