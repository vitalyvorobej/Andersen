package Patterns.abstractFactory;

public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("щелчок мышью");
    }

    @Override
    public void dbclick() {
        System.out.println("двойной щелчок мышью");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("скролим вверх");
        } else {
            System.out.println("скролим вниз");
        }
    }
}
