package Patterns.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SubaruBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}
