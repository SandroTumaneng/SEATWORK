class Student {
    String name;
    int grade;
    String section;

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Section: " + section);
    }
}

public class seatworkSix {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Sandro Tumaneng";
        s1.grade = 11;
        s1.section = "A2";

        try {
            s1.displayInfo();
        } catch (NullPointerException e) {
            System.out.println("Error: Student object is null");
        }
    }
}