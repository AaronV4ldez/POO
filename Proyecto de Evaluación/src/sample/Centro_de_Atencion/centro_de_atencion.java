package sample.Centro_de_Atencion;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import sample.Main;

import java.io.IOException;

public class centro_de_atencion {
    @FXML
    AnchorPane anchorpane;
    @FXML
    StackPane stackpane;
    public void btinicio(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../Login/login.fxml"));
        Scene scene= new Scene(root);
        Main.stage.setScene(scene);


    }
    public void irsiguiente(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../Sintomas/sintomas.fxml"));
        Scene scene=anchorpane.getScene();
        root.translateXProperty().set(600);
        stackpane.getChildren().add(root);
        Timeline timeline=new Timeline();
        KeyValue kv=new KeyValue(root.translateXProperty(),0, Interpolator.EASE_IN);
        KeyFrame kf=new KeyFrame(Duration.seconds(2),kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stackpane.getChildren().remove(anchorpane);
            }
        });
        timeline.play();

    }
}
