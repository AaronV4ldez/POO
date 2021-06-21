import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Ventana {
    private AnchorPane pane;
    private Vacuna arreglovacuna[]=new Vacuna[2];
    private int con=0;

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
        listavacuna.setPrefSize(320, 250);
        listavacuna.setLayoutX(10);
        listavacuna.setLayoutY(120);

        Label tnomen=new Label("Nombre del men uwu");
        tnomen.setTextFill(Color.PINK);
        tnomen.setLayoutX(350);
        tnomen.setLayoutY(120);

        TextField txtNome=new TextField();
        txtNome.setPrefSize(120, 25);
        txtNome.setLayoutX(350);
        txtNome.setLayoutY(150);

        Label tcurup=new Label("Curp del men uwu");
        tcurup.setTextFill(Color.RED);
        tcurup.setLayoutX(350);
        tcurup.setLayoutY(190);

        TextField txtcurp=new TextField();
        txtcurp.setPrefSize(150, 25);
        txtcurp.setLayoutX(350);
        txtcurp.setLayoutY(210);

        Label llblcombo=new Label("Como te identificas¿");
        llblcombo.setTextFill(Color.DARKBLUE);
        llblcombo.setLayoutX(350);
        llblcombo.setLayoutY(245);

        ComboBox comboBox =new ComboBox();
        comboBox.getItems().addAll("Hombre", "Mujer", "Mujer trans", "Furro", "otro");
        comboBox.setPrefSize(220, 25);
        comboBox.setLayoutX(350);
        comboBox.setLayoutY(265);

        Button btnInserta=new Button("Insertar");
        btnInserta.setPrefSize(80, 25);
        btnInserta.setLayoutX(350);
        btnInserta.setLayoutY(320);

        ListView listapacientes=new ListView();
        listapacientes.setPrefSize(480, 100);
        listapacientes.setLayoutX(10);
        listapacientes.setLayoutY(380);

        Button btnMostrar=new Button("Mostrar");
        btnMostrar.setPrefSize(80, 25);
        btnMostrar.setLayoutX(520);
        btnMostrar.setLayoutY(380);

this.pane.getChildren().addAll(t1,lbl,txtNo, lbl1, txtNo1, lbl2, txtNo2, btnInsert, listavacuna, txtNome, txtcurp, tnomen, tcurup, llblcombo, comboBox, btnInserta, listapacientes, btnMostrar);

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
            try{

                int conver=Integer.parseInt(dv);
                Vacuna vacuna=new  Vacuna(nv, mv, conver);
                arreglovacuna[con]=vacuna;
                con ++;
                launchSucess("Vacuna Creada con éxito");
                txtNo.setText("");
                txtNo1.setText("");
                txtNo2.setText("");
                listavacuna.getItems().addAll(vacuna.getNomvacuna());

            } catch (NumberFormatException error){
                launchError("El nnumero insertado no es valido");


            }catch (ArrayIndexOutOfBoundsException error) {

                launchError("No se pueden agregar mas registros");


            }catch (Exception e){
                launchError("Ocurrio un error inesperado");

            }


        }
    }
});
btnInserta.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        String sexo=comboBox.getSelectionModel().getSelectedItem().toString();
       int pos=listavacuna.getSelectionModel().getSelectedIndex();
       listapacientes.getItems().addAll(arreglovacuna[pos].getNomvacuna()+" " + arreglovacuna[pos].getNdosis() + "  " + sexo);
        //System.out.println(sexo+"   " +arreglovacuna[pos].getNdosis());
    }
});
 btnMostrar.setOnAction(new EventHandler<ActionEvent>() {
     @Override
     public void handle(ActionEvent event) {
         String sexo=comboBox.getSelectionModel().getSelectedItem().toString();
         String nombremen=txtNome.getText();
         String curpmen=txtcurp.getText();
         Alert alert=new Alert(Alert.AlertType.INFORMATION);
         alert.setTitle("LISTO");
         alert.setContentText("El paciente: " + nombremen +" el cual tiene de curp: " +curpmen +" y esta persona se identifica como: " + sexo );
         alert.show();

     }
 });

        return pane;
    }
    public void launchError(String  mensaje){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("E R R O R");
        alert.setContentText(mensaje);
        alert.show();

    }
    public void launchSucess(String monsaje){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("LISTO");
        alert.setContentText(monsaje);
        alert.show();
    }
}
