import java.util.Scanner;

class Student {
    int sno;
    String sname;
    String sprogram;

    // Read student details
    public void read(int no, String name, String prog) {
        sno = no;
        sname = name;
        sprogram = prog;
    }

    // Display student details
    public void display() {
        System.out.println("SNo: " + sno + ", Name: " + sname + ", Program: " + sprogram);
    }

    // Compare two students
    public boolean compare(Student s) {
        return (sno == s.sno) && sname.equals(s.sname) && sprogram.equals(s.sprogram);
    }
}

public class Pgm14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter details of Student 1 (SNo Name Program):");
        int sno1 = sc.nextInt();
        String name1 = sc.next();
        String prog1 = sc.next();
        s1.read(sno1, name1, prog1);

        System.out.println("Enter details of Student 2 (SNo Name Program):");
        int sno2 = sc.nextInt();
        String name2 = sc.next();
        String prog2 = sc.next();
        s2.read(sno2, name2, prog2);

        System.out.println("\nStudent 1:");
        s1.display();

        System.out.println("Student 2:");
        s2.display();

        System.out.println("\nAre both students equal? " + s1.compare(s2));

        sc.close();
    }
}
