package company.com;

import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 3 == 0)
            System.out.println("Consultadd JAVA Training");
        else if (n % 3 == 0)
            System.out.println("Consultadd");
        else if (n % 5 == 0)
            System.out.println("JAVA Training");
        else
            System.out.println("Number is neither divided by 3 or 5");
    }
}
