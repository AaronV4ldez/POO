import java.util.Scanner;

public class Cita implements Citatorio{
    Scanner scanner= new Scanner(System.in);
    @Override
    public void sacarCita() {
       System.out.println("Bienvenido al Hospital IMSSn't ");
        System.out.println("Cual es su nombre?");
        String nomp = scanner.next();
        System.out.println("Cual es su apellido?");
        String apP= scanner.next();
        System.out.println("podria darme su direccion?");
        String direp = scanner.next();
        System.out.println("Cual es su edad?");
        int edap = scanner.nextInt();
        System.out.println("Cual es su curp?");
        String curpp=scanner.next();
        System.out.println("Por ultimo cuando era su cita?");
        String citsa= scanner.next();
        Paciente paciente1=new Paciente(nomp, apP, direp, edap, curpp, citsa);
        System.out.println("Se que son muchas preguntas pero recuerde que es el IMSSn't asi que no tenemos buen servicio por lo cual le pedire que me brine los datos de su doctor");
        System.out.println("Cual es el nombre de su doctor?");
        String nomd = scanner.next();
        System.out.println("Cual es su apellido?");
        String apd= scanner.next();
        System.out.println("podria darme su direccion?");
        String dired = scanner.next();
        System.out.println("Cual es su edad?");
        int edadd = scanner.nextInt();
        System.out.println("De casualidad sabra cual es su rfc?");
        String rfcc= scanner.next();
        System.out.println("A que especialidad va?");
        String espec=scanner.next();
        Doctor doctor1=new Doctor(nomd, apd, dired, edadd, rfcc, espec);
        System.out.println(" sus datos son " + paciente1);
        System.out.println("y su medico es el  " +doctor1);



    }
public void PrecioCita(){
    System.out.println("Cuantas horas durará con el medico?");
    int horass=scanner.nextInt();
    System.out.println("Que especialista será? \n 1) cirugano \n 2) pediatra \n 3) con el simis");
    int meixd=scanner.nextInt();
    if (meixd==1){
       int preciomedi=horass*125;
        System.out.println("el precio sera de " + preciomedi);
        System.out.println("Gracias por su visita");
    }else if (meixd==2){
        int preciomedi2=horass*140;
        System.out.println("El precio sera de " + preciomedi2);
        System.out.println("Gracias por su visita");

    }else if (meixd==3){
        int preciomedi3=horass*50;
        System.out.println("El precio sera de " + preciomedi3);
        System.out.println("vuelva pronto");

    }
}
    @Override
    public void cancelarCita() {
        System.out.println("La cita a sido cancelada \n Nos debe un millon de pesos");

    }
}
