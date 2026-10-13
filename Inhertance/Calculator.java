import java.util.Scanner;
class ScientificCalculator extends Calculator {
    double square(double a) {
        return a * a;
    }
    double power(double a, double b) {
        return Math.pow(a, b);
    }
    double squareRoot(double a) {
        return Math.sqrt(a);
    }

}

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    int substract(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    double divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator();
        sc.power(7, 2);

    }
}