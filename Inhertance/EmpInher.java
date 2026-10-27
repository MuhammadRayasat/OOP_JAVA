import java.util.Scanner;
class Post { //Composition
    private String title;
    private double salary;

    void setsalary(double sal){
        salary = sal;
    }

    double getsalary(){
        return salary;
    }

    void settitle(String t){
        title = t;
    }

    String gettitle(){
        return title;
    }
}

class Employee{
    String name;
    int age;
    Post p;

    Employee(String n, int a, double sal, String t){
        name = n;
        age = a;
        p = new Post();
        p.setsalary(sal);
        p.settitle(t);
    }

}

public class EmpInher {
    public static void main(String[] args) {
     Employee e = new Employee("John", 30, 50000, "Manager");
     System.out.println("Employee Name: " + e.name); 
     System.out.println("Employee Age: " + e.age);
     System.out.println("Employee Salary: " + e.p.getsalary());
     System.out.println("Employee Title: " + e.p.gettitle());
    }
}