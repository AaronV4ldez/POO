import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Ventana ventana=new Ventana(stage);
        Scene scene=new Scene(ventana.crearVentana());
        stage.setWidth(900);
        stage.setHeight(600);
        stage.setTitle("Archivos perrones");
        stage.setScene(scene);
        stage.show();
    }
}
