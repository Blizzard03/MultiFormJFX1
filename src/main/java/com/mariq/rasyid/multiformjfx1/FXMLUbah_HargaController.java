/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mariq.rasyid.multiformjfx1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Blizzard
 */
public class FXMLUbah_HargaController implements Initializable {

    @FXML
    private TextField txthrsederhana;
    @FXML
    private TextField txthrmenengah;
    @FXML
    private TextField txthrmewah;
    @FXML
    private TextField txthtsederhana;
    @FXML
    private TextField txthtmenengah;
    @FXML
    private TextField txthtmewah;
    @FXML
    private Button btnok;
    @FXML
    private Button btnreset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void okklik(ActionEvent event) {
    FXMLINPUTController.dtharga.setHrsederhana(Integer.parseInt(txthrsederhana.getText()));
    FXMLINPUTController.dtharga.setHrmenengah(Integer.parseInt(txthrmenengah.getText()));
    FXMLINPUTController.dtharga.setHrmenengah(Integer.parseInt(txthrmewah.getText()));
    FXMLINPUTController.dtharga.setHtsederhana(Integer.parseInt(txthrsederhana.getText()));
    FXMLINPUTController.dtharga.setHtmenengah(Integer.parseInt(txthtmenengah.getText()));
    FXMLINPUTController.dtharga.setHtmenengah(Integer.parseInt(txthtmewah.getText()));
    }

    @FXML
    private void resetklik(ActionEvent event) {
        Alert art = new Alert(Alert.AlertType.CONFIRMATION, "Apakah data ini akan direset ulang", ButtonType.YES, ButtonType.NO);
        art.showAndWait();
        if (art.getResult() == ButtonType.YES) {
            txthrsederhana.setText("50000000");
            txthrmenengah.setText("100000000");
            txthrmewah.setText("500000000");
            txthtsederhana.setText("500000");
            txthtmenengah.setText("800000");
            txthtmewah.setText("2000000");
        }
        txthrsederhana.isFocused();
    }

}
