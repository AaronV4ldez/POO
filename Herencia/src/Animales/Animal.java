package Animales;

import java.awt.*;

public class Animal {
    private Color color;
    private double peso;

    public Animal(Color color, double peso){
        this.color=color;
        this.peso=peso;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
    public void comer(){
        System.out.println("Ando comiendo uwu");

    }
    public void moverse(){
        System.out.println("puedo moverme uwu");

    }
}
