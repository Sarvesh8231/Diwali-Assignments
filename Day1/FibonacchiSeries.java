import java.util.Scanner;

public class FibonacchiSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("enter limit to print series");
        int limit = sc.nextInt();
        for(int i=0;i<=limit;i++){
            System.out.print(a+", ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
