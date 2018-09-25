/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageairport.screens;

/**
 *
 * @author HP
 */
public class ScreenDashboard {

    private static final ScreenDashboard INSTANCE = new ScreenDashboard();

    public ScreenDashboard() {
    }

    public static ScreenDashboard getInstance() {
        return INSTANCE;
    }

    // Give a descriptive screen name
    public String SCREEN_DASH_FINANCE = "screen_dash_finance";

    // Define the package where your view files are located
    public String PACKAGE_VIEW = "/manageairport/views/partials/";

    // The actual screen/ui .fxml
    public String DASH_FINANCE_FXML = "FinanceDashBoardPane.fxml";
}
