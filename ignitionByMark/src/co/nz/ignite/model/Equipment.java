package co.nz.ignite.model;

class Equipment {
    private String name;
    private double price;
    private double actualCost;

    public Equipment(String name, double price, double actualCost) {
        this.name = name;
        this.price = price;
        this.actualCost = actualCost;
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
}
