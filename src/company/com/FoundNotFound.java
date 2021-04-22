package company.com;

import java.util.HashSet;
import java.util.Scanner;

public class FoundNotFound {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check if it is present");
        char c = sc.next().charAt(0);
        char lower = Character.toLowerCase(c);
        HashSet<Character> set = new HashSet<Character>();
        set.add('r');
        set.add('a');
        set.add('n');
        set.add('d');
        set.add('o');
        set.add('m');

        if(set.contains(lower)){
           System.out.println("FOUND");
        }else{
            System.out.println("NOT FOUND");
        }
    }
}
