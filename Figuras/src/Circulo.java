import java.awt.*;

public class Circulo extends Figura{
    private double radio;
   public Circulo(Color color, double radio){
       super(color);
       this.radio=radio;
   }
    @Override
    public double calcularArea() {

       return Math.PI*(Math.pow(this.radio, 2));
    }
}
