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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.util.StringConverter;
import manageairport.models.Personnel;
import manageairport.models.PersonnelNavigant;
import manageairport.utils.Converter;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class PersonPaneController implements Initializable, IScreenController {

    private ScreenLoader loader;
    @FXML
    private TableView<Personnel> tablePersonnel;
    @FXML
    private VBox photo;
    @FXML
    private Label nometprenom;
    @FXML
    private ImageView profil;
    @FXML
    private TableView<PersonnelNavigant> tablePersonnelOccupe;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

// Liste Personnel
        final String image1 = PersonPaneController.class.getResource("/manageairport/ressources/image1.jpg").toString();
        final String image2 = PersonPaneController.class.getResource("/manageairport/ressources/image2.jpg").toString();
        final String image3 = PersonPaneController.class.getResource("/manageairport/ressources/image3.jpg").toString();
        final String image4 = PersonPaneController.class.getResource("/manageairport/ressources/image4.jpg").toString();
        final String image5 = PersonPaneController.class.getResource("/manageairport/ressources/image1.jpg").toString();
        
        final ObservableList<Personnel> data = FXCollections.observableArrayList(new Personnel("sparksairline_personnel_0001", "Actif", "Ressouces Humaines", "Pilote", "Carter", "Johnson", "Masculin", "carterjohnson@hotmail.com", 23456789, new Date(1017, 01, 1), image1),
                new Personnel("sparksairline_personnel_0004", "Actif", "Sécrétariat générale", "Sécrétaire générale", "Copper", "Mary Jane", "Féminin", "maryjane@gmail.com", 23456789, new Date(1017, 01, 1), image2),
                new Personnel("sparksairline_personnel_0002", "Actif", "Direction Commmerciale et marketing", "Directeur Marketing", "DuBois", "Paul", "Masculin", "pauldubois@yahoo.fr", 23456789, new Date(1017, 01, 1), image2),
                new Personnel("sparksairline_personnel_0003", "Actif", "Ressouces Humaines", "Hôtesse", "Blaster", "Hermine", "Feminin", "hermineblaster@hotmail.com", 23456789, new Date(1018, 8, 5), image3),
                new Personnel("sparksairline_personnel_0000", "Actif", "Direction générale", "Directeur Général", "Sparrow", "Jack", "Masculin", "jacksparrow@gmail.com", 23456789, new Date(1017, 01, 1), image4));

        StringConverter<Object> sc = Converter.getConverter();

        TableColumn id = new TableColumn<>();
        id.setText("Identifiant");
        id.setCellValueFactory(new PropertyValueFactory("id"));
        id.setCellFactory(TextFieldTableCell.forTableColumn(sc));
        id.setEditable(false);

        TableColumn direction = new TableColumn();
        direction.setText("Direction");
        direction.setMinWidth(10);
        direction.setCellValueFactory(new PropertyValueFactory("direction"));
        direction.setCellFactory(TextFieldTableCell.forTableColumn(sc));
        direction.setEditable(false);

        TableColumn poste = new TableColumn();
        poste.setText("Poste");
        poste.setCellValueFactory(new PropertyValueFactory("poste"));
        poste.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn nom = new TableColumn();
        nom.setText("Nom");
        nom.setMinWidth(10);
        nom.setCellValueFactory(new PropertyValueFactory("nom"));
        nom.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn prenoms = new TableColumn();
        prenoms.setText("Prénom(s)");
        prenoms.setMinWidth(50);
        prenoms.setCellValueFactory(new PropertyValueFactory("prenoms"));
        prenoms.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn sexe = new TableColumn();
        sexe.setText("Sexe");
        sexe.setMinWidth(50);
        sexe.setCellValueFactory(new PropertyValueFactory("sexe"));
        sexe.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn email = new TableColumn();
        email.setText("Email");
        email.setMinWidth(10);
        email.setCellValueFactory(new PropertyValueFactory("email"));
        email.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn telephone = new TableColumn();
        telephone.setText("Téléphone");
        telephone.setMinWidth(50);
        telephone.setCellValueFactory(new PropertyValueFactory("telephone"));
        telephone.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn etat = new TableColumn();
        etat.setText("Etat");
        etat.setMinWidth(50);
        etat.setCellValueFactory(new PropertyValueFactory("etat"));
        etat.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn dateCreationProfil = new TableColumn();
        dateCreationProfil.setText("Date de création du profil");
        dateCreationProfil.setMinWidth(10);
        dateCreationProfil.setCellValueFactory(new PropertyValueFactory("dateCreationProfil"));
        dateCreationProfil.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        tablePersonnel.getColumns().addAll(id, direction, poste, nom, prenoms, sexe, email, telephone, etat, dateCreationProfil);
        tablePersonnel.setEditable(true);
        tablePersonnel.setItems(data);
        //Photo de profil d'un personnel
        profil.setImage(new Image(image1));
        nometprenom.setText("Carter Johnson");

        //Programme actuel du personnel naviguant
        final ObservableList<PersonnelNavigant> data1 = FXCollections.observableArrayList(new PersonnelNavigant("Carter Johnson", "Pilote N°1", "Vol N°5"),
                new PersonnelNavigant("Duval Peter", "Maintenancier", "5"),
                new PersonnelNavigant("Blaster Hermine", "Hôtesse N°1", "5"),
                new PersonnelNavigant("Boyer Lima", "Pilote N°2", "5"),
                new PersonnelNavigant("Franck Duval", "Steward N°1", "5"),
                new PersonnelNavigant("Stacy McDonald", "Hôtesse N°2", "5"),
                new PersonnelNavigant("Franck Duval", "Steward N°2", "5"));

        

        TableColumn nometprenom = new TableColumn<>();
        nometprenom.setText("Noms et Prénoms");
        nometprenom.setCellValueFactory(new PropertyValueFactory("nometprenom"));
        nometprenom.setCellFactory(TextFieldTableCell.forTableColumn(sc));
        nometprenom.setEditable(false);

        TableColumn poste1 = new TableColumn();
        poste1.setText("Direction");
        poste1.setMinWidth(10);
        poste1.setCellValueFactory(new PropertyValueFactory("poste"));
        poste1.setCellFactory(TextFieldTableCell.forTableColumn(sc));
        poste1.setEditable(false);

        TableColumn nomVol = new TableColumn();
        nomVol.setText("Numéro du vol");
        nomVol.setMinWidth(10);
        nomVol.setCellValueFactory(new PropertyValueFactory("nomVol"));
        nomVol.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        
        tablePersonnelOccupe.getColumns().addAll(nometprenom, poste1, nomVol);
        tablePersonnelOccupe.setEditable(true);
        tablePersonnelOccupe.setItems(data1);
    }

    @Override
    public void setScreenParent(ScreenLoader sl) {
        loader = sl;
    }

}

