package Access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "ObjectDemo{" +
                "num=" + num +
                ", gpa=" + gpa +
                '}';
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    public boolean equals(Object obj) {
//        return this.num ==((ObjectDemo)obj).num;
//    }


//    @Override
//    public boolean equals(Object obj) {
//        return obj.equals(num);
//    }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(gpa);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {

         ObjectDemo obj1 = new ObjectDemo(22,56.8f);
          ObjectDemo obj2  = new ObjectDemo(22,78.9f);

//        if (obj1 == obj2) {
//            System.out.println("obj1 is equals ==  to obj2");
//        }

//        if (obj1.equals(obj2)) {
//            System.out.println("obj1 is equals to obj2");
//        }

        if (obj1.equals(obj2.gpa)) {
            System.out.println("obj1 is equals to obj2 in gpa");
        }else {
            System.out.println("obj1 is not equals to obj2 in gpa");
        }

//        if (obj1.equals(obj2.num)) {
//            System.out.println("obj1 is equals to obj2 in num");
//        }

        System.out.println(obj1.getClass().getName());

    }
}
