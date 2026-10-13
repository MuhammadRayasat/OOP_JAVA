import java.util.Scanner;

// Class
class studentdata {

    // Attributes
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// Main class

public class classandobjectruntimevalue {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create Student object
        studentdata student1 = new studentdata();

        // Taking runtime input from user
        System.out.print("Enter Student Name: ");
        student1.name = input.nextLine();

        System.out.print("Enter Student Age: ");
        student1.age = input.nextInt();

        // Calling method using object
        student1.displayInfo();

        // Close Scanner
        input.close();
    }
} 
    
