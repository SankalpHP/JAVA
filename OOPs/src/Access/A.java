package Access;

public class A {

    private String name;
    protected int a;
    public int b;
    int c;

    public String getName() {
        return name;
    }

    public A(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
