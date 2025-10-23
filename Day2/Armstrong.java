import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int num){
        int originalNum = num;
        int result=0;
        int digits=0;

        int temp=num;
        while (temp!=0){
            temp/=10;
            digits++;

        }
        temp=num;
        while(temp!=0){
            int digit = temp%10;
            result +=Math.pow(digit,digits);
            temp /=10;
        }
      if(originalNum==result){
          return true;
      }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check whether is armstrong");
        int num = sc.nextInt();
        boolean res = isArmstrong(num);
        if(res){
            System.out.println("the given number is armstrong");
        }else{
            System.out.println("the given number is not armstrong");
        }

    }
}
