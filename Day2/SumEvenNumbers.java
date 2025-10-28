package Day2;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = n * (n + 1); // Formula: n*(n+1)
        System.out.println("Sum of first " + n + " even numbers = " + sum);
    }
}
