package InterfaceExtends;

public interface DifferConcept {

    // static , default interface methods should always have a body
    // call via the interface name

    static void Hello() {
        System.out.println("Hello Kunal");
    }

    default void Wish() {
        System.out.println("Happy Birthday Kunal");
    }
}
