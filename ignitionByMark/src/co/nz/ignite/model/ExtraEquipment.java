package co.nz.ignite.model;

import co.nz.ignite.dtoLayer.ExtraEquipmentDTO;

import java.util.ArrayList;

class ExtraEquipment {
    private ArrayList<Equipment> equipments;
    private double accumulatedActualCost;
    private double accumulatedPrice;

    ExtraEquipment(ArrayList<ExtraEquipmentDTO> extraEquipmentDTOS) {
        this.equipments = new ArrayList<>();
        this.accumulatedActualCost = 0;
        this.accumulatedPrice = 0;
        deriveIncludedExtras(extraEquipmentDTOS);
    }

    private void deriveIncludedExtras(ArrayList<ExtraEquipmentDTO> extraEquipmentDTOS){
        for (ExtraEquipmentDTO dtoObject: extraEquipmentDTOS) {
            if (dtoObject.isIncluded()){
                this.accumulatedActualCost += dtoObject.getActualCost();
                this.accumulatedPrice += dtoObject.getPrice();
                this.equipments.add(new Equipment(dtoObject.getName(), dtoObject.getPrice(), dtoObject.getActualCost()));
            }
        }
    }

    ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    double getAccumulatedActualCost() {
        return accumulatedActualCost;
    }

    double getAccumulatedPrice() {
        return accumulatedPrice;
    }
}
