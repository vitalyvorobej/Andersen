package Patterns.delegate;

public class Square implements Graphics{
    @Override
    public void draw() {
        System.out.println("This is square");
    }
}
