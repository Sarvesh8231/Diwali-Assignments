package Day7;

import java.util.Scanner;

public class CheckAlphanumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isAlphanumeric(input)) {
            System.out.println("The string is alphanumeric.");
        } else {
            System.out.println("The string contains non-alphanumeric characters.");
        }

        sc.close();
    }

    public static boolean isAlphanumeric(String str) {
        return str.matches("[a-zA-Z0-9]+");
    }
}
