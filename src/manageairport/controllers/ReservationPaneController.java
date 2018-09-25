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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.StringConverter;
import manageairport.models.Reservation;
import manageairport.utils.Converter;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ReservationPaneController implements Initializable, IScreenController {
    
        private ScreenLoader loader;
    
    @FXML
    private TableView tableReservation;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        final ObservableList<Reservation> data = FXCollections.observableArrayList(new Reservation("Kate", "vol1", true, new Date(2018, 12, 24), "Middleton", "kate@gmail.com", 23, 12345678, 234567890),
                new Reservation("Kate", "vol1", true, new Date(2018, 12, 24), "Middleton", "kate@gmail.com", 23, 12345678, 234567890),
                new Reservation("Kate", "vol1", true, new Date(2018, 12, 24), "Middleton", "kate@gmail.com", 23, 12345678, 234567890),
                new Reservation("Kate", "vol1", true, new Date(2018, 12, 24), "Middleton", "kate@gmail.com", 23, 12345678, 234567890),
                new Reservation("Kate", "vol1", true, new Date(2018, 12, 24), "Middleton", "kate@gmail.com", 23, 12345678, 234567890));

        StringConverter<Object> sc = Converter.getConverter();
        
        TableColumn ID_vol = new TableColumn<>();
        ID_vol.setText("ID Vol");
        ID_vol.setCellValueFactory(new PropertyValueFactory("id_vol"));
        ID_vol.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn etat_reservation = new TableColumn();
        etat_reservation.setText("Etat");
        etat_reservation.setMinWidth(10);
        etat_reservation.setCellValueFactory(new PropertyValueFactory("etat_reservation"));
        etat_reservation.setCellFactory(CheckBoxTableCell.forTableColumn(etat_reservation));
        etat_reservation.setEditable(false);

        TableColumn date_reservation = new TableColumn();
        date_reservation.setText("Date");
        date_reservation.setCellValueFactory(new PropertyValueFactory("date_reservation"));
        date_reservation.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn numero_carte_client = new TableColumn();
        numero_carte_client.setText("Numero ID");
        numero_carte_client.setMinWidth(10);
        numero_carte_client.setCellValueFactory(new PropertyValueFactory("numero_carte_client"));
        numero_carte_client.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn nom_client = new TableColumn();
        nom_client.setText("Nom");
        nom_client.setMinWidth(50);
        nom_client.setCellValueFactory(new PropertyValueFactory("nom_client"));
        nom_client.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn prenom_client = new TableColumn();
        prenom_client.setText("Prenom");
        prenom_client.setMinWidth(50);
        prenom_client.setCellValueFactory(new PropertyValueFactory("prenom_client"));
        prenom_client.setCellFactory(TextFieldTableCell.forTableColumn(sc));
        
        TableColumn age_client = new TableColumn();
        age_client.setText("Age");
        age_client.setMinWidth(10);
        age_client.setCellValueFactory(new PropertyValueFactory("age_client"));
        age_client.setCellFactory(TextFieldTableCell.forTableColumn(sc));
        
        TableColumn email_client = new TableColumn();
        email_client.setText("Email");
        email_client.setMinWidth(50);
        email_client.setCellValueFactory(new PropertyValueFactory("email_client"));
        email_client.setCellFactory(TextFieldTableCell.forTableColumn(sc));
        
        TableColumn telephone_client = new TableColumn();
        telephone_client.setText("Téléphone");
        telephone_client.setMinWidth(50);
        telephone_client.setCellValueFactory(new PropertyValueFactory("telephone_client"));
        telephone_client.setCellFactory(TextFieldTableCell.forTableColumn(sc));
        telephone_client.setCellFactory(ComboBoxTableCell.forTableColumn(sc));
        
        tableReservation.getColumns().addAll(ID_vol, etat_reservation, date_reservation, numero_carte_client,nom_client,prenom_client,age_client,email_client,telephone_client);
        tableReservation.setEditable(Boolean.FALSE);
        tableReservation.setItems(data);
    }

    @Override
    public void setScreenParent(ScreenLoader sl) {
        loader = sl;
    }

}
