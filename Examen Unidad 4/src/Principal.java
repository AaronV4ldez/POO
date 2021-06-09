import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bienvenido al sistema IMSSn't \n ¿Que desea hacer?");
        System.out.println("Que desea hacer? \n 1) Hacer cita \n 2) Cancelar cita");
        int decision=scanner.nextInt();
        if (decision==1){
            Cita   cita1= new Cita();
            cita1.sacarCita();
            cita1.PrecioCita();
        }else {
            Cita cita1=new Cita();
            cita1.cancelarCita();
        }


    }
}
