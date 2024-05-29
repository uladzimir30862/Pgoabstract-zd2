public class Cat extends Animal implements Moveable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public void start() {
        System.out.println(name + " starts moving.");
    }

    @Override
    public void stop() {
        System.out.println(name + " stops moving.");
    }
}
