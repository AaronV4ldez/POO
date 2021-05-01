package Animales;

import java.awt.*;

public class Perro extends Animal {
    private String raza;
    public Perro (Color color, double peso, String raza){
        super (color, peso);
        this.raza= raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }
    public void ladrar(){
        System.out.println("puedo ladrar guau");
    }
}
