package company.com;

import java.util.HashSet;
import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check if it is Leap year");

        int year = sc.nextInt();

        if(year%4 ==0){
            System.out.println(+year+" is/was Leap year");
        } else {
            System.out.println(+year+" is/was not Leap year");
        }
    }
}
