package task_2.type.fuel;

import task_2.type.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelTypes {
    public PetrolType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
