package co.nz.ignite.view;

import co.nz.ignite.controller.Controller;
import co.nz.ignite.dtoLayer.VehicleDTO;
import co.nz.ignite.model.VehicleProfit;
import view.swing.VehiclePage;

public class View {
    Controller controller;
    VehicleDTO vehicleDTO;
    VehicleProfit vehicleProfit;


    public View(Controller controller) {
        this.controller = controller;
        VehiclePage vehiclePage = new VehiclePage();

    }

    public void buttonEvent(){
        VehicleDTO vehicleDTO = new VehicleDTO();
        vehicleProfit = controller.getProfitMargin(vehicleDTO);
        System.out.println("Here's some data! ");

        System.out.println("Extras gross margin: " + vehicleProfit.getGrossMarginExtrasExcGst());
        System.out.println("Extras gross margin GST: " + vehicleProfit.getGrossMarginExtras());

        System.out.println("Total gross margin: " + vehicleProfit.getTotalGrossMarginExcGst());
        System.out.println("Total gross margin GST: " + vehicleProfit.getTotalGrossMargin());
    }
}
