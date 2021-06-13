import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Principal extends Application {

    public static void main(String[] args) {
launch(args);
    }

    @Override
    public void start(Stage ventana) throws Exception {
        AnchorPane acomodo=new AnchorPane();
        acomodo.setStyle("-fx-background-color:#d0d0d0");


        Label label=new Label("hola mundo");
        label.setLayoutX(170);
        label.setLayoutY(130);
        label.setPrefSize(200,50);
        Scene scene1=new Scene(acomodo);
        label.setFont(new Font("Arial", 30));
        label.setTextFill(Color.CYAN);
        acomodo.getChildren().add(label);


        TextField  tx1=new TextField();
        tx1.setLayoutX(170);
        tx1.setLayoutY(190);
        tx1.setPrefSize(200, 50);
        acomodo.getChildren().add(tx1);

        Button button1 =new Button("Aceptar");
        button1.setLayoutX(170);
        button1.setLayoutY(220);
        button1.setPrefSize(200, 50);
        button1.setStyle("-fx-background-color:#000000");
        button1.setStyle("-fx-text-fill:#ffffff");

        acomodo.getChildren().add(button1);

        //acomodo.setPrefWidth(500);
        //acomodo.setPrefWidth(500);
        ventana.setWidth(500);
        ventana.setHeight(500);
        ventana.setScene(scene1);
        ventana.setTitle("Hola mundo UuU");
        ventana.show();

    }
}
