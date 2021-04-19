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
}
