package task_2.type.fuel;

import task_2.type.VehicleTypeEnum;

public class ElectricType extends VehicleTypeByFuelTypes {
    public ElectricType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
