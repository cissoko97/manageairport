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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ConnexionController implements Initializable {

    @FXML
    private TextField login;

    @FXML
    private TextField password;

    
    @FXML
    private AnchorPane Pane;

    /**
     * an Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void ConnectEvent(ActionEvent event) {
        System.err.println(login.getText() + " " + password.getText());
        String Login = login.getText();
        String pass = password.getText();

        if (Login.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("ck") ) {
            try {
                Stage stage1 = (Stage) Pane.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("/manageairport/views/indexFxml.fxml"));
                
                
                Stage stage = new Stage();
                stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/manageairport/ressources/autopilot.png")));
                stage.setScene(new Scene(root));
                
                
                stage1.close();
                stage.show();
                
                
            } catch (IOException ex) {
                Logger.getLogger(ConnexionController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            //errorText.setText("mot de passe incorect");
        }

    }
}
