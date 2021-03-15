package Patterns.delegate;

public class Triangle implements Graphics{
    @Override
    public void draw() {
        System.out.println("This is triangle");
    }
}
