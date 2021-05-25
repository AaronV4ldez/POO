import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
int op=0;
        Scanner scanner=new Scanner(System.in);
while (op != 4){
    System.out.println("Bienvenido");
    System.out.println("¿Qué desea hacer 1) Crear Celular \n 2) Crear Pc \n 3)Crear Servidor \n 4) Funciones Especiales \n 5)salir");
op = scanner.nextInt();
Celular celular[];
Dispositivo dispositivo[];
Servidor servidor[];

switch (op){
    case 1:{
        System.out.println("Cuantos celulares deseas crear?");
        int uwu=scanner.nextInt();
        celular=new Celular[uwu];
        for (int x=0; x<uwu; x++){
            System.out.println("Introduce el nombre del dispositivo movil");
            String n=scanner.next();
            System.out.println("Cuanta memoria Ram tiene?");
            int ram= scanner.nextInt();
            System.out.println("Que procesador tiene?");
            String proc=scanner.next();
            System.out.println("Que mensaje desea mandar?");
            String msg=scanner.next();
            System.out.println("Cuanto saldo tiene?");
            int saldoh=scanner.nextInt();
            Celular celular1=new Celular(n, ram, proc, msg, saldoh);
        }
        break;
    }
    case 2:{
        System.out.println("Cuantas PC deseas crear?");
        int unu=scanner.nextInt();
        dispositivo=new  Dispositivo[unu];
        for (int x=0; x<unu; x++){
            System.out.println("Cual es el nombre del dispositivo?");
            String nom=scanner.next();
            System.out.println("Cuanta memoria ram tiene?");
            int ran=scanner.nextInt();
            System.out.println("Que procesador tiene¿");
            String prox=scanner.next();
            Dispositivo dispositivo1=new Dispositivo(nom, ran, prox);
        }
        break;
    }
    case 3:{
        System.out.println("Cuantos servers quieres crear?");
        int ewe=scanner.nextInt();
        servidor=new Servidor[ewe];
        for (int x=0; x<ewe; x++){
            System.out.println("Cual es el nombre del servidor?");
            String noms=scanner.next();
            System.out.println("Cuanta memoria ram tiene?");
            int rams=scanner.nextInt();
            System.out.println("que procesador lleva el servidor?");
            String serna=scanner.next();
            System.out.println("Cual es su atributo?");
            String atri=scanner.next();
            System.out.println("Cual es su zona horaria?");
            String zonag=scanner.next();
            Servidor servidor1=new Servidor(noms, rams, serna, atri, zonag);
        }
        break;
    }
    case 4:{
        System.out.println("Camara encendida xD");
        break;
    }
    case 5:{ break;}
     default:{
        System.out.println("Numero no valido krnal");
    }
}//lave suich
}

    }
}
