package company.com;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr [] = new int []{2,2,3,3,4,4,4,11,11,11,11};

        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
