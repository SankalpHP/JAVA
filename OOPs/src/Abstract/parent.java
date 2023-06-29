package Abstract;

public abstract class parent {

    int age;
    final int Value;

    public parent(int age) {
        this.age = age;
        this.Value = 163738;
    }

    static void hello(){
        System.out.println("Hello guys");
    }

    public void normal(String phase){
        System.out.println(phase);
    }

    abstract void career();
    abstract void partner();
}
