package Patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Human original = new Human(18, "Katrin");
        Human copy = (Human) original.copy();

        HumanFactory factory = new HumanFactory(copy);
        Human human1 = factory.makeCope();

        System.out.println(human1);
        factory.setPrototype(new Human(20, "Valery"));
        Human human2 = factory.makeCope();
        System.out.println(human2);


    }
}
