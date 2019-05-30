package co.nz.ignite.model;


import co.nz.ignite.util.UtilMethods;

public class VehicleProfit {
    private VehiclePurchase vehiclePurchase;
    private double totalGrossMargin;
    private double grossMarginExtras;
    private double totalGrossMarginExcGst;
    private double grossMarginExtrasExcGst;

    public VehicleProfit(VehiclePurchase vehiclePurchase) {
        this.vehiclePurchase = vehiclePurchase;
    }

    public double getTotalGrossMargin() {
        return UtilMethods.round(this.vehiclePurchase.getTotalGrossMargin(),0);
    }

    public double getGrossMarginExtras() {
        return UtilMethods.round(this.vehiclePurchase.getGrossMarginExtras(),0);
    }

    public double getTotalGrossMarginExcGst() {
        return UtilMethods.round(this.vehiclePurchase.getTotalGrossMarginExcGst(), 0);
    }

    public double getGrossMarginExtrasExcGst() {
        return UtilMethods.round(this.vehiclePurchase.getGrossMarginExtrasExcGst(),0);
    }
}
