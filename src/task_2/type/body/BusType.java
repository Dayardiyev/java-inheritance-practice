package task_2.type.body;

import task_2.type.VehicleTypeEnum;

public class BusType extends VehicleTypeByBodyTypes {
    public BusType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
