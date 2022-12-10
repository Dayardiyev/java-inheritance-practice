package task_2.type.purpose;

import task_2.type.VehicleTypeEnum;

public class CarType extends VehicleTypeByPurpose {
    public CarType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
