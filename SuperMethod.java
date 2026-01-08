class A {
    void display() {
        System.out.println("Class A display");
    }
}

class B extends A {
    void display() {
        super.display();
        System.out.println("Class B display");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
