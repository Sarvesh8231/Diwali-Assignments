import java.util.Scanner;

public class Pattern {
    public static void printPattern(int rows){
        for(int i=0;i<rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }for(int k=0;k<=i;k++){
                System.out.print(k);
            }
            for(int k=0;k<i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        printPattern(rows);

    }
}
