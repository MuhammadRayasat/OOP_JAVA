import java.util.Scanner;
class UniversityPersonal {
    String name;
    int age;
    String gender;

    UniversityPersonal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends UniversityPersonal {
    String degreeProgram;
    double cgpa;
    int semester;
    Student(String name, int age, String gender, String degreeProgram, double cgpa, int semester) {
        super(name, age, gender);
        this.degreeProgram = degreeProgram;
        this.cgpa = cgpa;
        this.semester = semester;
    }

    void displayinfo() {
        System.out.println("---Student Information---");
        super.displayinfo();
        System.out.println("Degree Program: " + degreeProgram);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Semester: " + semester);
    }

}

class Teacher extends UniversityPersonal {
    String designation;;
    double salary;
    String department;

    Teacher(String name, int age, String gender, String designation, double salary, String department) {
        super(name, age, gender);
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    void displayinfo() {
        System.out.println("---Teacher Information---");
        super.displayinfo();
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class universityManagement {
    public static void main(String[] args) {
        Student student = new Student("Muhammad Rayasat", 19, "Male", "BSCS", 3.5, 2);
        Teacher teacher = new Teacher("Sir Nasir", 34, "Male", "Professor", 100000.0, "Computer Science");
        
        student.displayinfo();
        teacher.displayinfo();
    }
}