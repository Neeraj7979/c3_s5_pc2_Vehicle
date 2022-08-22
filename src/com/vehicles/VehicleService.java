package com.vehicles;

public class VehicleService {
    public static void main(String[] args) {
        Bike b1=new Bike("Honda Motors","Racing Pro","Bike","sportsBike");
        System.out.println("Car type is "+ b1.getType()+" its speed is "+b1.maxSpeed(b1.getType()));
        System.out.println(b1.getManufacturerInformation());

        Car c1=new Car("Kia Motors","Seltos","Car","sportsCar");
        System.out.println("Car type is "+ c1.getType()+" its speed is "+c1.maxSpeed(c1.getType()));
        System.out.println(c1.getManufacturerInformation());
    }
}
