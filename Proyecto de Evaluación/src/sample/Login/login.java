package sample.Login;


import sample.Login.Modelos.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;

public class login {
    private Conexion conexion;
    @FXML
    TextField txtUsuarios;
    @FXML
    TextField txtpassword;

    @FXML
    protected void initialize() throws SQLException {
        conexion = new Conexion();
    }



    public void Simulador(ActionEvent event) throws IOException, SQLException {
        String imamail=txtUsuarios.getText();
        String passwuord=txtpassword.getText();
        ResultSet resultSet = conexion.consultar("select * from users where e_mail= 'adm"+imamail+"' and password= '"+passwuord+"' ");
        if (resultSet != null) {
           int contador=0;


            while (resultSet.next()){
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Bienvenido");
                alert.setContentText("Bienvenido " + resultSet.getObject("Nombre"));
                alert.show;
                cont++;
            }
            if (contador==0){
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setContentText("Credenciales no validas krnal");
                alert.show;
        }else {
                Parent root = FXMLLoader.load(getClass().getResource("../Simulador/simulador.fxml"));
                Scene scene = new Scene(root);
                Main.stage.setScene(scene);

            }

    }

    /*public void info(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../Centro_de_Atencion/centro_de_atenciones.fxml"));
        Scene scene= new Scene(root);
        Main.stage.setScene(scene);
    }
    public void sintomas (ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../Sintomas/sintomas.fxml"));
        Scene scene= new Scene(root);
        Main.stage.setScene(scene);
    }
    public void informacion(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../Informacion/informacion.fxml"));
        Scene scene= new Scene(root);
        Main.stage.setScene(scene);
    }

    }*/
    }
}