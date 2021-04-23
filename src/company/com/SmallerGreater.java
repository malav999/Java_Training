package company.com;

import java.util.Scanner;

public class SmallerGreater {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to check for smaller and greater");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd no.");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd no.");
        int n3 = sc.nextInt();

        if(n1>n2 && n1>n3 && n2>n3){
            System.out.println("INCREASING");
        } else if (n3>n2 && n3>n1 && n2>n1){
            System.out.println("DECREASING");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }
}
