class Base {
    Base(int x) {
        System.out.println("Base constructor value: " + x);
    }
}

class Derived extends Base {
    Derived() {
        super(100);
        System.out.println("Derived constructor");
    }
}
public class SuperConstructor {
    public static void main(String[] args) {
        new Derived();
    }
}
