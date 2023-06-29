package Access;

public class SubClass extends A{

    public SubClass(String name, int a, int b, int c) {
        super(name, a, b, c);
    }

    public static void main(String[] args) {
          SubClass sub = new SubClass("Sankalp Selokar",22,33,44);
          int n = sub.a;

        System.out.println(n);

        System.out.println(sub instanceof SubClass);

        System.out.println(sub instanceof A);    }
}
