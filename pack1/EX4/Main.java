package pack1.EX4;

import javax.imageio.IIOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FactorialCalculator f = new FactorialCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        try {
            int n = scanner.nextInt();
            long result = f.factorial(n);
            System.out.println(n + "! = " + result);
        }catch (IllegalArgumentException e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
