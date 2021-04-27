package company.com;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter no of rows to form Pascals triangle");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int spaces = rows;
        int k = 1;
        for(int i = 0; i < rows; i++) {
            for(int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            k = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(k + " ");
                k = k * (i-j)/(j+1);
            }
            spaces--;

            System.out.println();
        }
    }
}