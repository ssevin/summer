
import java.util.Scanner;
import java.lang.Math;

public class EX1_1404_4_22 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int number;
            int countOfBooks;
            double debt = 0;
            int totalDebt =0;

            System.out.println("Welcome to the book delivery program.");

            System.out.println("Enter the number of books you want to deliver:");
            countOfBooks = scanner.nextInt();

            for (int i=1 ; i<= countOfBooks ; i++) {
                System.out.println("----- Book " + i + "-----" );
                System.out.println("Number of days late:");
                number = scanner.nextInt();

                if (number < 7) {
                    debt = number * 500;
                } else if (number > 7 && number < 14) {
                    debt = (number * 1000) + ((number * 10) / 100);
                } else if (number > 14) {
                    debt = (number * 2000) + ((number * 20) / 100);
                }

                int roundedDebt = (int) Math.round(debt);
                System.out.println("penalty for this book " + roundedDebt + " toman");
                totalDebt += roundedDebt;
            }
            System.out.println("---------------------------");
            System.out.println("Total penalty payable " + totalDebt + " toman");
        }
    }

