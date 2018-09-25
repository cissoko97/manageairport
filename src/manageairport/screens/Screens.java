/*
 * The MIT License
 *
 * Copyright 2017 Karanja.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package manageairport.screens;

/**
 *
 * @author Karanja <admin.dev@gmail.com>
 *
 * All the screens MUST be defined in this Singleton class.
 *
 */
public class Screens {

    private static final Screens INSTANCE = new Screens();

    private Screens() {
    }

    public static Screens getInstance() {
        return INSTANCE;
    }

    // Define all the screens/containers here
    // Give a descriptive screen name
    public String SCREEN_VOL = "screen_vol";
    public String SCREEN_RESERVATION = "screen_reservation";
    public String SCREEN_USER = "screen_person";
    public String SCREEN_DASHBOARD = "screen_dashboard";
    public String SCREEN_DESTINATION = "screen_destination";
    public String SCREEN_DEPENSE = "screen_depense";
    public String SCREEN_LOGISTIC = "screen_logistic";
    public String SCREEN_PARAMETER = "screen_parameter";
    

    // Define the package where your view files are located
    public String PACKAGE_VIEW = "/manageairport/views/";

    // The actual screen/ui .fxml
    public String VOL_FXML = "VolPane.fxml";
    public String RESERVATION_FXML = "ReservationPane.fxml";
    public String USER_FXML = "PersonPane.fxml";
    public String DASHBOARD_FXML = "DashBoardPane.fxml";
    public String DESTINATION_FXML = "DestinationPane.fxml";
    public String DEPENSE_FXML = "DepensePane.fxml";
    public String LOGISTIC_FXML = "LogisticPane.fxml";
    public String PARAMETER_FXML = "ParameterPane.fxml";
}
