class Multiply {
    int multiply(int a, int b) {
        return a * b;
    }
    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class MultiplyPg {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        System.out.println("Multiplication of 2 numbers: " + m.multiply(5, 10));
        System.out.println("Multiplication of 3 numbers: " + m.multiply(5, 10, 2));
    }
}