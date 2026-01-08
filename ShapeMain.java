import java.util.Scanner;

interface ishape {
    void draw();
    void move();
}

class Circle implements ishape {
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void move() {
        System.out.println("Moving Circle");
    }
}

class Rectangle implements ishape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void move() {
        System.out.println("Moving Rectangle");
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ishape s;

        System.out.print("Enter choice (1-Circle, 2-Rectangle): ");
        int ch = sc.nextInt();

        if (ch == 1)
            s = new Circle();
        else
            s = new Rectangle();

        s.draw();
        s.move();
    }
}
