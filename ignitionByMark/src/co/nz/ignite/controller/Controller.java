package co.nz.ignite.controller;

import co.nz.ignite.dtoLayer.VehicleDTO;
import co.nz.ignite.model.Vehicle;
import co.nz.ignite.model.VehicleProfit;
import co.nz.ignite.model.VehiclePurchase;


public class Controller {
    Vehicle vehicle;
    VehiclePurchase vehiclePurchase;
    VehicleProfit vehicleProfit;

    public VehicleProfit getProfitMargin(VehicleDTO vehicleDTO){
        this.vehicle = new Vehicle(vehicleDTO);
        this.vehiclePurchase = new VehiclePurchase(this.vehicle);
        this.vehicleProfit = new VehicleProfit(this.vehiclePurchase);
        return this.vehicleProfit;
    }

}
