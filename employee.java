import java.util.Scanner;


public class employee {
    public static void main(String[] args) {
        emp_data emp1 = new emp_data();
        emp1.datain();
        emp1.dataout();
    }
}

class emp_data{
    String name;
    int age;
    int contact;
    String gen;
    String design;
    String address;

    void datain(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age: "); 
        age = input.nextInt();
        System.out.println("Enter your contact number: ");
        contact = input.nextInt();
        System.out.println("Enter your gender: ");
        gen = input.nextLine();
        System.out.println("Enter your designation: ");
        design = input.nextLine();
        System.out.println("Enter your address: "); 
        address = input.nextLine();

    }

    void dataout(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contact);
        System.out.println("Gender: " + gen);
        System.out.println("Designation: " + design);
        System.out.println("Address: " + address);
    }
}