class Student {

    String name;
    int age;
    int rollno;
    int marks;

    Student(String name, int age, int rollno, int marks) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.marks = marks;
        
    }

    void displayInfo() {
        System.out.println("-".repeat(30));
        System.out.println("Student Name: " + name
                + "\nStudent Age: " + age
                + "\nStudent Roll No.: " + rollno
                + "\nStudent Marks: " + marks);
    }
}

public class classandobject1 {
    public static void main(String[] args) {
        
        Student student1 = new Student("Muhammad Rayasat",19,82,86);
        Student student2 = new Student("ali",12,37,29);
        


        student1.displayInfo();
    }
}