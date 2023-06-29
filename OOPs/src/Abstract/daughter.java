package Abstract;

public class daughter extends parent{
    public daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("daughter wants to be a coder");
    }

    @Override
    void partner() {
        System.out.println("she loves to eat ice-cream");
    }
}
