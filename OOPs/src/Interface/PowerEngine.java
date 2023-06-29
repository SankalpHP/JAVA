package Interface;

public class PowerEngine implements  Engine{
    @Override
    public void start() {
        System.out.println("starts Power Engine");
    }

    @Override
    public void end() {
        System.out.println("ends Power Engine");
    }

    @Override
    public void acc() {
        System.out.println("Acc Power Engine");
    }
}
