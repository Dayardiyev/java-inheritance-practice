package task_2.type.fuel;

import task_2.type.VehicleTypeEnum;

public class DieselType extends VehicleTypeByFuelTypes {
    public DieselType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
