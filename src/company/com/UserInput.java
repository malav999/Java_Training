package company.com;

import java.util.Scanner;

public class UserInput {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name \n");
        String name = sc.next();
        System.out.println("Please enter your age");
        int age = sc.nextInt();

        System.out.println(name + "'s age is " + age + "\n");
        System.out.println("Thank you for the information");
    }
}
