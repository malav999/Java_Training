package company.com;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to get the multiplication result");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Multiplication of the given numbers is " + n1*n2);
    }
}
