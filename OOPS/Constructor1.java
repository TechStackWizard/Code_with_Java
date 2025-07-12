package OOPS;

public class Constructor1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Anshul");
        // System.out.println(s2.name);
        s1.name = "Anshul";
        s1.roll = 123;
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 85;

        Student s3 = new Student(s1);
        s1.marks[1] = 90;
        for (int i = 0; i < 3; i++) {
            System.out.print(s3.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int roll;
    int marks[];

    // Constructor Overloading
    Student() { // Non-parameterized Constructor
        marks = new int[3];
        System.out.println("Constructor Called...");
    }

    //parameterized Constructor
    Student(String name){
    this.name = name;
    }
    Student(int roll){
    this.roll = roll;
    }

    // Copy Constructor or shallow copy Constructor
    Student(Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
    }

    // Deep Copy
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = 236;

        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
