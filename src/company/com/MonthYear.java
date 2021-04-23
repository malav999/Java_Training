package company.com;

import java.util.HashMap;
import java.util.Scanner;

public class MonthYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month");
        int month = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        String monthArr [] = new String[]{" ", "January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
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

        if(!map.containsKey(month)){
            System.out.println("Invalid Details");
        } else if(month == 2 && year%4 ==0){
            System.out.println(monthArr[month] +" "+year+" has 29 days.");
        } else if(month == 2 && year%4 !=0){
            System.out.println(monthArr[month] +" "+year+" has 29 days.");
        } else {
            System.out.println(monthArr[month] +" " + year + " has "+ map.get(month) +" days.");
        }
    }
}
