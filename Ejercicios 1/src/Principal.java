import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bro ¿Cual es tu edad?");
        int edad=scanner.nextInt();
        if (edad<18){
            System.out.println("Oye niño y tu mamá?");
            System.out.println("has vivido " + (edad*365)+" dias");
        }else  if (edad>=18 && edad <= 35){
            System.out.println("uff man aun estas en la plena flor de tu juventud");
            System.out.println("has vivido " + (edad*365)+" dias");
        }else if (edad>=36){
            System.out.println("Nombre Don usted ya cuenta como señor :/");
            System.out.println("Usted ha vivido " + (edad*365)+" dias");
        }
        System.out.println("==================================================================");
        System.out.println("Cambiando de tema que tabla de multiplicar quieres conocer? (del 1 al 10)");
        int multi=scanner.nextInt();
        int lol=0;
        if (multi<=10 && multi>=1){
            for (int xd=0;xd<10; xd++){
            lol++;
                System.out.println(multi +" * "+ lol + " = " + multi*lol );
            }
        }else {
            System.out.println("Que te dije >:c del 1 al 10");
        }
    }
}
