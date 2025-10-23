import java.util.Scanner;

public class EvenOdd {
    public static boolean checkEvenOdd(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check even or odd");
        int num = sc.nextInt();
        boolean res =checkEvenOdd(num);
        if(res == true){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
    }
}
