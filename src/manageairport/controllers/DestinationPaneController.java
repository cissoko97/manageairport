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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.StringConverter;
import manageairport.models.*;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DestinationPaneController implements Initializable, IScreenController {

    private ScreenLoader loader;

    int i = 6;

    static ObservableList<Destination> data;

    @FXML
    private TableView<Destination> tableDest;

    @FXML
    private TextField tPays;

    @FXML
    private TextField tVille;

    @FXML
    private TextField tNom;

    @FXML
    private void handleButtonSave(ActionEvent event) {
        data.add(new Destination("Dest" + i, tPays.getText(), tVille.getText(), tNom.getText()));
        tableDest.refresh();
        i++;
    }

    @FXML
    private void handleButtonEfface(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        data = FXCollections.observableArrayList(
                new Destination("Dest01", "Cameroun", "Yaoundé", "Nsimalen"),
                new Destination("Dest02", "Cameroun", "Douala", "Doul"),
                new Destination("Dest03", "France", "Paris", "Gaule"),
                new Destination("Dest04", "France", "Marseille", "Ghost"),
                new Destination("Dest05", "Canada", "Vancouver", "Bum Bum"));

        StringConverter<Object> sc = new StringConverter<Object>() {
            @Override
            public String toString(Object t) {
                return t == null ? null : t.toString();
            }

            @Override
            public Object fromString(String string) {
                return string;
            }
        };

        TableColumn ID_Dest = new TableColumn();
        ID_Dest.setText("Code de la destination");
        ID_Dest.setMinWidth(15);
        ID_Dest.setResizable(true);
        ID_Dest.setCellValueFactory(new PropertyValueFactory("codeDest"));
        ID_Dest.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn paysD = new TableColumn();
        paysD.setText("Pays de la destination");
        paysD.setMinWidth(15);
        paysD.setResizable(true);
        paysD.setCellValueFactory(new PropertyValueFactory("paysD"));
        paysD.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn villeD = new TableColumn();
        villeD.setText("Ville de la destination");
        villeD.setMinWidth(15);
        villeD.setResizable(true);
        villeD.setCellValueFactory(new PropertyValueFactory("villeD"));
        villeD.setCellFactory(TextFieldTableCell.forTableColumn(sc));
        
        TableColumn nomD = new TableColumn();
        nomD.setText("Nom de la Destination");
        nomD.setMinWidth(15);
        nomD.setResizable(true);
        nomD.setCellValueFactory(new PropertyValueFactory("nomDest"));
        nomD.setCellFactory(TextFieldTableCell.forTableColumn(sc));

        TableColumn selec = new TableColumn();
        selec.setText("Select");
        selec.setMinWidth(15);
        selec.setResizable(true);
        selec.setCellFactory(CheckBoxTableCell.forTableColumn(selec));
        
        tableDest.setItems(data);
        tableDest.setEditable(true);
        tableDest.getColumns().addAll(ID_Dest, paysD, villeD, nomD, selec);

    }

    @Override
    public void setScreenParent(ScreenLoader sl) {
        loader = sl;
    }

}
