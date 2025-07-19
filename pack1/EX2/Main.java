package pack1.EX2;

import java.util.Scanner;

import static pack1.EX2.PalindromeChecker.isPalindrome;

public class Main {
    public static void main(String[] args) {

        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        s = scanner.nextLine();

        if (isPalindrome(s)) {
            System.out.println(s + " is palindrome ");
        } else {
            System.out.println(s + " is not palindrome");
        }

    }
}
