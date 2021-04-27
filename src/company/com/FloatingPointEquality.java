package company.com;

import java.util.Scanner;

public class FloatingPointEquality {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first floating no.: ");
        double num1 = sc.nextDouble();
        System.out.print("Input second floating no.: ");
        double num2 = sc.nextDouble();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}
