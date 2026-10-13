import java.util.Scanner;
public class constructor {
    constructor() {
        System.out.println("Constructor called! ");
        display();
    }

    void display() {
        System.out.println("This is a method inside the constructor class.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        constructor obj = new constructor();    
    }
}