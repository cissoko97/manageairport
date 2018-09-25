/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.controllers;

import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.StringConverter;
import manageairport.models.Avion;
import manageairport.models.Vol;
import manageairport.utils.Converter;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class LogisticPaneController implements Initializable, IScreenController {

    private ScreenLoader loader;
     @FXML
    private TableView<Avion> tableVole;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            final ObservableList<Avion> dat = FXCollections.observableArrayList(
               new Avion("BSN103","Bruxelle Airline", 300, "Bruxelle",true),
               new Avion("FR203","France Airline", 400, "FRANCE",true),
               new Avion("TRQ100","Truk Airline", 300, "TURQUE",true),
               new Avion("USS203","COLORADO", 500, "USA",true),
               new Avion("TRQ070","Truk Airline", 100, "TURQUE",true)
            );
        StringConverter<Object> sc = Converter.getConverter();

        TableColumn ID_vol = new TableColumn<>();
        ID_vol.setText("ID Vol");
        ID_vol.setResizable(false);
        ID_vol.setCellValueFactory(new PropertyValueFactory("idvol"));
        ID_vol.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn etat_vol = new TableColumn();
        etat_vol.setText("Etat");
        etat_vol.setMinWidth(15);
        etat_vol.setResizable(true);
        etat_vol.setCellValueFactory(new PropertyValueFactory("etat"));
        etat_vol.setCellFactory(CheckBoxTableCell.forTableColumn(etat_vol));

        TableColumn name_av = new TableColumn();
        name_av.setText("Name");
        name_av.setMinWidth(150);
        name_av.setResizable(false);
        name_av.setCellValueFactory(new PropertyValueFactory("name"));
        name_av.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn marque_av = new TableColumn();
        marque_av.setText("Marque");
        marque_av.setMinWidth(50);
        marque_av.setCellValueFactory(new PropertyValueFactory("marque"));
        marque_av.setCellFactory(TextFieldTableCell.forTableColumn(sc));


        TableColumn nombre_place_avion = new TableColumn();
        nombre_place_avion.setText("Nombre Places Avion");
         nombre_place_avion.setMinWidth(150);
        nombre_place_avion.setCellValueFactory(new PropertyValueFactory("nbplaces"));
        nombre_place_avion.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        

        tableVole.setItems(dat);
        tableVole.setEditable(Boolean.FALSE);
        tableVole.getColumns().addAll(ID_vol, etat_vol,name_av, marque_av, nombre_place_avion);

    }

    @Override
    public void setScreenParent(ScreenLoader sl) {
        loader = sl;
    }

}
