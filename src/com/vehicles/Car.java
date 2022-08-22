package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {
    private String type;


    public Car(String vehicleName, String vehicleModelName, String vehicleType, String type) {
        super(vehicleName, vehicleModelName, vehicleType);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int maxSpeed(String type){
        if (type.equals("sportsCar")){
            return 250;
        }
        else if(type.equals("sedan")){
            return 170;
        }
        else {
            return 0;
        }
    }
    @Override
    public String getManufacturerInformation(){
        return "{Manufacturer name:"+getVehicleName()+",Model name:"+getVehicleModelName()
                +",Type:"+getType()+"}";
    }
}
