package Animales;

import java.awt.*;

public class Ave extends  Animal{
    //extends significa hacer la herencia
     private String tipo;
     public Ave (Color color, double peso, String tipo){
         super(color, peso); //mando a llamar a la SUPER clase => mandar llamar al constructor
         this.tipo= tipo;
     }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void volar(){
        System.out.println("puedo volar :D");

    }

    public String getTipo() {
        return tipo;
    }
}
