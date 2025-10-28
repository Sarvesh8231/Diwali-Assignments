package Day2;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = n * n; // Formula: n²
        System.out.println("Sum of first " + n + " odd numbers = " + sum);
    }
}
