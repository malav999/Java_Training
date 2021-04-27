package company.com;

import java.util.ArrayList;

public class MoveZeros {
    public static void main(String[] args) {
        int arr []= {1,0,0,2,3,4,0,5,6,0,0};

        ArrayList<Integer> list = new ArrayList<>();
        int out [] = new int [arr.length];
        int idx = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i]!=0){
                out[idx] = arr[i];
                idx++;
            }
        }

        for(int i = idx; i< arr.length; i++) {
            out[i] = 0;
        }

        for(int i = 0; i< arr.length; i++) {
            System.out.println(out[i]);
        }
    }
}