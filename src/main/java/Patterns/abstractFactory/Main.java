package Patterns.abstractFactory;

public class Main {
/**
 *
 * Абстрактная фабрика - используется для создания семейства объектов
 * Фабричный метод - используется для создания кирпичика из семейства
 *
 * */




    public static void main(String[] args) {
        DeviceFactory deviceFactory = new RuDeviceFactory();
        Mouse m = deviceFactory.getMouse();
        Keyboard k = deviceFactory.getKeyboard();
        Touchpad t = deviceFactory.getTouchpad();
        m.click();
        k.print();
        t.track(5, 4);
    }
}
