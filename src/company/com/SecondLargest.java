package company.com;

public class SecondLargest {
    public static void main(String[] args) {
        int arr [] = new int []{1,9,7,5,2,5};

        for(int i = 0; i< arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++)
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("Second largest element in the given array is -: "+arr[arr.length - 2]);
    }
}
