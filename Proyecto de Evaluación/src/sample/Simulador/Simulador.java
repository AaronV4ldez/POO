package sample.Simulador;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import sample.Main;

import java.io.IOException;

public class Simulador {
    @FXML Canvas Lienzo;
    @FXML GraphicsContext context;
    @FXML javafx.scene.control.Slider slider;
    @FXML AnchorPane anchorpane;
    @FXML StackPane stackpane;
    Color colorpincer = Color.RED;
    @FXML protected void initialize() {
        context = Lienzo.getGraphicsContext2D();
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                pintarDibujos(t1.intValue());

            }
        });

    }
public void Irconfig(ActionEvent event) throws IOException {
    Parent root= FXMLLoader.load(getClass().getResource("../Informacion/informacion.fxml"));
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
    public void btinicio(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../Login/login.fxml"));
        Scene scene= new Scene(root);
        Main.stage.setScene(scene);


    }

    public void pintarDibujos(int valor) {
        context.setFill(Color.WHITESMOKE);
        context.fillRect(0, 0, Lienzo.getHeight(), Lienzo.getWidth());
        context.setFill(colorpincer);
        System.out.println(valor);
        Image image = new Image(getClass().getResourceAsStream("../Img/chihuahua.jpg"));
        context.drawImage(image, 0, 0,350,350);

        for (int x = 0; x < valor + 1; x++) {
                int randomx = (int)(Math.random()*20 + 160);
                int randomy = (int)(Math.random()*20 + 10);
                int randomx2 = (int)(Math.random()*20 + 190);
                int randomy2 = (int)(Math.random()*20 + 190);
                int randomx3 = (int)(Math.random()*330 + 10);
                int randomy3 = (int)(Math.random()*330 + 10);
                int randomx4 = (int)(Math.random()*20 + 55);
                int randomy4 = (int)(Math.random()*20 + 85);
                context.fillOval(randomx,randomy,3,3);
                context.fillOval(randomx2,randomy2,3,3);
                context.fillOval(randomx3,randomy3,3,3);
                context.fillOval(randomx4,randomy4,3,3);
        }
    }

}
