import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner scanner=new  Scanner(System.in);
        System.out.println("Buenas tardes Bienvenido al sistema de los Kokiri´s Boyz");
        System.out.println("Que es lo que desea hacer?");
        System.out.println("1.- Ver el precio de los boletos");
        System.out.println("2.- Comprar boletos");
        System.out.println("3.- Ver su recibo de compras");
        System.out.println("4.- Salir");
        int valor=scanner.nextInt();
        if (valor==1){
preciob();
        }else if (valor==2){
            System.out.println("Cuantos boletos quieres comprar?");
            preciob();
            int cboleto=scanner.nextInt();
            int uwu=owo(cboleto);
            System.out.println("El precio de tus boletos es de un total de= " + uwu +"$");
        }else if (valor==3){
            preciob();
            System.out.println(recibo());
        }else if (valor==4){
            System.out.println("Gracias por usar este humilde punto de venta ahora puede retirarse a su casita de vuelta con diosito que tenga una excelente noche *c va*");
            preciob();
        }else{
            System.out.println("del 1 al 4 te dije d.d");
        }
    }
    public static void preciob(){
        System.out.println("El boleto tiene un costo de 15 pesos c/u");
    }
    public static int owo(int u){
        int costo=u*15;
        return costo;
    }
    public static String recibo(){
        return "Para poder usar esta funcion necesitó haber hecho antes un ciclo para poder guardar la información de pago por su atencion muchas gracias ahora solo te devolvere este mensaje sin esperar nada a cambio";
    }
    public static void uwuwu(){
        //se supone que este es el que no hace nada ni devuelve nada ni nada de nada owo
    }
}//el preciob es castroso y por eso sale aunque no lo llamen :3
