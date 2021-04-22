package company.com;

import java.util.Scanner;
class BasicCalculator
{
    public static void main(String arg[])
    {
        int x= 0;
        int y=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice \n1.add \n2.sub \n3.mul \n4.div");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter first number");
                x=sc.nextInt();
                System.out.println("Enter second number");
                y=sc.nextInt();
                x=x+y;
                System.out.println("result is="+x);
                break;

            case 2:
                System.out.println("Enter first number");
                x=sc.nextInt();
                System.out.println("Enter second number");
                y=sc.nextInt();
                x=x-y;
                System.out.println("result is="+x);
                break;

            case 3:
                System.out.println("Enter first number");
                x=sc.nextInt();
                System.out.println("Enter second number");
                y=sc.nextInt();
                x=x*y;
                System.out.println("result is="+x);
                break;

            case 4:
                System.out.println("Enter first number");
                x=sc.nextInt();
                System.out.println("Enter second number");
                y=sc.nextInt();
                x=x/y;
                System.out.println("result is="+x);
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}