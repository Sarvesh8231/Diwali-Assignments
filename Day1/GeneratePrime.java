import java.util.Scanner;

public class GeneratePrime {
    public static boolean isprime(int i){
        if(i<2){
            return false;
        }else{
            for (int k=2;k<=i/2;k++){
                if( i%k==0){
                    return false;
                }

            }
        } return true;

    }
    public static void generatePrime(int num){
        for (int i=2;i<=num;i++){
            if(isprime(i)){
                System.out.print(i+" ");

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit to print prime numbers");
        int num = sc.nextInt();
        generatePrime(num);
    }
}
