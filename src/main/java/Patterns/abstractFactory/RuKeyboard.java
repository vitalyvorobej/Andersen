package Patterns.abstractFactory;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Печатаем строку");
    }

    @Override
    public void println() {
        System.out.println("печатаем строку с переходом на новую строчку");
    }
}
