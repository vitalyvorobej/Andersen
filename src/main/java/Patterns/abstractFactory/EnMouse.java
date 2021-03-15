package Patterns.abstractFactory;

public class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void dbclick() {
        System.out.println("Double click");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Move to top");
        } else {
            System.out.println("Move to down");
        }
    }
}
