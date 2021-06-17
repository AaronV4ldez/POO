import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Principal extends Application {


    @Override
    public void start(Stage stage) throws Exception {
       Ventana ventana=new Ventana();
        AnchorPane pane=ventana.construir();
        pane.setPrefWidth(600);
        pane.setPrefHeight(500);
        Scene escena= new Scene(pane);
        stage.setScene(escena);
        stage.setWidth(600);
        stage.setHeight(500);
        stage.setTitle("Cobijas");
        stage.show();
    }

    public static void main(String[] args) {
    launch(args);
    }
}
