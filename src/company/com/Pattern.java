package company.com;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter no of rows to form right angle triangle");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 0; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

