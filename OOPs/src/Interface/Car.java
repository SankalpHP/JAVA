package Interface;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("apply brake");
    }

    @Override
    public void start() {
        System.out.println("Cars starts");
    }

    @Override
    public void end() {
        System.out.println("cars Stops");
    }

    @Override
    public void acc() {
        System.out.println("cars speeds up");
    }
}
