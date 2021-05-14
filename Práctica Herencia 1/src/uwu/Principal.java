package uwu;

import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    }

    int op = 0;
    Scanner scanner = new Scanner(System.in);
        while(op !=4)
    {
        System.out.println("¿Qué desea hacer? \n  1)Crear zona geografica \n 2)Crear Provincia \n 3)Imprimir \n 4)Salir");
        op = scanner.nextInt();

        System.out.println("Denada vuelva pronto ~");
        switch (op) {
            case 1: {
                System.out.println("Como se llama la zona");
                String [] str;
                int c = scanner.nextInt();
                str =new String[c];
                for (int x=0; x<c; x++){
                    System.out.println("Inserta Nombre");
                    String n = scanner.next();
                    str[x]=n;
                }
                for (int y=0; y<c; y++){
                    System.out.println("El terreno");
                    String n = scanner.next();
                    str[y]=n;
                }
            }
            case 2: {
                System.out.println("Como se llama la zona");
                String [] str;
                int c = scanner.nextInt();
                str =new String[c];
                for (int x=0; x<c; x++){
                    System.out.println("Inserta Nombre");
                    String n = scanner.next();
                    str[x]=n;
                }
                for (int y=0; y<c; y++){
                    System.out.println("El terreno");
                    String n = scanner.next();
                    str[y]=n;
                }
                break;
            }

            case 3: {

                imprimirArreglo(str);
                break;
            }

            case 4: {
                break;
            }
            default: {
                System.out.println("Del 1 al 4 puñetas");
            }

        }
    }
    public static void imprimirArreglo (String[] arr){
        for (int x=0; x<arr.length; x++){
            System.out.println(arr[x]);
        }
    }
}