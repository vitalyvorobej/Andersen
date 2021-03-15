package Patterns.prototype;

public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    Human makeCope() {
        return (Human) human.copy();
    }
}
