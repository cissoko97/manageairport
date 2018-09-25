/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.controllers;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import com.zilabs.multiscreenframework.animations.AnimationSettings;
import com.zilabs.multiscreenframework.core.ScreenLoader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.ObjectProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import manageairport.screens.Screens;

/**
 *
 * @author Henderson
 */
public class IndexFxmlController implements Initializable {

    private final ScreenLoader loader = new ScreenLoader();
    private final Screens screen = Screens.getInstance();

    @FXML
    private JFXDrawer drawer;
    @FXML
    private JFXHamburger hamber;
    @FXML
    private AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            loader.setWrapperAnchorPane(root);

            loader.allowAnimation(AnimationSettings.ANIMATION_ON);
            loader.setAnimationType(AnimationSettings.ANIMATION_FADE);
            loader.setAnimationDuration(1);

            loader.loadScreen(screen.SCREEN_VOL, screen.PACKAGE_VIEW + screen.VOL_FXML);
            loader.loadScreen(screen.SCREEN_RESERVATION, screen.PACKAGE_VIEW + screen.RESERVATION_FXML);
            loader.loadScreen(screen.SCREEN_USER, screen.PACKAGE_VIEW + screen.USER_FXML);
            loader.loadScreen(screen.SCREEN_DASHBOARD, screen.PACKAGE_VIEW + screen.DASHBOARD_FXML);
            loader.loadScreen(screen.SCREEN_DESTINATION, screen.PACKAGE_VIEW + screen.DESTINATION_FXML);
            loader.loadScreen(screen.SCREEN_DEPENSE, screen.PACKAGE_VIEW + screen.DEPENSE_FXML);
            loader.loadScreen(screen.SCREEN_LOGISTIC, screen.PACKAGE_VIEW + screen.LOGISTIC_FXML);
            loader.loadScreen(screen.SCREEN_PARAMETER, screen.PACKAGE_VIEW + screen.PARAMETER_FXML);

            // Load the initial (first) screen
            loader.setScreen(screen.SCREEN_VOL);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            VBox vb = FXMLLoader.load(getClass().getResource("/manageairport/views/HamberContent.fxml"));

            drawer.setSidePane(vb);

            for (Node node : vb.getChildren()) {
                if (node.getAccessibleText() != null) {
                    node.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            switch (node.getAccessibleText()) {
                                case "VOLE":
                                    loader.setScreen(screen.SCREEN_VOL);
                                    System.out.println("VOLE");
                                    //root.setBackground(new Background(new BackgroundFill(Paint.valueOf("#4CAF50"), CornerRadii.EMPTY, Insets.EMPTY)));
                                    break;
                                case "RESERVATION":
                                    //root.setBackground(new Background(new BackgroundFill(Paint.valueOf("#0288D1"), CornerRadii.EMPTY, Insets.EMPTY)));
                                    loader.setScreen(screen.SCREEN_RESERVATION);
                                    System.out.println("RESERVATION");
                                    break;
                                case "USER":
                                    //root.setBackground(new Background(new BackgroundFill(Paint.valueOf("#4CAF50"), CornerRadii.EMPTY, Insets.EMPTY)));
                                    loader.setScreen(screen.SCREEN_USER);
                                    System.out.println("USER");
                                    break;
                                case "DASHBOARD":
                                    loader.setScreen(screen.SCREEN_DASHBOARD);
                                    System.out.println("DASHBOARD");
                                    break;
                                case "DESTINATION":
                                    loader.setScreen(screen.SCREEN_DESTINATION);
                                    System.out.println("DESTINATION");
                                    break;
                                case "DEPENSE":
                                    loader.setScreen(screen.SCREEN_DEPENSE);
                                    System.out.println("DEPENSE");
                                    break;
                                case "LOGISTIC":
                                    loader.setScreen(screen.SCREEN_LOGISTIC);
                                    System.out.println("LOGISTIC");
                                    break;

                                case "FOOTER":
                                    //System.exit(0);
                                    ObjectProperty<String> v = node.accessibleTextProperty();

                                    if (node.getAccessibleText() != null) {
                                        System.err.println("Param");

                                        switch (node.getAccessibleText()) {
                                            case "PARAMETER":
                                                System.out.println("PARAMETER");
                                                //root.setBackground(new Background(new BackgroundFill(Paint.valueOf("#4CAF50"), CornerRadii.EMPTY, Insets.EMPTY)));
                                                break;
                                            case "EXIT":
                                                System.out.println("EXIT");
                                                break;
                                        }
                                    }
                                    System.out.println("exit");
                                    break;
                            }
                        }

                    });
                }
            }

            HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamber);
            transition.setRate(-1);
            hamber.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                transition.setRate(transition.getRate() * -1);
                transition.play();
                if (!drawer.isShown()) {
                    drawer.open();
                } else {
                    drawer.close();
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(IndexFxmlController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
