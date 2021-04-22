package company.com;

import java.util.Scanner;

public class LoopInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            System.out.println("Enter a number");
            System.out.println("Thanks for entering " + sc.nextInt());
        }
        System.out.println("You have entered 10 numbers.");
    }
}
