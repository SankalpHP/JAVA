package InterfaceExtends;

public class Main implements C{
    @Override
    public void Greeting() {
        System.out.println("Methods in A extends in B");
    }

    @Override
    public void Phrase() {
        System.out.println("Methods in B extends in C");
    }

    @Override
    public void Wishes() {
        System.out.println("Implements C in this Main Class");
    }
}
