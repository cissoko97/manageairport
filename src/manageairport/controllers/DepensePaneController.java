/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.controllers;

import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.StringConverter;
import manageairport.models.Depense;
import manageairport.utils.Converter;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DepensePaneController implements Initializable, IScreenController {

    private ScreenLoader loader;
    @FXML
    private ComboBox<String> depenseType;
    @FXML
    private TableView<Depense> depenseTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Set<String> typeSet = new HashSet<>();
        typeSet.add("Paye");
        typeSet.add("Materiel");
        typeSet.add("Caburant");
        typeSet.add("Maintenance");
        typeSet.add("Autre");
        depenseType.getItems().addAll(typeSet);

        final ObservableList<Depense> data = FXCollections.observableArrayList(
                new Depense(14, "Payement Salaire", 1000000, 28, 06, 2018, "Payement du salaire mensuel de Monsieur John Boyer", true),
                new Depense(13, "Achat carburant", 2500000, 28, 06, 2018, "Achat du carburant pour le vol n°: Air000001", true),
                new Depense(12, "Frais de maintenance d'avion", 1000000, 28, 06, 2018, "Frais de maintenance de l'avion n°: Spark_Fr_s001", true),
                new Depense(8, "Frais connexion internet", 300000, 01, 01, 2018, "Payement annuel de la connexion internet de l'entreprise", true),
                new Depense(11, "Frais d'électricité", 300000, 24, 05, 2018, "Payement mensuel de l'électricité de l'entreprise", true),
                new Depense(10, "Frais de ravitaillement en matériel", 1500000, 24, 05, 2018, "Frais de ravitaillement trimestriel en materiel d'impression, de toilette et d'écriture", true),
                new Depense(9, "Autre", 200000, 12, 03, 2018, "Achat d'une nouvelle imprimante pour le secrétariat générale", true),
                new Depense(7, "Payement Salaire", 900000, 28, 06, 2017, "Payement du salaire mensuel de Monsieur John Boyer", true),
                new Depense(6, "Achat carburant", 2500000, 28, 06, 2017, "Achat du carburant pour le vol n°: Air000001", true),
                new Depense(5, "Frais de maintenance d'avion", 600000, 28, 06, 2017, "Frais de maintenance de l'avion n°: Spark_Fr_s001", true),
                new Depense(1, "Frais connexion internet", 30000, 01, 01, 2017, "Payement annuel de la connexion internet de l'entreprise", true),
                new Depense(4, "Frais d'électricité", 150000, 24, 05, 2017, "Payement mensuel de l'électricité de l'entreprise", true),
                new Depense(3, "Frais de ravitaillement en matériel", 500000, 24, 05, 2017, "Frais de ravitaillement trimestriel en materiel d'impression, de toilette et d'écriture", true),
                new Depense(2, "Autre", 250, 12, 03, 2015, "Achat d'une nouvelle cafétière pour la direction générale", true));
        StringConverter sc = Converter.getConverter();

        TableColumn etat = new TableColumn<>();
        etat.setText("Etat");
        etat.setCellValueFactory(new PropertyValueFactory("etat"));
        etat.setCellFactory(CheckBoxTableCell.forTableColumn(etat));

        TableColumn numero = new TableColumn();
        numero.setText("N°");
        numero.setCellValueFactory(new PropertyValueFactory("numero"));
        numero.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn type = new TableColumn();
        type.setText("Type");
        type.setCellValueFactory(new PropertyValueFactory("type"));
        type.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn montant = new TableColumn();
        montant.setText("Montant (en euro)");
        montant.setCellValueFactory(new PropertyValueFactory("montant"));
        montant.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn description = new TableColumn();
        description.setText("Description");
        description.setMinWidth(description.getText().length());
        description.setCellValueFactory(new PropertyValueFactory("description"));
        description.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn jour = new TableColumn();
        jour.setText("Jour");

        jour.setCellValueFactory(new PropertyValueFactory("jour"));
        jour.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn mois = new TableColumn();
        mois.setText("Mois");

        mois.setCellValueFactory(new PropertyValueFactory("mois"));
        mois.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn annee = new TableColumn();
        annee.setText("Année");
        annee.setCellValueFactory(new PropertyValueFactory("annee"));
        annee.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        depenseTable.setItems(data);
        depenseTable.getColumns().addAll(etat, numero, type, montant, description, jour, mois, annee);
    }

    @Override
    public void setScreenParent(ScreenLoader sl) {
        loader = sl;
    }

}
