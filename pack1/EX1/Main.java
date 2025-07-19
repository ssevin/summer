package pack1.EX1;

public class Main {
    public static void main(String[] args) {

        averageCalculator a = new averageCalculator();

        int[] numbers = {5 , 10 , 15 , 20 , 25};
        int average = a.calculateAverage(numbers);

        System.out.println("average is: " + average);

    }
}
