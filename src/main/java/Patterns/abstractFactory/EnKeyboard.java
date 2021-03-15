package Patterns.abstractFactory;

public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("print string");
    }

    @Override
    public void println() {
        System.out.println("print string with new line");
    }
}
