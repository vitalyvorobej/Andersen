package Patterns.builder;

public abstract class CarBuilder {
    Car car;

    void createCat() {
        car = new Car();
    }

    abstract void buildMark();

    abstract void buildTransmission();

    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }
}
