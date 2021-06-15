package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.security.auth.callback.Callback;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class Controller12 {
    @FXML
    TextField txtnombre;
    @FXML TextField txtapellido;
    @FXML TextField txtcorreo;
    @FXML TextField txtcontra;
    Conexion conexion;
    @FXML protected void initialize(){
        conexion=new  Conexion();
    }
    TableColumn colNombre=new TableColumn("Nombre");
    TableColumn colApellido=new TableColumn("Apellido");
    TableColumn colCorreo=new TableColumn("Correo");
    TableColumn colContrasena=new TableColumn("Contraseña");
    TableColumn colEliminar= new TableColumn("");
    TableColumn colEditar=new TableColumn("");
    Fila filaedit;

    @FXML
    TableView tabla;
    ObservableList<Fila> datosTabla= FXCollections.observableArrayList();
Callback<TableColumn<Fila, String>, TableCell<Fila,String>> celdaEditar =new Callback<TableColumn<Fila, String>, TableCell<Fila,String>> {
    @Override
    public TableCell <Fila, String> call(TableColumn<Fila, String>param) {
        TableCell<Fila, String>cell=new TableCell<Fila, String>(){
            Button btneditar= new Button("Editar");

            @Override
            protected void updateItem(String item, boolean empty) {
                if (empty){
                    setGraphic(null);
                    setText(null);
                }else {
                    btneditar.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            Fila filaedit.getTableView().getItems().get(getIndex());
                            txtnombre.setText(filaedit.getNombre());
                            txtapellido.setText(filaedit.getApellido());
                            txtcorreo.setText(filaedit.getCorreo());
                            txtcontra.setText(filaedit.getContra());


                        }
                    });
                    setGraphic(btneditar);
                    setText(null);

                }
            }
        };
return cell;
    }
        Callback<TableColumn<Fila, String>, TableCell<Fila,String>> celdaEliminar =new Callback<TableColumn<Fila, String>, TableCell<Fila,String>> {
            @Override
            public TableCell <Fila, String> call(TableColumn<Fila, String>param) {
                TableCell<Fila, String>cell=new TableCell<Fila, String>(){
                    Button btneliminar= new Button("Eliminar");

                    @Override
                    protected void updateItem(String item, boolean empty) {
                        if (empty){
                            setGraphic(null);
                            setText(null);
                        }else {
                            btneliminar.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
                                    alert.setTitle("Eliminar registro");
                                    alert.setContentText("Desea eliminar el registro?");
                                    Optional<ButtonType>resultado=alert.showAndWait();
                                    if (resultado.get()==ButtonType.OK){
                                        Fila fila.getTableView().getItems().get(getIndex());
                                        conexion.insmoel(consulta_ "delete From users where id= " + fila.getId());
                                    }
                                }
                            });
                            setGraphic(btneliminar);
                            setText(null);

                        }
                    }
                };
                return cell;
            }
} {
}{
};
    @FXML protected void initialize() throws SQLException {
        conexion=new Conexion();
        colNombre.setMinWidth(90);
        colApellido.setMinWidth(200);
        colCorreo.setMinWidth(400);
        colContrasena.setMinWidth(100);
        colNombre.setCellValueFactory(new PropertyValueFactory<Fila,String>("Nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<Fila,String>("Apellido"));
        colCorreo.setCellValueFactory(new PropertyValueFactory<Fila,String>("Correo"));
        colContrasena.setCellValueFactory(new PropertyValueFactory<Fila,String>("contraseña"));
        colEditar.setCellFactory(celdaEditar);
        colEliminar.setCellFactory(celdaEliminar);
        tabla.getColumns().addAll(colNombre,colApellido,colCorreo,colContrasena, colEliminar, colEditar);
        recargar();
        tabla.setItems(datosTabla);
    }
    public void recargar() throws SQLException {
        ResultSet res=conexion.consultar("SELECT * from products order by id DESC");
        datosTabla.clear();
        if(res != null){
            while (res.next()){
                datosTabla.add(new Fila(
                        res.getObject("Nombre").toString(),
                        res.getObject("Apellido").toString(),
                        res.getObject("Correo").toString(),
                        res.getObject("Contraseña").toString(),

                ));
            }
        }

    }

    public void instertar (ActionEvent event){
        if (!txtnombre.getText().trim().equals("") && !txtapellido.getText().trim().equals("") && !txtcorreo.getText().trim().equals("") && !txtcontra.getText().trim().equals("") ){
            String n=txtnombre.getText();
            String ap=txtapellido.getText();
            String cor=txtcorreo.getText();
            String con=txtcontra.getText();
            conexion.isnmodel("INSERT INTO users (Nombre, Apellido, Cuenta, Contraseña) VALUES ('"+n+
                    "', '"+ap+
                            "', '"+cor+
                            "', '"+con+"')");
            txtnombre.setText("");
            txtapellido.setText("");
            txtcorreo.setText("");
            txtcontra.setText("");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Registro insertado correctamente");
            alert.show;

        }else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Credenciales no validas krnal");
            alert.show;
        }
    }

}
