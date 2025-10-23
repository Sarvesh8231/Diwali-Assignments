import java.util.Scanner;

public class SumFirstEven {
    public static int additionEven(int num){
        int sum =0;
        for(int i=0;i<=num;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit to add even numbers");
        int limit = sc.nextInt();
        int res = additionEven(limit);
        System.out.println("sum is : "+res);
    }
}
