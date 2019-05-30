package co.nz.ignite.model;

public class VehiclePurchase {
    Vehicle vehicle;
    private double totalGrossMargin;
    private double grossMarginExtras;
    private double totalGrossMarginExcGst;
    private double grossMarginExtrasExcGst;
    private double gstRate = 1.15;

    public VehiclePurchase(Vehicle vehicle) {
        this.vehicle = vehicle;
        setGrossMarginExtras();
        setTotalGrossMargin();
    }

    Vehicle getVehicle() {
        return vehicle;
    }

    void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void setTotalGrossMargin() {
        double discountedPrice = this.vehicle.getVehiclePrice() - this.vehicle.getVehicleRebate() - this.vehicle.getVehicleActualCost();
        double deliveryAndOnRoad = 0;
        if (this.vehicle.isPreDelivery())
            deliveryAndOnRoad += this.vehicle.getPreDeliveryCost();
        deliveryAndOnRoad += this.vehicle.getOnRoadCost();

        this.totalGrossMargin = discountedPrice + deliveryAndOnRoad + getGrossMarginExtras();
    }

    double getTotalGrossMargin() {
        return this.totalGrossMargin;
    }

    public double getTotalGrossMarginExcGst() {
        return getGrossMarginExtras() / this.gstRate;
    }

    public double getGrossMarginExtrasExcGst() {
        return getTotalGrossMargin() / this.gstRate;
    }

    void setGrossMarginExtras(){
        this.grossMarginExtras = vehicle.getExtraEquipment().getAccumulatedPrice() - vehicle.getExtraEquipment().getAccumulatedActualCost();
    }

    double getGrossMarginExtras() {
        return this.grossMarginExtras;
    }
}
