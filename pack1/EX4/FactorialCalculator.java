package pack1.EX4;

public class FactorialCalculator {

    public int factorial(int number){

        if (number < 0){
            throw new IllegalArgumentException("number can not be negative!");
        }
        if (number ==0 || number == 1){
            return 1;
        }
        return number * factorial(number-1);
    }
}
