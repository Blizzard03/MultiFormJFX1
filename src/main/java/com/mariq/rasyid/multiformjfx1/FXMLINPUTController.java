/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mariq.rasyid.multiformjfx1;

import com.mariq.rasyid.multiformjfx1.Models.MultiFormJFX1Model;
import com.mariq.rasyid.multiformjfx1.FXMLOutputController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Blizzard
 */
public class FXMLINPUTController implements Initializable {

    MultiFormJFX1Model dt = new MultiFormJFX1Model();
    @FXML
    private TextField txtpembeli;
    @FXML
    private TextField txtluas;
    @FXML
    private ComboBox<String> chbrumah;
    @FXML
    private Button btnmodal;
    @FXML
    private Button btnmodeless;
    @FXML
    private Button btnhapus;
    @FXML
    private Button btnkeluar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        chbrumah.setItems(FXCollections.observableArrayList(
                "Sederhana", "Menengah", "Mewah"));
        chbrumah.getSelectionModel().select(0); //supaya lgs pilihan awal

    }

    @FXML
    private void modalklik(ActionEvent event) {
        dt.setLuas(Integer.parseInt(txtluas.getText()));
        dt.setPembeli(txtpembeli.getText());
        dt.setPilihjenis(chbrumah.getSelectionModel().getSelectedIndex());
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mariq/rasyid/multiformjfx1/FXMLOutput.fxml"));
            Parent root = (Parent) loader.load();
            //koding untuk mengirim data ke tampilan output
            FXMLOutputController isidt
                    = (FXMLOutputController) loader.getController();
            isidt.getdata(dt);
            //membuat windows baru
            Scene scene = new Scene(root);
            Stage stg = new Stage();
            //koding untuk windows dialog / modal       
            stg.initModality(Modality.APPLICATION_MODAL);
            stg.setResizable(false);
            stg.setIconified(false);
            // koding untuk / menampilkan windows 
            stg.setScene(scene);
            stg.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void modelklik(ActionEvent event) {
        dt.setLuas(Integer.parseInt(txtluas.getText()));
        dt.setPembeli(txtpembeli.getText());
        dt.setPilihjenis(chbrumah.getSelectionModel().getSelectedIndex());
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mariq/rasyid/multiformjfx1/FXMLOutput.fxml"));
            Parent root = (Parent) loader.load();
            //koding untuk mengirim data ke tampilan output
            FXMLOutputController isidt
                    = (FXMLOutputController) loader.getController();
            isidt.getdata(dt);
            //membuat windows baru
            Scene scene = new Scene(root);
            Stage stg = new Stage();
            //koding untuk windows dialog / modal       

            stg.setResizable(false);
            stg.setIconified(false);
            // koding untuk / menampilkan windows 
            stg.setScene(scene);
            stg.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void hapusklik(ActionEvent event) {
        txtpembeli.setText("");
        txtluas.setText("");
        chbrumah.setValue("");

    }

    @FXML
    private void keluarklik(ActionEvent event) {
        System.exit(0);
    }

}
