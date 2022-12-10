package task_2.type.body;

import task_2.type.VehicleTypeEnum;

public class SedanType extends VehicleTypeByBodyTypes {
    public SedanType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
