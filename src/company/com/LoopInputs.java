package company.com;

import java.util.Scanner;

public class LoopInputs {
    public static void main(String[] args) {
        System.out.println("Start Entering 10 numbers one by one to get the average");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i<10; i++){
            int n = sc.nextInt();
            System.out.println("You entered " + n);
            sum +=n;
        }

        System.out.println("Average of entered 10 numbers in " + sum/10);
    }
}
