package mx.edu.utez.u2_t1_05_formulario;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label lblnombre = new Label("Nombre");
        lblnombre.setStyle("-fx-text-fill: black;");
        TextField tfnombre = new TextField();
        Label lblapellido = new Label("Apellido");
        lblapellido.setStyle("-fx-text-fill: black;");
        TextField tfapellido = new TextField();
        Label lbledad = new Label("Edad");
        lbledad.setStyle("-fx-text-fill: black;");
        TextField tfedad = new TextField();
        Label lblResultado = new Label("Resultado");
        ObservableList<String> roles = FXCollections.observableArrayList("Admin","Estudiante","Profesor");
        ComboBox<String> cbResultado = new ComboBox<>(roles);


        Button btnCrear = new Button("Crear");
        Button btnReset = new Button("Reset");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        root.add(lblnombre, 0, 0);
        root.add(tfnombre, 1, 0);
        root.add(lblapellido, 0, 1);
        root.add(tfapellido, 1, 1);
        root.add(lbledad, 0, 2);
        root.add(tfedad, 1, 2);
        root.add(cbResultado, 1, 3);
        root.add(lblResultado, 1, 5);
        root.add(btnCrear, 1, 6);
        root.add(btnReset, 2, 6);

        btnCrear.setOnAction(e -> {
            String nombre = tfnombre.getText();
            String apellido = tfapellido.getText();
            String rol = cbResultado.getSelectionModel().getSelectedItem();
            int edad = Integer.parseInt(tfedad.getText());

            if (nombre.isEmpty() || apellido.isEmpty() || edad == 0) {

                lblResultado.setText("No puede dejar un campo vacio");

            }else{
                lblResultado.setStyle("-fx-text-fill: lightblue;");
                root.setStyle("-fx-background-color: green;");
                lblResultado.setText("El nombre es " + nombre + " y apellido es " + apellido + " y edad " + "y su rol es " + rol);
                tfnombre.setStyle("-fx-border-color: lightblue; -fx-border-width: 5;");
                tfapellido.setStyle("-fx-border-color: lightblue; -fx-border-width: 5;");
                tfedad.setStyle("-fx-border-color: lightblue; -fx-border-width: 5;");

            }
        });
        btnReset.setOnAction(e -> {
            lblResultado.setText("");
            tfedad.setText("");
            tfapellido.setText("");
            tfnombre.setText("");
            cbResultado.getSelectionModel().clearSelection();
            root.setStyle("-fx-background-color: white;");
            tfnombre.setStyle("-fx-border-color: default;");
            tfapellido.setStyle("-fx-border-color: default;");
            tfedad.setStyle("-fx-border-color: default;");

        });

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}