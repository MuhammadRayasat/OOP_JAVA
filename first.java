public class first {
    public static void main(String[] args) { //main funtion
        greet();
         
        Student s1 = new Student(); 
        s1.name = "Muhammad Rayasat";
        s1.age = 20; 
        s1.study(); 
        
    }

    public static void greet() { // Method or userdefined function
    System.out.println("Welcome to Java World!");
    System.out.println("Let's Create a class and object");
}
}

class Student {
    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
        System.out.println("He is " + age + " years old");
    }
}