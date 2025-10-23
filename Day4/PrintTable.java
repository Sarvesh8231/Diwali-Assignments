import java.util.Scanner;

public class PrintTable {
    public static void printTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num +" X "+i+" = "+num*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        printTable(num);
    }
}
