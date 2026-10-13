
class Parent {
    Parent(int x) {
        System.out.println("Parent: " + x);
    }

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
        super(10);
        System.out.println("Child Constructor End");
    }
}

public class inhcon {
    public static void main(String[] args) {
        Child obj = new Child();

    }
}
