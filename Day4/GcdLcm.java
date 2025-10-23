import java.util.Scanner;

public class GcdLcm {
    public static int findGcd(int num1,int num2){
        while(num2!=0){
            int temp = num2;
            num2=num1%num2;
            num1=temp;
        }return num1;
    }
    public static  int findLcm(int num1,int num2){
        return (num1*num2)/ findGcd(num1,num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();

        int gcd = findGcd(num1,num2);
        int lcm = findLcm(num1,num2);
        System.out.println("Gcd is : "+gcd);
        System.out.println("Lcm is : "+lcm);
    }
}
