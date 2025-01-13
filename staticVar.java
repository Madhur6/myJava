class Student {
    // Static variable - shared across all objects
    public static String schoolName = "Global High School";

    // Non-static variable - unique for each object
    public String studentName;

    // Constructor to initialize non-static variable
    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("School Name: " + schoolName);
    }
}

public class staticVar {
    public static void main(String[] args) {
        // Creating first student object
        Student student1 = new Student("Alice");
        // Creating second student object
        Student student2 = new Student("Bob");

        // Accessing static variable via class name
        System.out.println("School Name (via class): " + Student.schoolName);

        // Accessing static and non-static variables via objects
        student1.displayInfo();
        student2.displayInfo();

        // Changing the static variable
        Student.schoolName = "International High School";

        // Both objects see the updated static variable
        student1.displayInfo();
        student2.displayInfo();
    }
}
