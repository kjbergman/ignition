package co.nz.ignite.model;

import co.nz.ignite.dtoLayer.VehicleDTO;

public class Vehicle {
    private ExtraEquipment extraEquipment;
    private String make;
    private String model;
    private String type;
    private String colour;
    private String stockNumber;
    private double vehiclePrice;
    private double vehicleActualCost;
    private double vehicleRebate;
    private double onRoadCost;
    private double preDeliveryCost = 0.0; // 395.;
    private boolean preDelivery;


    public Vehicle(VehicleDTO vehicleDTO) {
        this.extraEquipment = new ExtraEquipment(vehicleDTO.getExtraEquipment());
        extractDataFromDto(vehicleDTO);
    }

    private void extractDataFromDto(VehicleDTO vehicleDTO){
        setMake(vehicleDTO.getVehicleMake());
        setColour(vehicleDTO.getVehicleColour());
        setModel(vehicleDTO.getVehicleModel());
        setType(vehicleDTO.getVehicleType());
        setVehiclePrice(vehicleDTO.getVehiclePrice());
        setVehicleActualCost(vehicleDTO.getVehicleActualCost());
        setVehicleRebate(vehicleDTO.getVehicleRebate());
        setStockNumber(vehicleDTO.getStockNumber());
        setOnRoadCost(vehicleDTO.getOnRoadCost());
        setPreDelivery(vehicleDTO.isPreDelivery());
    }

    double getVehicleActualCost(){
        return this.vehicleActualCost;
    }

    void setVehicleActualCost(double vehicleActualCost){
        this.vehicleActualCost = vehicleActualCost;
    }

    double getVehiclePrice() {
        return vehiclePrice;
    }

    void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }


    double getVehicleRebate() {
        return vehicleRebate;
    }

    void setVehicleRebate(double vehicleRebate) {
        this.vehicleRebate = vehicleRebate;
    }

    public String getMake() {
        return make;
    }

    public ExtraEquipment getExtraEquipment() {
        return extraEquipment;
    }

    void setMake(String make) {
        this.make = make;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    String getColour() {
        return colour;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    String getStockNumber() {
        return stockNumber;
    }

    void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    double getOnRoadCost() {
        return onRoadCost;
    }

    void setOnRoadCost(double onRoadCost) {
        this.onRoadCost = onRoadCost;
    }

    double getPreDeliveryCost() {
        return preDeliveryCost;
    }

    void setPreDeliveryCost(double preDeliveryCost) {
        this.preDeliveryCost = preDeliveryCost;
    }

    boolean isPreDelivery() {
        return preDelivery;
    }

    void setPreDelivery(boolean preDelivery) {
        this.preDelivery = preDelivery;
    }
}
