package task_2.type.fuel;

import task_2.type.VehicleTypeEnum;

public class HybridType extends VehicleTypeByFuelTypes {
    public HybridType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
