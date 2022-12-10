package task_2.type.body;

import task_2.type.VehicleTypeEnum;

public class WagonType extends VehicleTypeByBodyTypes {
    public WagonType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
