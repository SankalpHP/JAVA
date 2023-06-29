package Interface;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("starts Electric Engine");
    }

    @Override
    public void end() {
        System.out.println("end Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("acc Electric Engine");
    }
}
