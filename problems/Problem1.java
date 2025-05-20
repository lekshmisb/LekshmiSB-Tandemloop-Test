package problems;

import java.util.Scanner;

public class Problem1 
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = sc.nextDouble();
        System.out.print("Enter number b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add/sub/mul/div): ");
        String op = sc.next();

        Calculator calc = new Calculator();
        switch(op) {
            case "add": System.out.println("Result: " + calc.add(a, b)); break;
            case "sub": System.out.println("Result: " + calc.sub(a, b)); break;
            case "mul": System.out.println("Result: " + calc.mul(a, b)); break;
            case "div": System.out.println("Result: " + calc.div(a, b)); break;
            default: System.out.println("Invalid operation");
        }
        sc.close();
    }
}

class Calculator {
    public double add(double a, double b) { return a + b; }
    public double sub(double a, double b) { return a - b; }
    public double mul(double a, double b) { return a * b; }
    public double div(double a, double b) {
        if (b == 0) return 0;
        return a / b;
    }

}
