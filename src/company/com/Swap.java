package company.com;

public class Swap {
    public static void main(String args[]){
        twoVariables();
        threeVariables();
    }

    public static void twoVariables(){
        int p=20;
        int q=200;
        System.out.println("Numbers before swapping");
        System.out.println("p: "+ p + "\n q: " +q);

        p=p+q;
        q=p-q;
        p=p-q;

        System.out.println("Numbers after swapping");
        System.out.println("p: "+ p + "\n q: " +q);
    }

    public static void threeVariables(){
        int x = 2;
        int y = 1;

        // using 3 variables
        System.out.println("Numbers before swapping");
        System.out.println("x: "+ x + "\n y: " +y);
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Numbers after swapping");
        System.out.println("x: "+ x + "\n y: " +y);
    }
}
