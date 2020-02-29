package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class controlador implements Initializable{

    @FXML
    private Label res1;

    @FXML
    private Label ciudad;

    @FXML
    private Label res2;

    @FXML
    private Label tipoDoc;

    @FXML
    private Label salidaCiud;

    @FXML
    private ComboBox<String> combo2;

    @FXML
    private ComboBox<String> combo1;

    @FXML
    private Label salidaDoc;
    
    @FXML
    private Button boton1;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        combo1.getItems().removeAll(combo1.getItems());
        combo1.getItems().addAll("Cedula Ciudadania","Tarjeta identidad","Cedula de extrajeria");
        
        combo2.getItems().removeAll(combo2.getItems());
        combo2.getItems().addAll("Bogotá","Cali","Medellin","Barranquilla","Cartagena");
        
    }

    @FXML
    void aplicarDatos(ActionEvent event) {
    	res1.setText(combo1.getValue());
    	res2.setText(combo2.getValue());

    }

    


}
