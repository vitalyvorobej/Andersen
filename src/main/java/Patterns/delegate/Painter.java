package Patterns.delegate;

public class Painter {
    Graphics graphics;

    void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    void draw() {
        graphics.draw();
    }
}
