package company.com;

public class DivisibleBy7 {
    public static void main(String args[]){
        for(int i = 2000; i<3200; i++){
            if(i % 7 == 0 && i % 5 != 0){
                System.out.println(i);
            }
        }
    }
}
