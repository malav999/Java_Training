package company.com;

import java.util.Scanner;

public class AdditionResult {
        public static void main(String args[]) {
            System.out.println("Addition of two numbers");
            input();
        }

        public static void input(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number between 1 to 10");
            int a = sc.nextInt();
            System.out.println("Enter second number between 1 to 10");
            int b = sc.nextInt();
            checkForRange(a,b);
        }

        public static void checkForRange(int a, int b){
            if(a<1 || a>10 || b<1 || b>10){
                System.out.println("\n\nInvalid input");
                System.out.println("\nEnter the number in given range (1-10)");
                input();
            } else {
                add(a, b);
            }
        }

        public static void add(int a, int b){
            int z = a+b;
            int results = z + 30;

            System.out.println("Result: "+ results);
        }
}


