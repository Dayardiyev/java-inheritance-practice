package task_2.type.purpose;

import task_2.type.VehicleTypeEnum;

public class PassengerType extends VehicleTypeByPurpose {

    public PassengerType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
