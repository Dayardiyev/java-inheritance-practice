package task_2;

import task_2.type.VehicleTypeEnum;
import task_2.type.body.PickupType;
import task_2.type.body.SedanType;
import task_2.type.fuel.DieselType;
import task_2.type.fuel.ElectricType;
import task_2.type.fuel.PetrolType;
import task_2.type.purpose.PassengerType;
import task_2.type.purpose.TruckType;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", 123, new PassengerType(VehicleTypeEnum.PASSENGER.name()),
                new SedanType(VehicleTypeEnum.SEDAN.name()), new PetrolType(VehicleTypeEnum.PETROL.name()));
        VehicleAd kamazAd = new VehicleAd("Kamaz", 45, new TruckType(VehicleTypeEnum.TRUCK.name()),
                new PickupType(VehicleTypeEnum.PICKUP.name()), new DieselType(VehicleTypeEnum.DIESEL.name()));
        VehicleAd teslaAd = new VehicleAd("Tesla", 666, new PassengerType(VehicleTypeEnum.PASSENGER.name()),
                new SedanType(VehicleTypeEnum.SEDAN.name()), new ElectricType(VehicleTypeEnum.ELECTRIC.name()));

        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd, teslaAd});

        adsService.filterByVehicleTypeByFuelTypes(new ElectricType(VehicleTypeEnum.ELECTRIC.name()));

        adsService.filterByVehicleTypeByPurpose(new PassengerType(VehicleTypeEnum.PASSENGER.name()));

        adsService.filterByVehicleTypeByBodyTypes(new PickupType(VehicleTypeEnum.PICKUP.name()));

    }
}
