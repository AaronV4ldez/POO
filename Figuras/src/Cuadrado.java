import java.awt.*;

public class Cuadrado extends Figura{
    private double lado1;
    private double lado2;
   public Cuadrado(Color color, double lado1, double lado2){
       super(color);
       this.lado1=lado1;
       this.lado2=lado2;
   }
    @Override
    public double calcularArea() {
        return this.lado1*this.lado2;
    }
}
