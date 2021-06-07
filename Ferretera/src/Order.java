import java.util.Scanner;

public class Order implements NewOrder {
    private double total;
    private Part[] partes;
    private Client client;
    private Cashier cashier;
public Order(Client client, Cashier cashier){
    this.cashier=cashier;
    this.client=client;
    this.setParts();

}
    @Override
    public void setParts() {
        System.out.println("Cuantas partes necesitas bro¿");
        Scanner scanner=new Scanner(System.in);
        int  cuantas=scanner.nextInt();
        partes=new Part[cuantas];
        for (int x=0; x<cuantas; x++){
            partes[x]=new  Part("parte", 200*x, "xd");


        }
        this.setTotal();
    }

    @Override
    public void setClient() {

    }

    @Override
    public void setTotal() {
    for (int x=0; x<partes.length; x++){
        total=total+partes[x].getPrecio();
    }

    }

    public double getTotal() {
        return total;
    }
}
