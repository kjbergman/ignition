package co.nz.ignite.main;

import co.nz.ignite.controller.Controller;
import co.nz.ignite.view.View;

/**
 * Starts the app
 */
public class StartApp {
    /*public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
    */

    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new View(controller);
        view.buttonEvent();

    }
}
