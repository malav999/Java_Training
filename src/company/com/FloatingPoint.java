package company.com;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class FloatingPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter a number");
        float n = sc.nextFloat();
        String s1 = "";
        String s2 = "";

        if (n == 0){
                s1 = "Zero";
        }

        if (n > 0){
            s1 = "Positive";
        } else if (n <0 ){
            s1 = "Negative";
        }

        if(n<1){
            s2 = "small";
        } else if(n>1000000){
            s2 = "large";
        }

        if(s1.length() > 0 && s2.length() > 0){
            System.out.println(s1 +" " +s2);
        } else {
            System.out.println(s1);
        }
    }
}

