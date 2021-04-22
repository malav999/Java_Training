package company.com;

import java.util.Scanner;

public class OldNew {
    public static void main(String args[]){

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 != 0){
            System.out.println("NEW");
        } else if(n>=2 && n<=5 && n%2 == 0){
            System.out.println("OLD");
        }else if(n>=6 && n<=30 && n%2 == 0){
            System.out.println("NEW");
        } else if(n>=30 && n%2 == 0){
            System.out.println("OLD");
        }
    }
}
