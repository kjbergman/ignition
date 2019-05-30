package co.nz.ignite.dtoLayer;

import java.util.ArrayList;

/**
 * Created by jesperbergman on 2018-03-24.
 */
public class VehicleDTO {
    private String vehicleType;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleColour;
    private String stockNumber;
    private Double vehiclePrice;
    private Double vehicleActualCost;
    private Double vehicleRebate;
    private Double onRoadCost;
    private boolean preDelivery;
    private ArrayList<ExtraEquipmentDTO> extraEquipment;

    public VehicleDTO() {
    }

    public String getVehicleType() {
        vehicleType = "Passenger";
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleMake() {
        vehicleMake = "Mitsubishi";
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        vehicleModel = "TRITON GLXR MAN 4X4";
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleColour() {
        vehicleColour = "WHITE";
        return vehicleColour;
    }

    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }

    public String getStockNumber() {
        stockNumber = "785899";
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Double getVehicleActualCost() {
        vehicleActualCost = 35500.0;
        return vehicleActualCost;
    }

    public double getVehiclePrice() {
        vehiclePrice = 51990.0;
        return vehiclePrice;
    }

    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public double getVehicleRebate() {
        vehicleRebate = 13990.0;
        return vehicleRebate;
    }

    public void setVehicleRebate(double vehicleRebate) {
        this.vehicleRebate = vehicleRebate;
    }

    public double getOnRoadCost() {
        onRoadCost = 600.0;
        onRoadCost = 0.;
        return onRoadCost;
    }

    public void setOnRoadCost(double onRoadCost) {
        this.onRoadCost = onRoadCost;
    }

    public boolean isPreDelivery() {
        preDelivery = true;
        return preDelivery;
    }

    public void setPreDelivery(boolean preDelivery) {
        this.preDelivery = preDelivery;
    }

    public ArrayList<ExtraEquipmentDTO> getExtraEquipment() {
        ExtraEquipmentDTO ee1 = new ExtraEquipmentDTO("Bonnet Protector (p)", 0,0, false);
        ExtraEquipmentDTO ee2 = new ExtraEquipmentDTO("Cargo Liner (p)", 210,232.25, true);
        ExtraEquipmentDTO ee3 = new ExtraEquipmentDTO("Fab Protection (p)", 3200,40, true);
        ExtraEquipmentDTO ee4 = new ExtraEquipmentDTO("Fire Extinguisher (p)", 800,49.15, true);
        ExtraEquipmentDTO ee5 = new ExtraEquipmentDTO("Fog Lamps (p)", 0,0, false);
        ExtraEquipmentDTO ee6 = new ExtraEquipmentDTO("Mats (rubber or carpet) (p)", 0,0, false);
        ExtraEquipmentDTO ee7 = new ExtraEquipmentDTO("Mud Flaps (p)", 0,0, false);
        ExtraEquipmentDTO ee8 = new ExtraEquipmentDTO("Paint Protection (p)", 0,0, false);
        ExtraEquipmentDTO ee9 = new ExtraEquipmentDTO("Parking Sensors (p)", 1,661, true);
        ExtraEquipmentDTO ee10 = new ExtraEquipmentDTO("Rear bumper scuff plate (p)", 1190,143, true);
        ExtraEquipmentDTO ee11 = new ExtraEquipmentDTO("Reversing Camera (p)", 0,0, false);
        ExtraEquipmentDTO ee12 = new ExtraEquipmentDTO("Roof Racks (p)", 650,667, true);
        ExtraEquipmentDTO ee13 = new ExtraEquipmentDTO("Seat Covers (p)", 0,0, false);
        ExtraEquipmentDTO ee14 = new ExtraEquipmentDTO("Tow Bar (p)", 1190,985, true);
        extraEquipment = new ArrayList<>();
        extraEquipment.add(ee1);
        extraEquipment.add(ee2);
        extraEquipment.add(ee3);
        extraEquipment.add(ee4);
        extraEquipment.add(ee5);
        extraEquipment.add(ee6);
        extraEquipment.add(ee7);
        extraEquipment.add(ee8);
        extraEquipment.add(ee9);
        extraEquipment.add(ee10);
        extraEquipment.add(ee11);
        extraEquipment.add(ee12);
        extraEquipment.add(ee13);
        extraEquipment.add(ee14);


        return extraEquipment;
    }

    public void setExtraEquipment(ArrayList<ExtraEquipmentDTO> extraEquipment) {

        this.extraEquipment = extraEquipment;
    }
}
