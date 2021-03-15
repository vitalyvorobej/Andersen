package Patterns.builder;

public class SubaruBuilder extends CarBuilder {
    @Override
    void buildMark() {
        car.setMark("Subaru");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(210);
    }
}
