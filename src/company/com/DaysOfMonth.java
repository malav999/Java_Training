package company.com;

import java.util.HashMap;
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        // Enter number between 1-12 corresponding to the 12 months
        // And get the number of days for the entered month number
        System.out.println("Enter month number");
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1,31);
        map.put(2,28);
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);

        if(map.containsKey(month)){
            System.out.println("Given month " +month+ " has " + map.get(month) + " days in it." );
        }else{
            System.out.println("Invalid Details");
        }
    }
}
