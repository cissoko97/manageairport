/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.controllers;

import com.zilabs.multiscreenframework.animations.AnimationSettings;
import com.zilabs.multiscreenframework.core.ScreenLoader;
import com.zilabs.multiscreenframework.interfaces.IScreenController;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.layout.AnchorPane;
import manageairport.models.Vol;
import manageairport.screens.ScreenDashboard;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DashBoardPaneController implements Initializable, IScreenController {

    private final ScreenDashboard screen = ScreenDashboard.getInstance();
    private ScreenLoader loader;

    @FXML
    private PieChart chartDest;

    public static ObservableList<PieChart.Data> generateData(List<Vol> lV) {
        int i = 1;
        String d;
        List<PieChart.Data> lPCD = new ArrayList<>();
        Boolean t = false;

        for (int u = 0; u < lV.size(); u++) {
            d = lV.get(u).getDestination();

            for (int z = 0; z < lPCD.size(); z++) {
                if (d.equalsIgnoreCase(lPCD.get(z).getName())) {
                    t = true;
                }
            }

            if (!t) {
                for (int j = u + 1; j < lV.size(); j++) {
                    if (d.equalsIgnoreCase(lV.get(j).getDestination())) {
                        i++;
                    }
                }

                lPCD.add(new PieChart.Data(d, i));
                i = 1;

            }
            t = false;
        }
        return FXCollections.observableArrayList(lPCD);
    }

    @FXML
    private BarChart chartG;
    @FXML
    private CategoryAxis xAxis;
    @FXML
    private NumberAxis yAxis;
    
    @FXML
    private BarChart chart;
    @FXML
    private NumberAxis nAxis;
    @FXML
    private CategoryAxis cAxis;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        List<Vol> lP = new ArrayList<>();
        lP.add(new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        lP.add(new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        lP.add(new Vol("Air000001", new Date(1018, 12, 24), "Paris- Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        lP.add(new Vol("Air000001", new Date(1018, 12, 24), "Paris- Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        lP.add(new Vol("Air000001", new Date(1018, 12, 24), "Paris - Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        lP.add(new Vol("Air000001", new Date(1018, 12, 24), "Paris -Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        lP.add(new Vol("Air000001", new Date(1018, 12, 24), "Paris -Yaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        lP.add(new Vol("Air000001", new Date(1018, 12, 24), "ParisYaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        lP.add(new Vol("Air000001", new Date(1018, 12, 24), "ParisYaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        lP.add(new Vol("Air000001", new Date(1018, 12, 24), "ParisYaoundé", "Spark_Fr_s001", 100, "10h GMT", "16h15 GMT", 100, true, "Aucune"));
        chartDest.setData(generateData(lP));
        chartDest.setClockwise(false);
        String[] years = {"2015", "2016", "2017"};
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(years));
        yAxis = new NumberAxis("DASHBOARD", 0.0d, 3000.0d, 1000.0d);
        chart.setTitle("NOMBRE DE VOLS PAR ANNEES / AVIONS");

        ObservableList<BarChart.Series> barChartData = FXCollections.observableArrayList(
                new BarChart.Series("CAMER_CO", FXCollections.observableArrayList(
                        new BarChart.Data(years[0], 567d),
                        new BarChart.Data(years[1], 1292d),
                        new BarChart.Data(years[2], 1292d)
                )),
                new BarChart.Series("Air France", FXCollections.observableArrayList(
                        new BarChart.Data(years[0], 956),
                        new BarChart.Data(years[1], 1665),
                        new BarChart.Data(years[2], 2559)
                )),
                new BarChart.Series("SN Bruxelle", FXCollections.observableArrayList(
                        new BarChart.Data(years[0], 1154),
                        new BarChart.Data(years[1], 1927),
                        new BarChart.Data(years[2], 2774)
                )),
                new BarChart.Series<>("ALL", FXCollections.observableArrayList(
                        new BarChart.Data(years[0], 2677d),
                        new BarChart.Data(years[1], 4884d),
                        new BarChart.Data(years[2], 6625d)
                ))
        );
        chart.setData(barChartData);
        chart.setBarGap(15);
        
        String[] mois = {"janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
        cAxis = new CategoryAxis();
        int valeurMin = 100000, valeurMax = 5510000, valeurIntermediare;
        if(valeurMin >= 5000){
        valeurMin = valeurMin - 500;
        }
        valeurIntermediare = valeurMin + 5500;
        valeurMax = valeurMax + 500;
        cAxis.setCategories(FXCollections.<String>observableArrayList(mois));
        nAxis = new NumberAxis("Montant Total par type de dépense", valeurMin,valeurMax, valeurIntermediare);
        ObservableList<BarChart.Series> barChartData2 = FXCollections.observableArrayList(new BarChart.Series("Payement Salaire", FXCollections.observableArrayList(
               new BarChart.Data(mois[0], 5510000)
               
            )),
            new BarChart.Series("Achat Carburant", FXCollections.observableArrayList(new BarChart.Data(mois[1], 2500000)
             
            )),
            
            
             new BarChart.Series("Achat Carburant", FXCollections.observableArrayList(new BarChart.Data(mois[2], 2500000)
             
            )),
              new BarChart.Series("Achat Carburant", FXCollections.observableArrayList(new BarChart.Data(mois[3], 2500000)
             
            )),
               new BarChart.Series("Frais de ravitaillement en matériel", FXCollections.observableArrayList(new BarChart.Data(mois[4], 1500000)
            ))  ,
            new BarChart.Series("Frais de Maintenance d'avion", FXCollections.observableArrayList(new BarChart.Data(mois[5], 100000)
            )),
            new BarChart.Series("Frais de connexion internet", FXCollections.observableArrayList(new BarChart.Data(mois[0], 300000)
            ))
                ,
            new BarChart.Series("Frais d'électricité", FXCollections.observableArrayList(new BarChart.Data(mois[4], 300000)
            ))
                  ,
           
            new BarChart.Series("Autre", FXCollections.observableArrayList(new BarChart.Data(mois[2], 200000)
            ))
        );
        //chart = new BarChart(xAxis, yAxis, barChartData, 25.0d);
        int annee = 2018;
        chartG.setTitle("Dépenses au cours du mois de  janvier a juin de l'annee 2017");
        chartG.setData(barChartData2);
         chartG.setBarGap(25.0d);
    }

    @Override
    public void setScreenParent(ScreenLoader sl) {
        loader = sl;
    }
}
