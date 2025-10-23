import java.util.Scanner;

public class CheckPrime {
    public static boolean isprime(int num){
        if(num<2){
            return false;
        }else{
            for (int i=2;i<=num/2;i++){
                if(num %i==0){
                    return false;
                }

            }
        } return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check prime");
        int num = sc.nextInt();
        boolean status =isprime(num);
        System.out.println(status);
    }
}
