package company.com;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n;
        do {
             n = sc.nextInt();
                if(n<0){
                    System.out.println("It's Over");
                    break;
                }
                System.out.println("Good Going");

        } while (true);
    }
}
