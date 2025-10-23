import java.util.Scanner;

public class SumDigit {
    public static int digitSum(int num){
        int sum = 0;
        while(num!=0){
            int rem = num%10;
            sum = sum +rem;
            num/=10;
        }
      return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int res = digitSum(num);
        System.out.println("sum of digits : "+res);

    }
}
