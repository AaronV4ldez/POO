import java.awt.*;

public abstract class Figura {
    private Color color;
    public Figura(Color color){
        this.color=color;
    }
    public abstract double calcularArea();

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
