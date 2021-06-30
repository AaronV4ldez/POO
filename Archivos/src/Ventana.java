import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class Ventana {
private TextArea textArea;
private Stage stage;
private ListView lista;
private ListView listapropiedades;
    private String[] renglones;
    public Ventana(Stage stage){this.stage=stage; }
    public AnchorPane crearVentana(){
        AnchorPane pane=new AnchorPane();
        pane.setPrefSize(900, 600);

        Menu menu=new Menu("Archivo");
        MenuItem open=new MenuItem("Abrido");
        MenuItem save=new MenuItem("Guardar");
        MenuItem exit=new MenuItem("Salir");
        menu.getItems().addAll(open, save, exit);
        MenuBar menuBar=new MenuBar();
        menuBar.setPrefSize(900, 25);
        menuBar.setLayoutX(0);
        menuBar.setLayoutY(0);
        menuBar.getMenus().addAll(menu);

open.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        FileChooser chooser= new FileChooser();
        chooser.setTitle("Favor de elegir el archivini");
        File file=  chooser.showOpenDialog(stage);
        if (file!=null){
            leerarchivo(file.getAbsolutePath());
            System.out.println(file.getTotalSpace());
        }//if

    }
});




        textArea=new TextArea();
        textArea.setPrefSize(300,450);
        textArea.setLayoutX(10);
        textArea.setLayoutY(90);

       // leerarchivo("./src/elementos.csv");

       lista=new ListView();
       lista.setPrefSize(230, 400);
       lista.setLayoutX(10);
       lista.setLayoutY(90);
       TextField textField=new TextField();
       textField.setPrefSize(150, 20);
       textField.setLayoutX(10);
       textField.setLayoutY(50);
       textField.setPromptText("Elemnto quie quieras buscar krnal");
       Button btnbuscar=new Button("Buscar");
       btnbuscar.setPrefSize(80,20);
       btnbuscar.setLayoutX(165);
       btnbuscar.setLayoutY(50);

       Label simboloEl=new Label("H");
       simboloEl.setFont(new Font("Arial", 150));
       simboloEl.setStyle("-fx-text-fill: #0489d1");
       simboloEl.setLayoutX(450);
       simboloEl.setLayoutY(80);

        Label nombreEl=new Label("Hidrogeno");
        nombreEl.setFont(new Font("Arial", 30));
        nombreEl.setStyle("-fx-text-fill: #0489d1");
        nombreEl.setLayoutX(430);
        nombreEl.setLayoutY(250);

listapropiedades=new ListView();
listapropiedades.setLayoutX(430);
listapropiedades.setLayoutY(300);
listapropiedades.setPrefSize(200,200);

        pane.getChildren().addAll(textArea, menuBar, textField, btnbuscar, simboloEl, nombreEl, listapropiedades);

        leerarchivo("./src/elementos.csv");


        lista.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (lista.getSelectionModel().getSelectedIndex()>-1){
                    int index=lista.getSelectionModel().getSelectedIndex();
                    System.out.println(renglones[index+2]);
                    String[] elemenso=renglones[index+2].split(",");
simboloEl.setText(elemenso[2]);
nombreEl.setText(elemenso[1]);
listapropiedades.getItems().clear();
String[] arrayPropiedades=renglones[1].split(",");
for (int x=3;x<arrayPropiedades.length; x++){
    listapropiedades.getItems().add(arrayPropiedades[x]+"");
}


                }//llave if
            }
        });
        return pane;
    }
    public void leerarchivo(String ruta){
        File file=new File(ruta);
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String renglon;
            String todo="";
            while ( (renglon=br.readLine()) !=null){
todo=todo+"\n " + renglon;
            }
            renglones=todo.split("\n");
            for (int x=2;x<renglones.length; x++){
            String[] arrayRenglon=renglones[x].split(",");
            lista.getItems().add(arrayRenglon[0]+"-" + arrayRenglon[1]);
            }
            textArea.setText(todo);



        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("E R R O R");
            alert.setContentText("No se pudo leer el archivo krnal");
            alert.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
