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
import manageairport.models.Vol;
import manageairport.utils.Converter;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class VolPaneController implements Initializable, IScreenController {

    private ScreenLoader loader;
    @FXML
    private TableView<Vol> tableVole;
    @FXML
    private TableView<Vol> tableClient;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        final ObservableList<Vol> data = FXCollections.observableArrayList(
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"),
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"),
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"),
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"),
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"),
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"),
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"),
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"),
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"),
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"),
                new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        
        StringConverter<Object> sc = Converter.getConverter();

        TableColumn ID_vol = new TableColumn<>();
        ID_vol.setText("ID Vol");
        ID_vol.setResizable(false);
        ID_vol.setCellValueFactory(new PropertyValueFactory("id_vol"));
        ID_vol.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn etat_vol = new TableColumn();
        etat_vol.setText("Etat");
        etat_vol.setMinWidth(15);
        etat_vol.setResizable(false);
        etat_vol.setCellValueFactory(new PropertyValueFactory("etat_vol"));
        etat_vol.setCellFactory(CheckBoxTableCell.forTableColumn(etat_vol));

        TableColumn date_vol = new TableColumn();
        date_vol.setText("Date");
        date_vol.setResizable(false);
        date_vol.setCellValueFactory(new PropertyValueFactory("date_vol"));
        date_vol.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn destination = new TableColumn();
        destination.setText("Destination");
        destination.setMinWidth(50);
        destination.setCellValueFactory(new PropertyValueFactory("destination"));
        destination.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn escale = new TableColumn();
        escale.setText("Escale");
        escale.setMinWidth(50);
        escale.setCellValueFactory(new PropertyValueFactory("escale"));
        escale.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn heure_depart = new TableColumn();
        heure_depart.setText("Départ");
        heure_depart.setMinWidth(200);
        heure_depart.setCellValueFactory(new PropertyValueFactory("heure_depart"));
        heure_depart.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn heure_arrivee = new TableColumn();
        heure_arrivee.setText("Arrivée");
        heure_arrivee.setMinWidth(50);
        heure_arrivee.setCellValueFactory(new PropertyValueFactory("heure_arrivee"));
        heure_arrivee.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn id_avion = new TableColumn();
        id_avion.setText("ID Avion");
        id_avion.setMinWidth(50);
        id_avion.setCellValueFactory(new PropertyValueFactory("id_avion"));
        id_avion.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn nombre_place_avion = new TableColumn();
        nombre_place_avion.setText("Nombre Places Avion");
        nombre_place_avion.setCellValueFactory(new PropertyValueFactory("nombre_place_avion"));
        nombre_place_avion.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn nombre_personnes = new TableColumn();
        nombre_personnes.setText("Nombre de Personnes");
        nombre_personnes.setMinWidth(50);
        nombre_personnes.setCellValueFactory(new PropertyValueFactory("nombre_personnes"));
        nombre_personnes.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        tableVole.setItems(data);
        tableVole.setEditable(Boolean.FALSE);
        tableVole.getColumns().addAll(ID_vol, etat_vol, date_vol, destination, escale, heure_depart, heure_arrivee, id_avion, nombre_place_avion, nombre_personnes);

        tableClient.setItems(data);
        tableClient.setEditable(Boolean.FALSE);
        tableClient.getColumns().addAll(ID_vol, etat_vol, date_vol, destination, escale, heure_depart, heure_arrivee, id_avion, nombre_place_avion, nombre_personnes);
    }

    @Override
    public void setScreenParent(ScreenLoader sl) {
        loader = sl;
    }

}
