/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.controllers;

import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ParameterPaneController implements Initializable, IScreenController {

    private ScreenLoader loader;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void setScreenParent(ScreenLoader sl) {
        loader = sl;
    }

}
