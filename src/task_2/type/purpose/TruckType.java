package task_2.type.purpose;

import task_2.type.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {

    public TruckType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
