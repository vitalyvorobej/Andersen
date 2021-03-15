package Patterns.delegate;

public class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("This is circle");
    }
}
