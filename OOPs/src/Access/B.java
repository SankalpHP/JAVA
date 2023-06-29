package Access;

public class B extends A {

    public String Post;

    public B(String name, int a, int b, int c) {
        super(name, a, b, c);
    }

    public static void main(String[] args) {
        B b  = new B("Sankalp Selokar",22,23,33);
        System.out.println(b.getName());
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);

    }


}
