package Patterns.builder;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCat();
        builder.buildMark();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}
