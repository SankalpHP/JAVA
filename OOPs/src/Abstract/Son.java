package Abstract;

public class Son extends parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("Son wants be a doctor");
    }

    @Override
    void partner() {
        System.out.println("He loves Cricket");
    }
}
