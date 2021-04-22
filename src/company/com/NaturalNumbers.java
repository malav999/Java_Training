package company.com;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number greater than 0");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Numbers are as follows");
        for( int i = 1; i <=n; i++){
            System.out.println(i);
            sum += i;
        }

        System.out.println("Sum of n natural no. is " + sum);
    }
}
