package task_2.type.fuel;

import task_2.type.VehicleType;

public class VehicleTypeByFuelTypes extends VehicleType {
    public VehicleTypeByFuelTypes(String attribute) {
        super(attribute);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        VehicleTypeByFuelTypes that = (VehicleTypeByFuelTypes) object;
        return attribute != null && attribute.equals(that.attribute);
    }
}
