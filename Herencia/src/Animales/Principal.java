package Animales;

import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] miArray = new int[4];
        String [] str;
        Scanner scanner=new Scanner((System.in);
        System.out.println("Ciamtps registros kieres¿");
        int c = scanner.nextInt();
        str =new String[c];
        for (int x=0; x<c; x++){
            System.out.println("Inserta Nombre");
            String n = scanner.next();
            str[x]=n;
        }
        imprimirArreglo(str);

        Ave[] arrayAves= new Ave[5];
        Animal[] arrayAnimal=new Animal[5];
        Perro [] arrayPerro= new Perro[5];

Animal animalGenerico1xd1linkmega =new Animal(Color.cyan, 24);
Ave zapdos = new Ave(Color.black, 45, "electrico");
Perro popi = new Perro(Color.black, 30, "Chihuahua");
animalGenerico1xd1linkmega.comer();
zapdos.volar();



    }
    public static void imprimirArreglo (String[] arr){
        for (int x=0; x<arr.length; x++){
            System.out.println(arr[x]);
        }
    }
}
