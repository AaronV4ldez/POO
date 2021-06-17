import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Ventana {
    public AnchorPane pane;

    public AnchorPane construir(){
        this.pane=new AnchorPane();
        Label t1=new Label("Vacuna uwu"); t1.setFont(new Font("Arial", 30));
        t1.setTextFill(Color.ORANGE);
        t1.setLayoutX(10);
        t1.setLayoutY(10);
        Label lbl=new Label("Nombre vacuna");
        lbl.setTextFill(Color.CYAN);
        lbl.setLayoutX(10);
        lbl.setLayoutY(50);
        TextField txtNo=new TextField();
        txtNo.setPrefSize(150, 25);
        txtNo.setLayoutX(10);
        txtNo.setLayoutY(70);

        Label lbl1=new Label("Marca vacuna");
        lbl1.setTextFill(Color.CYAN);
        lbl1.setLayoutX(180);
        lbl1.setLayoutY(50);
        TextField txtNo1=new TextField();
        txtNo1.setPrefSize(150, 25);
        txtNo1.setLayoutX(180);
        txtNo1.setLayoutY(70);

        Label lbl2=new Label("Dosis vacuna");
        lbl2.setTextFill(Color.CYAN);
        lbl2.setLayoutX(340);
        lbl2.setLayoutY(50);
        TextField txtNo2=new TextField();
        txtNo2.setPrefSize(150, 25);
        txtNo2.setLayoutX(340);
        txtNo2.setLayoutY(70);

        Button btnInsert=new Button("Insertar");
        btnInsert.setPrefSize(80, 25);
        btnInsert.setLayoutX(500);
        btnInsert.setLayoutY(70);

        ListView listavacuna=new ListView();
        listavacuna.setPrefSize(550, 250);
        listavacuna.setLayoutX(10);
        listavacuna.setLayoutY(120);


this.pane.getChildren().addAll(t1,lbl,txtNo, lbl1, txtNo1, lbl2, txtNo2, btnInsert, listavacuna);

btnInsert.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        String nv=txtNo.getText();
        String mv=txtNo1.getText();
        String dv=txtNo2.getText();

        if (nv.equals("")|| mv.equals("") || dv.equals("")){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("E R R O R");
            alert.setContentText("L L E N A   T O D O   P A P I");
            alert.show();
        }else {
            int conver=Integer.parseInt(dv);
        Vacuna vacuna=new  Vacuna(nv, mv, conver);
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("LISTO");
            alert.setContentText("V A C U N A   C R E A D A   C O R R E C T A M E N T E");
            alert.show();
            txtNo.setText("");
            txtNo1.setText("");
            txtNo2.setText("");

        }
    }
});

        return pane;
    }
}
