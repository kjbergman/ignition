package co.nz.ignite.dtoLayer;

/**
 * Created by jesperbergman on 2018-03-24.
 */
public class ExtraEquipmentDTO {
    private String name;
    private double price;
    private double actualCost;
    private boolean included;

    public ExtraEquipmentDTO(String name, double price, double actualCost, boolean included) {
        this.name = name;
        this.price = price;
        this.actualCost = actualCost;
        this.included = included;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getActualCost() {
        return actualCost;
    }

    public void setActualCost(double actualCost) {
        this.actualCost = actualCost;
    }

    public boolean isIncluded() {
        return included;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }
}
