import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class Ventana {
private TextArea textArea;
private Stage stage;
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
        textArea.setPrefSize(200,200);
        textArea.setLayoutX(10);
        textArea.setLayoutY(50);

        leerarchivo("./src/datos.txt");

        pane.getChildren().addAll(textArea, menuBar);
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
