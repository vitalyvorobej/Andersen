package Patterns.builder;

public class FordMondeoBuilder extends CarBuilder {

    @Override
    void buildMark() {
        car.setMark("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(200);
    }
}
