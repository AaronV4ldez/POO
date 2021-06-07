package sample.Sintomas;

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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import sample.Main;

import java.io.IOException;

public class sintomas {
    @FXML
    AnchorPane anchorpane;
    @FXML
    StackPane stackpane;
    @FXML CheckBox chbox1, chbox2, chbox3, chbox4, chbox5, chbox6, chbox7, chbox8;
    @FXML Label llblxd;
    @FXML protected void initialize (){

    }
    public void suma(ActionEvent event){
        int xd=0;
        if (chbox1.isSelected()){
            xd++;
        }
        if (chbox2.isSelected()){
            xd++;
        }
        if (chbox3.isSelected()){
            xd++;
        }
        if (chbox4.isSelected()){
            xd++;
        }
        if (chbox5.isSelected()){
            xd++;
        }
        if (chbox6.isSelected()){
            xd++;
        }
        if (chbox7.isSelected()){
            xd++;
        }
        if (chbox8.isSelected()){
            xd++;
        }
        if (xd<=4){
            llblxd.setText("Usted no tiene covid pero no olvide tomar las medidas de precaución");
        } else if (xd<=6){
            llblxd.setText("Usted probablemente tiene Covid vaya a checarse al médico para prevenir");
        }else {
            llblxd.setText("Posiblemente tenga Covid vaya con mucho cuidado a su médico más cercano");

        }

    }
    public void btinicio(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../Centro_de_Atencion/centro_de_atenciones.fxml"));
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
    public void irsiguiente(ActionEvent event) throws IOException {
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

}
