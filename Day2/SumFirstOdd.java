import java.util.Scanner;

public class SumFirstOdd {
    public static int additionOdd(int num){
        int sum =0;
        for(int i=0;i<=num;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit to add odd numbers");
        int limit = sc.nextInt();
        int res = additionOdd(limit);
        System.out.println("sum is : "+res);
    }
}
