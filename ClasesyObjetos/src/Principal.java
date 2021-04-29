import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       /* Planet tierra=new Planet("Tierra", 4800, "solid", 365, 5483);
        Planet marte=new Planet("Marte", 4817, "solid", 687, 657943);
        Asteroid a1=new Asteroid("Aster1", "solid", 654, 7000);
        Asteroid a2=new Asteroid("arturo", "liquid", 6543, 744);
        Asteroid a3=new Asteroid("maik", "solid", 548, 987);
        Asteroid a4=new Asteroid("mengenito", "solid", 545, 698);
        System.out.println(marte.getName());
        System.out.println(tierra.getName());
        System.out.println(marte.getSun_distance());
        System.out.println(tierra.getSun_distance());
        System.out.println(marte.getComposition());
        System.out.println(tierra.getComposition());   */
        int op=0;
        Scanner scanner=new Scanner(System.in);
        while (op!=4){
            System.out.println("¿Qué desea hacer? \n  1)Crear estrella \n 2)Crear asteroide \n 3)Crear planeta \n 4)Salir");
            op = scanner.nextInt();

        System.out.println("Denada vuelva pronto ~");
        switch (op){
            case 1:{
                System.out.println("introduce el diametro");
                double diame= scanner.nextDouble();
                System.out.println("introduce el tipo de estrella \n 1)Enana roja \n 2)Enana blanca \n 3)Enana naranja \n 4)Enana negra ");
int t= scanner.nextInt();
String tpo="";
                if (t==1){ tpo="Enana roja";
                }else if (t==2){ tpo="Enana blanca";
                }else if (t==3){ tpo="Enana naranja";
                }else if (t==4){ tpo="Enana negra";
                }else{ tpo="Estrella Normal"; }

                System.out.println("Cual es el color de la estrella? \n 1)Roja \n 2)Azul \n 3) Blanca");
                int c= scanner.nextInt();
                Color color= Color.black;
                if (c==1){ color=Color.RED;
                }else if (c==2){ color=Color.blue;
                }else  if (c==3){ color=Color.white;}
Star estrella1= new Star(diame, tpo, color);
                System.out.println("La estrella que creaste es Diametro: " + estrella1.getDiameter() +
                        " del tipo: " + estrella1.getType() + " su color es: " + estrella1.getColor().toString());
                break;}
            case 2:{
                System.out.println("Como se llama el asteroide? \n 1)Arturo \n 2) Wilifredo \n 3)Raul");
                int as= scanner.nextInt();
                String ast ="";
                if (as==1) { ast = "Arturo";
                }else if (as==2){ast="Wilifredfo";
                }else if(as==3){ast="Raul";}
                System.out.println("Como es su composicion? \n 1)Rocosa \n 2)Liquida \n 3)Gaseosa");
                int co= scanner.nextInt();
                String com="";
                if (co==1){com="Rocosa";
                }else if (co==2){com="Liquida";
                }else if (co==3){com="Gaseosa";}

                System.out.println("Cual es la ditancia hacia la tierra?");
                int dist= scanner.nextInt();
                System.out.println("Cual es la velocidad del asteroide?");
                int vela= scanner.nextInt();
Asteroid asteroide1 = new Asteroid(ast, com, dist, vela);
                System.out.println("El asteroide creado tiene como nombre: " + asteroide1.getName() + " su composicion es: "
                + asteroide1.getComposition() + " su distancia hacia la tierra es de: " + asteroide1.getDistance_of_earth() + " y por ultimo su velocidad es de: "
                + asteroide1.getSpeed());
                break;}

            case 3: {
                System.out.println("Como se llama el planeton? \n 1)Tierra \n 2)Marte \n 3)Reach");
                int nomp= scanner.nextInt();
                String nop="";
                if (nomp==1){nop="Tierra";
                }else if (nomp==2){nop="Marte";
                }else if (nomp==3){nop="Reach";}
                System.out.println("Cual es la distancia del sol?");
                double dists= scanner.nextDouble();
                System.out.println("Como es la composicion del planeta ? \n 1)Rocosa \n 2)Liquida \n 3)Gaseosa");
                int cop= scanner.nextInt();
                String comp="";
                if (cop==1){comp="Rocosa";
                }else if (cop==2){comp="Liquida";
                }else if (cop==3){comp="Gaseosa";}

                System.out.println("Cuantos dias tiene de orbita?");
                int orbip= scanner.nextInt();
                System.out.println("Cual es la masa del planeta?");
                double masp= scanner.nextDouble();
                Planet planeta1 = new Planet(nop, dists, comp, orbip, masp);
                System.out.println("El planeta que has creado tiene por nombre: " + planeta1.getName() + " la distancia que tiene con el sol es de: " + planeta1.getSun_distance()
                + " su composiion es: " + planeta1.getComposition() + " y por ultimo su masa es de: " + planeta1.getMass());

                break; }

            case 4: {
            break;}
            default:{
                System.out.println("Del 1 al 4 puñetas");
            }
        }//suiych
        }//while
    }//main
}//class
