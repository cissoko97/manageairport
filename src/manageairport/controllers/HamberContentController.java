/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class HamberContentController implements Initializable{

    @FXML
    private void handlerParameter(ActionEvent event) {
        try {
            System.err.println("Parameter");
            FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("/manageairport/views/ParameterPane.fxml"));
            Parent root = fXMLLoader.load();
           
            Stage stage = new Stage();
            stage.setTitle("Parameter");
            stage.setScene(new Scene(root));
            stage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(HamberContentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void exitApp(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    
}
