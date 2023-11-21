/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mariq.rasyid.multiformjfx1;

import com.mariq.rasyid.multiformjfx1.Models.MultiFormJFX1Model;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Blizzard
 */
public class FXMLOutputController implements Initializable {

    @FXML
    private Label lblpembeli;
    @FXML
    private Label lbljenisrumah;
    @FXML
    private Label lblhargarumah;
    @FXML
    private Label lblhasiltanah;
    @FXML
    private Label lblluastanah;
    @FXML
    private Label lblhargatanah;
    @FXML
    private Label lblsubtotal;
    @FXML
    private Label lblpajak;
    @FXML
    private Label lbltotal;
    @FXML
    private Button btnkembali;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void kembaliklik(ActionEvent event) {
        btnkembali.getScene().getWindow().hide();
    }

    public void getdata(MultiFormJFX1Model d) {
        int hrumah = 0, htanah = 0, pajak = 0;
        String jenis = "";
        switch (d.getPilihjenis()) {
            case 0:
                hrumah = FXMLINPUTController.dtharga.getHrsederhana();
                htanah = FXMLINPUTController.dtharga.getHtsederhana();
                jenis = "Sederhana";
                pajak = 0;
                break;
            case 1:
                hrumah = FXMLINPUTController.dtharga.getHrmenengah();
                htanah = FXMLINPUTController.dtharga.getHtmenengah();
                jenis = "Menengah";
                pajak = 0;
                break;
            case 2:
                hrumah = FXMLINPUTController.dtharga.getHrmewah();
                htanah = FXMLINPUTController.dtharga.getHtmewah();
                jenis = "Mewah";
                pajak = (int) Math.round(hrumah * 0.1);
                break;
            default:
                jenis = "tidak ada";
                hrumah = 0;
                htanah = 0;
                pajak = 0;
                int hasiltanah = htanah * d.getLuas();
                int sub = hasiltanah + hrumah;
                int total = sub + pajak;

                lblpembeli.setText(d.getPembeli());
                lbljenisrumah.setText(jenis);
                lblhargarumah.setText(String.valueOf(hrumah));
                lblluastanah.setText(String.valueOf(d.getLuas()));
                lblhargatanah.setText(String.valueOf(htanah));
                lblhasiltanah.setText(String.valueOf(hasiltanah));
                lblsubtotal.setText(String.valueOf(sub));
                lblpajak.setText(String.valueOf(pajak));
                lbltotal.setText(String.valueOf(total));
        }
    }
}
